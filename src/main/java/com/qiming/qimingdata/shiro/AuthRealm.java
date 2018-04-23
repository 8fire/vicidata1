package com.qiming.qimingdata.shiro;


import com.qiming.qimingdata.dao.MemberUserMapper;
import com.qiming.qimingdata.model.MemberUser;
import com.qiming.qimingdata.service.UserService;
import com.qiming.qimingdata.service.impl.UserServiceImpl;
import com.vici.MD5Utils;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Repository;
import org.springframework.ui.context.support.UiApplicationContextUtils;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


/**
 * @author qiming
 * create 2018-02-23 下午 3:07
 **/
@Slf4j
@Repository
public class AuthRealm extends AuthorizingRealm {

    private static UserService userService;
    @Autowired
    public void setSecurityService(UserService userService) {
        this.userService = userService;
    }

    /**
     * 授权用户权限
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(
            PrincipalCollection principals) {
        //获取用户
        SecurityProperties.User user = (SecurityProperties.User) SecurityUtils.getSubject().getPrincipal();
        SimpleAuthorizationInfo info =  new SimpleAuthorizationInfo();
        //获取用户角色
        Set<String> roleSet = new HashSet<>();
        roleSet.add("100002");
        info.setRoles(roleSet);

        //获取用户权限
        Set<String> permissionSet = new HashSet<String>();
        permissionSet.add("权限添加");
        permissionSet.add("权限删除");
        info.setStringPermissions(permissionSet);
        return info;
    }

    /**
     * 验证用户身份
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(
            AuthenticationToken authcToken) throws AuthenticationException {

        System.out.println("身份认证方法：MyShiroRealm.doGetAuthenticationInfo()");
        UsernamePasswordToken token = (UsernamePasswordToken) authcToken;
        String password = String.valueOf(token.getPassword());
        //获取用户的输入的账号.
        String username = token.getUsername();
        MemberUser userInfo= userService.findByUsername(username);
        MemberUser memberUser=new MemberUser();
        memberUser.setLogin_phone(username);
         log.info("userinfo========>"+userInfo.getId());
        if(userInfo==null){
            return null;
        }
        if(userInfo.getStatus()==1){//账户冻结
            throw new LockedAccountException();
        }else {
            //更新登录时间 last login time
            //user.setLastLoginTime(new Date());
            //sysUserService.updateById(user);
        }
       /* Map<String, Object> map = new HashMap<>();
        map.put("nickname", username);
        //密码进行加密处理  明文为  password+name
        String paw = password+username;
        String pawDES = MD5Utils.encryptMD5(paw);
        map.put("pswd", pawDES);

        MemberUser user = new MemberUser();
        user.setId("112222");
        user.setLoginPhone(username);
        user.setLoginPassword(pawDES);*/
        SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(
                userInfo, //用户名
                userInfo.getLogin_password(), //密码
               // ByteSource.Util.bytes(userInfo.getCredentialsSalt()),//salt=username+salt
                getName()  //realm name
        );

        return authenticationInfo;
    }


}
