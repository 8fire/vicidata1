package com.csjscm.mysqldata.controller.commonapicontroller;

import com.csjscm.mysqldata.model.RequestInfo;
import com.csjscm.mysqldata.service.impl.AliApiServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * 一些通用的公共API
 *
 * @author csjscm
 * create 2018-05-29 上午 11:43
 **/
@RequestMapping("/commonApi")
@RestController
@Slf4j
public class AliApiController {
   @Autowired
   private AliApiServiceImpl aliApiService;

   /**
    * 跳转到yemain
    * @return
    */
   @RequestMapping(value = "/toaliyunapi",method = RequestMethod.GET)
   public ModelAndView toAliYunApi(){
      ModelAndView modelAndView=new ModelAndView();
      modelAndView.setViewName("/aliyunapi/commonApi-list");
      return modelAndView;
   }
   @RequestMapping("/getGoExpress")
   public String getGoExpress(@RequestBody RequestInfo requestInfo){
      Map<String, Object> goExpress = aliApiService.getGoExpress(requestInfo);
      return null;
   }
}
