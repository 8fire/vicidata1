package com.qiming.qimingdata.controller;


import com.qiming.qimingdata.model.MemberUser;
import com.qiming.qimingdata.service.UserService;
import com.vici.AppStringUtils;
import com.vici.response.MsgResponse;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import net.sf.json.JSONObject;
import org.apache.ibatis.annotations.Param;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;




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
     * 登录
     * @param
     * @return
     */
    @RequestMapping(value="/ajaxlogin",method=RequestMethod.POST)
    public MsgResponse ajaxlogin(@Param("loginPassword") String loginPassword,@Param("loginPhone") String loginPhone){
     //   MemberUser byUsername = userService.findByUsername(loginPhone);
       // System.out.println("========>"+byUsername.getLogin_password());
        MemberUser user=new MemberUser();
        user.setLogin_password(loginPassword);
        JSONObject jsonObject = new JSONObject();
        //Subject subject = SecurityUtils.getSubject();
        String name = "";
        if(AppStringUtils.isNumeric(loginPhone)){
            name=loginPhone;
            user.setLogin_phone(name);
        }else {
            name=loginPhone;
            user.setLogin_email(name);
        }
        UsernamePasswordToken token=new UsernamePasswordToken(name,loginPassword);
       Subject subject= SecurityUtils.getSubject();
        try{
            subject.login(token);
            jsonObject.put("token",subject.getSession().getId());
            jsonObject.put("msg","登录成功");
            return MsgResponse.success().add("data",jsonObject);
        }catch (IncorrectCredentialsException e){
            jsonObject.put("msg", "密码错误");
            return MsgResponse.fail().add("data",jsonObject);
        }catch (LockedAccountException e){
            jsonObject.put("msg", "登录失败，该用户已被冻结");
            return MsgResponse.fail().add("data",jsonObject);
        }catch (AuthenticationException e){
            jsonObject.put("msg", "该用户不存在");
            return MsgResponse.fail().add("data",jsonObject);
        }catch (Exception e){
            e.printStackTrace();
            jsonObject.put("msg","请联系管理员");
            return MsgResponse.fail().add("data",jsonObject);
        }

    }

   @RequestMapping(value="/login",method=RequestMethod.GET)
   public String login(String username, String password,String vcode,Boolean rememberMe){
       System.out.println(username);
       UsernamePasswordToken token = new UsernamePasswordToken("123", "123",true);
       SecurityUtils.getSubject().login(token);

       return "loginSuccess";
   }

  /*  @RequestMapping(value="/index",method=RequestMethod.GET)
    public String home(){
        org.apache.shiro.subject.Subject subject = SecurityUtils.getSubject();
        SecurityProperties.User principal = (SecurityProperties.User) subject.getPrincipals();

        return "Home";
    }*/

    /**
     * freemark模板引擎测试
     * @return
     */
    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public ModelAndView viewex(){

        return new ModelAndView("index");
    }
    @RequestMapping(value = "/welcome",method = RequestMethod.GET)
    public ModelAndView welcome(){

        return new ModelAndView("welcome");
    }
    @RequestMapping(value = "/tologin",method = RequestMethod.GET)
    public ModelAndView toLogin(){
        return new ModelAndView("login");
    }

    /**
     * 后台登录
     * @returns
     */
    @RequestMapping(value = "/backlogin",method = RequestMethod.POST)
    public ModelAndView backLogin(){
        return new ModelAndView("");
    }



}
