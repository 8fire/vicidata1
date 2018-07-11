package com.csjscm.mysqldata.controller.commoncontroller;

import com.google.common.collect.Maps;
import com.vici.FileUtils;

import com.vici.UUIDUtils;
import com.vici.response.ViciException;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import net.sf.json.JSONObject;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

/**
 * @program: vicidata
 * @description:
 * @author: 没用的阿吉
 * @create: 2018-07-10 16:24
 *
 * {
 *   "code": 0 //0表示成功，其它失败
 *   ,"msg": "" //提示信息 //一般上传失败后返回
 *   ,"data": {
 *     "src": "图片路径"
 *     ,"title": "图片名称" //可选
 *   }
 * }
 */
@RequestMapping("/file")
@RestController
@Slf4j
public class FileUploadController {
    /**
     * 在配置文件中配置的文件保存路径
     */
    @Value("${img.location}")
    private String location;

    public static void inputStreamToFile(InputStream ins, File file) {
        try {
            OutputStream os = new FileOutputStream(file);
            int bytesRead = 0;
            byte[] buffer = new byte[8192];
            while ((bytesRead = ins.read(buffer, 0, 8192)) != -1) {
                os.write(buffer, 0, bytesRead);
            }
            os.close();
            ins.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @RequestMapping(value = "/img/upload",method = RequestMethod.POST)
    public  Map<String,Object> orderExcel(HttpServletRequest request, @RequestParam("file") MultipartFile file) throws IOException {

        String fileName =file.getOriginalFilename();
        Map<String,Object> map =Maps.newHashMap();
        Map<String,Object> map2 =Maps.newHashMap();
        //读取文件
        String path="";
        try {


            //文件后缀
            String fileType = fileName.substring(fileName.lastIndexOf("."));
            fileName = UUIDUtils.getUUID() + fileType;
            //文件路径
            path = location + fileName;

            File file1 = new File(path);
            //如果文件不存在，则创建新的文件
            File fileParent = file1.getParentFile();
            if (!fileParent.exists()) {
                fileParent.mkdirs();
            }
            //读取流文件
            InputStream ins = file.getInputStream();
            inputStreamToFile(ins, file1);
        } catch (Exception e) {
            map.put("code",1);
            map.put("msg",e.getMessage());
            map.put("data",map2);
            map2.put("src",path);
            map2.put("title",fileName);
            return  map;
        }
        //0表示成功，1失败
        map.put("code",0);
        //提示消息
        map.put("msg","上传成功");
        map.put("data",map2);
        //图片url
        map2.put("src","../upload/"+fileName);
        //图片名称，这个会显示在输入框里
        map2.put("title",fileName);
        System.out.println(map);
        return map;
    }
}
