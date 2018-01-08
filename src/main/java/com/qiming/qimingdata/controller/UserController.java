package com.qiming.qimingdata.controller;

import com.qiming.qimingdata.model.UserModel;
import com.qiming.qimingdata.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Demo class
 *
 * @author qimingjin
 * @date 2018/1/8
 */
@RequestMapping("/user")
@EnableAutoConfiguration
@RestController
@Slf4j
@Api(value = "user",consumes = "application/json",produces = "application/json",protocols = "http")
public class UserController {
    @Autowired
    private UserService userService;

    /**
     * 接口数据测试
     * @return
     */
    @ApiOperation(value = "queryusers",notes = "query")
    @ApiImplicitParam(name = "smsBaseDomain", value = "消息基础类", required = true, dataType = "SmsBaseDomain")
    @RequestMapping(value="/userlogin",method = RequestMethod.GET )
    public List<UserModel> selectUser (){
        log.info("adadadada");
        return userService.selectUser();
    }

    /**
     * freemark模板引擎测试
     * @return
     */
    @RequestMapping(value = "/view1",method = RequestMethod.GET)
    public ModelAndView viewex(){

        return new ModelAndView("index");
    }

    @RequestMapping(value = "/tologin",method = RequestMethod.GET)
    public ModelAndView toLogin(){
        return new ModelAndView("login");
    }

    /**
     * 后台登录
     * @return
     */
    @RequestMapping(value = "/backlogin",method = RequestMethod.POST)
    public ModelAndView backLogin(){
        return new ModelAndView("");
    }
}
