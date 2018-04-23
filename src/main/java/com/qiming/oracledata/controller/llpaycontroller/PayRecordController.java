package com.qiming.oracledata.controller.llpaycontroller;

import com.qiming.oracledata.service.PayRecordService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * 付款记录查询
 *
 * @author qiming
 * create 2018-04-11 下午 2:21
 **/
@RequestMapping("/payRecord")
@RestController
@EnableAutoConfiguration
@Slf4j
public class PayRecordController {
    @Autowired
    private PayRecordService payRecordService;
    @RequestMapping(value = "/toShowBIdRefundLogs",method = RequestMethod.GET)
    public ModelAndView showBidRefundLogs(){
        log.info("========================>");
        return new ModelAndView("showBidRefundLogs");
    }
}
