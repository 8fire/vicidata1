package com.csjscm.mysqldata.controller.commoncontroller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @program: vicidata
 * @description: echarts图表统计
 * @author: 没用的阿吉
 * @create: 2018-07-04 10:26
 */
@RequestMapping("/echarts")
@RestController
@Slf4j
public class EchartsController {
    /**
     * 跳转到yemain
     * @return
     */
    @RequestMapping(value = "/testEcharts",method = RequestMethod.GET)
    public ModelAndView toAliYunApi(){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("/echarts/charts-6");
        return modelAndView;
    }
}
