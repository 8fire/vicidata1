package com.csjscm.mysqldata.controller.commoncontroller;

import com.csjscm.oracledata.model.Payment;
import com.vici.POIUtil;
import com.vici.response.ViciException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.List;

/**
 * excel操作的控制器
 *
 * @author csjscm
 * create 2018-06-14 下午 1:49
 **/
@RequestMapping("/excelApi")
@RestController
@Slf4j
public class ExcelOperateController {

    @RequestMapping(value = "/getTestData",method = RequestMethod.POST)
    public   List<String[]>  getTestData(@RequestParam("file") MultipartFile file){
        List<String[]> lists=null;
        String[] standardFieldsArr = new String[]{"商品编码", "商品名称", "规格", "型号", "单位", "采购数量", "采购单价", "税率", "备注"};
        try {
            lists = POIUtil.readExcel(file,standardFieldsArr);

            List<Payment> paymentList=new ArrayList<>();

  try{

      for(int i=0; i<lists.size(); i++) {
          Payment payment=new Payment();
          String[] list= lists.get(i);
          payment.setTicketno(list[0]);
          payment.setCheckadvice(list[1]);
          payment.setCheckuser(list[2]);
          payment.setCreatedate(list[3]);
          payment.setCreateuser(list[4]);
          payment.setEnclosure(list[6]);
          payment.setEnterprice(list[8]);
          payment.setMemos(list[7]);
          payment.setFundnature(Short.parseShort(list[5]));
          paymentList.add(payment);
      }
  }catch (Exception e){
      if(e instanceof NumberFormatException){
          throw new ViciException("请检查采购数量，采购单价，税率的数据格式是否正确");
      }else {
          throw new ViciException("格式异常");
      }

  }
      for (Payment payment1:paymentList){
          log.info("=============>"+payment1);
      }

        }catch (Exception e){
            e.printStackTrace();
        }
       return lists;
    }
}
