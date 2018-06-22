package com.csjscm.mysqldata.service.impl;


import com.csjscm.mysqldata.model.RequestInfo;
import com.vici.HttpUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.http.HttpResponse;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * 通用API
 *
 * @author csjscm
 * create 2018-05-29 下午 2:09
 **/
@Service
@Slf4j
public class AliApiServiceImpl {
    @Value("${aliyun.api.AppCode}")
    private String aliYun_Api_AppCode;
    private final String method = "GET";

    /**
     * 查询物流详细
     * @param requestInfo
     * @return
     */
    public Map<String,Object> getGoExpress(RequestInfo requestInfo){
        String host = "https://goexpress.market.alicloudapi.com";
        String path = "/goexpress";
        Map<String, String> headers = new HashMap<>();
        headers.put("Authorization", "APPCODE " + aliYun_Api_AppCode);
        Map<String, String> querys = new HashMap<>();
        querys.put("no", requestInfo.getNo());
        querys.put("type", requestInfo.getType());

        try {

            HttpResponse response = HttpUtils.doGet(host, path, method, headers, querys);
            //System.out.println(response.toString());
            //获取response的body
            System.out.println(EntityUtils.toString(response.getEntity()));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
