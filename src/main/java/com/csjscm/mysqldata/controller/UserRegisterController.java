package com.csjscm.mysqldata.controller;

import com.google.code.kaptcha.Producer;
import com.google.common.collect.Maps;
import com.csjscm.mysqldata.model.RoleExample;
import com.csjscm.mysqldata.service.UserService;
import com.csjscm.mysqldata.service.impl.AsyncTaskService;
import com.csjscm.mysqldata.service.impl.MailService;
import com.csjscm.mysqldata.service.impl.RedisServiceImpl;
import com.csjscm.mysqldata.service.impl.UserRegisterServiceImpl;
import com.vici.response.MsgResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * 用户注册
 *
 * @author csjscm
 * create 2018-05-25 上午 9:01
 **/
@RequestMapping("/userRegister")
@RestController
@Slf4j
public class UserRegisterController {
    @Autowired
    private UserService userService;
    @Autowired
    private RedisServiceImpl redisService ;
    @Autowired
    private Producer captchaProducer ;
    @Autowired
    private AsyncTaskService asyncTaskService;
    @Autowired
    private MailService mailService;
    @Autowired
    private UserRegisterServiceImpl userRegisterService;

    /**
     * 跳转到注册页面
     * @return
     */
    @RequestMapping(value = "/toUserRegister",method = RequestMethod.GET)
    public ModelAndView toUserRegister(){
        RoleExample roleExample=new RoleExample();
        Map<String, Object> allRoles = userService.selectRolesBywhere(roleExample);
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("/admin/user-register");
        Map<String,Object> map= Maps.newHashMap();
        map.put("roleList",allRoles.get("rolesList"));
        modelAndView.addObject("map",map);
        return modelAndView;
    }


    /**
     * 注册接口
     * @return
     */
    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public MsgResponse registerMemberUser(HttpServletRequest request){
        int i = userRegisterService.userRegister(request);
        return i==0?MsgResponse.success():MsgResponse.fail();
    }

    /**
     * 效验账户是否已经存在
     */
    @RequestMapping(value = "/verifyCheck",method = RequestMethod.POST)
    public Integer verifyCheck(@RequestParam("loginPhone") String loginPhone,
                               @RequestParam("loginEmail") String loginEmail){
        Boolean existAccount = userRegisterService.isExistAccount(loginPhone);
        Boolean existEmail = userRegisterService.isExistEmail(loginEmail);
        if(existAccount){
            return 0;
        }else if(existEmail){
            return 1;
        }
        return 2;
    }
}
