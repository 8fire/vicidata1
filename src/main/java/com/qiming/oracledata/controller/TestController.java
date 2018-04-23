package com.qiming.oracledata.controller;

import com.qiming.oracledata.service.UserService;
import com.qiming.oracledata.model.UserModel;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 测试
 *
 * @author qiming
 * create 2018-03-19 上午 9:00
 **/
@RequestMapping("/user1")
@EnableAutoConfiguration
@RestController
@Slf4j
@Api(value = "user",consumes = "application/json",produces = "application/json",protocols = "http")
public class TestController {
    @Autowired
    private UserService userService;
    @ApiOperation(value = "queryusers",notes = "query")
    @RequestMapping(value="/userlogin",method = RequestMethod.GET )
    public List<UserModel> selectUser (){
        log.info("adadadada");
        return userService.selectUser();
    }
}
