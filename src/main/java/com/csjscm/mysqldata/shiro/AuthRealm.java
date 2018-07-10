package com.csjscm.mysqldata.shiro;


import com.google.common.collect.Maps;
import com.csjscm.mysqldata.model.MemberUser;
import com.csjscm.mysqldata.model.QUserRoles;
import com.csjscm.mysqldata.model.RoleAuth;
import com.csjscm.mysqldata.service.UserService;
import com.csjscm.mysqldata.service.impl.RedisServiceImpl;
import com.vici.AppDateMgr;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.*;


/**
 * @author csjscm
 * create 2018-02-23 下午 3:07
 **/
@Slf4j
@Repository
public class AuthRealm extends AuthorizingRealm {

    private static UserService userService;

    private static RedisServiceImpl redisService;
    @Autowired
    public void setSecurityService(UserService userService,RedisServiceImpl redisService) {
        this.userService = userService;
        this.redisService=redisService;
    }


    /**
     * 授权用户权限
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        log.info("权限配置：MyShiroRealm.doGetAuthorizationInfo()");
        SimpleAuthorizationInfo authorizationInfo =  new SimpleAuthorizationInfo();
        Subject currentUser = SecurityUtils.getSubject();
        Session session = currentUser.getSession();
        MemberUser user =(MemberUser)session.getAttribute("currentUser");
        Map<String,Object> map=Maps.newHashMap();
        map.put("userId",user.getId());
        Map<String, Object> Rolemap = userService.queryForUserRoles(map);
        int status =(int) Rolemap.get("status");
        if(status==0){
          List<QUserRoles> qUserRoles=(List<QUserRoles>) Rolemap.get("list");
            for (QUserRoles role : qUserRoles) {
                authorizationInfo.addRole(role.getRoleName());
                log.info("用户："+user.getLogin_phone()+"======拥有==="+role.getRoleName());
                Map<String,Object> raMap=Maps.newHashMap();
                raMap.put("roleId",role.getRoleId());
                Map<String, Object> map1 = userService.selectRoleAuthorByWhere(raMap);
                int status1 =(int) map1.get("status");
                if(status1==0){
                    List<RoleAuth> roleAuths=(List<RoleAuth>)map1.get("list");
                    for(RoleAuth roleAuth:roleAuths){
                        authorizationInfo.addStringPermission(roleAuth.getAuthorizationsList().getAuthorizationName());
                        log.info(user.getLogin_phone()+"================权限==============>"+roleAuth.getAuthorizationsList().getAuthorizationName());
                    }
                }else {
                    return null;
                }

            }
        }else {
            return null;
        }

        return authorizationInfo;
    }

    /**
     * 验证用户身份
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(
            AuthenticationToken authcToken) throws AuthenticationException {
        log.info("身份认证方法：MyShiroRealm.doGetAuthenticationInfo()");
        UsernamePasswordToken token = (UsernamePasswordToken) authcToken;
        //用户输入的明文密码
        String password = String.valueOf(token.getPassword());
        //获取用户的输入的账号.
        String username = token.getUsername();
        MemberUser userInfo= userService.findByUsername(username);
        if(userInfo==null){
            return null;
        }
        //账户冻结
        if(userInfo.getStatus()==-1){
            throw new LockedAccountException();
        }else {
            //credentialsSalt盐值
            ByteSource credentialsSalt = ByteSource.Util.bytes(userInfo.getLogin_phone());
            //更新登录时间 last login time
            Map<String,Object> map= Maps.newHashMap();
            map.put("last_login_time", AppDateMgr.todayYyyyMmDdHhMmSs());
            map.put("id",userInfo.getId());
            map.put("credentialssalt",credentialsSalt.toString());
            int i = userService.updateByid(map);
            //保存session
            Subject currentUser = SecurityUtils.getSubject();
            Session session = currentUser.getSession();
            session.setAttribute("currentUser", userInfo);
            session.setAttribute("username",token.getUsername());
            SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(
                    userInfo.getLogin_phone(),
                    userInfo.getLogin_password(),
                    credentialsSalt,
                    getName()
            );
            return authenticationInfo;
        }


    }

}
