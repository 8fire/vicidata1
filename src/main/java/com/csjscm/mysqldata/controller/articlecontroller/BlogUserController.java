package com.csjscm.mysqldata.controller.articlecontroller;

import com.csjscm.mysqldata.model.MemberUser;
import com.vici.response.MsgResponse;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import net.sf.json.JSONObject;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.subject.Subject;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: vicidata
 * @description: 闲谈博客用户管理
 * @author: 没用的阿吉
 * @create: 2018-07-13 16:40
 */
@RestController
@EnableAutoConfiguration
@RequestMapping("/blogUser")
@Slf4j
public class BlogUserController {
    /**
     * 登录
     * @param
     * @return
     */
    @ApiOperation(value = "登录接口",notes = "登录接口")
    @RequestMapping(value="/prosceniumLogin",method = RequestMethod.POST)
    public MsgResponse ajaxlogin(@RequestParam("loginPassword") String loginPassword,
                                 @RequestParam("loginPhone") String loginPhone
                             ) {
        MemberUser user = new MemberUser();
        user.setLogin_password(loginPassword);
        JSONObject jsonObject = new JSONObject();
        UsernamePasswordToken token = new UsernamePasswordToken(loginPhone, loginPassword);
        Subject currentUser = SecurityUtils.getSubject();
        try {
            currentUser.login(token);
            jsonObject.put("token", currentUser.getSession().getId());
            System.out.println(currentUser.getSession().getId());
            jsonObject.put("msg", "登录成功");
            return MsgResponse.success().add("data", jsonObject);
        } catch (IncorrectCredentialsException e) {
            jsonObject.put("msg", "密码错误");
            return MsgResponse.fail().add("data", jsonObject);
        } catch (LockedAccountException e) {
            jsonObject.put("msg", "登录失败，该用户已被冻结");
            return MsgResponse.fail().add("data", jsonObject);
        } catch (DisabledAccountException e) {
            jsonObject.put("msg", "对用户[" + loginPhone + "]进行登录验证..验证未通过,错误次数大于5次,账户已锁定");
            return MsgResponse.fail().add("data", jsonObject);
        } catch (AuthenticationException e) {
            jsonObject.put("msg", "该用户不存在");
            return MsgResponse.fail().add("data", jsonObject);
        } catch (Exception e) {
            e.printStackTrace();
            jsonObject.put("msg", "请联系管理员");
            return MsgResponse.fail().add("data", jsonObject);
        }
    }

}
