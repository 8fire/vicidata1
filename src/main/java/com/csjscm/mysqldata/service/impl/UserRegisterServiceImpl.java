package com.csjscm.mysqldata.service.impl;

import com.csjscm.mysqldata.dao.MemberUserMapper;
import com.csjscm.mysqldata.model.MemberUser;
import com.csjscm.mysqldata.service.UserRegisterService;
import com.vici.MD5Utils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.Map;

import com.csjscm.mysqldata.model.userRoles;
import org.springframework.transaction.annotation.Transactional;

/**
 * 用户注册实现类
 *
 * @author csjscm
 * create 2018-06-13 下午 3:34
 **/
@Service
@Slf4j
public class UserRegisterServiceImpl implements UserRegisterService{
    @Resource
    private UserServiceImpl userService;
    @Resource
    private MemberUserMapper memberUserMapper;
    @Override

    @Transactional(value = "prodTransactionManager")
    public int userRegister(HttpServletRequest request) {
        MemberUser memberUser=new MemberUser();
        memberUser.setLogin_phone(request.getParameter("loginPhone"));
        memberUser.setLogin_email(request.getParameter("loginEmail"));
        memberUser.setGmt_create(new Date());
        memberUser.setStatus(-1);
        //加密后的用户密码
        String password = MD5Utils.encryptMD5(request.getParameter("loginPassword"), request.getParameter("loginPhone"));
        memberUser.setLogin_password(password);
        int row = memberUserMapper.insertSelective(memberUser);
        if(row>0){
            MemberUser fmemberUser=new MemberUser();
            fmemberUser.setLogin_phone(request.getParameter("loginPhone"));
            MemberUser newMemberUser= memberUserMapper.selectByName(fmemberUser);
            Integer roleId =Integer.parseInt(request.getParameter("roleId"));
            userRoles userRoles=new userRoles();
            userRoles.setRoleId(roleId);
            userRoles.setUserId(newMemberUser.getId());
            //需要等待审核
            userRoles.setStatus(-1);
            Map<String, Object> map = userService.insertUserRoles(userRoles);
            if(Integer.parseInt(map.get("status").toString())==0){
                return 0;
            }else {
                return -1;
            }
        }else {
            log.error("账户:【"+request.getParameter("loginPhone")+"】注册失败");
            return -1;
        }
    }

   /* public int isExistAccount(){
        memberUserMapper.selectByName()
    }*/
}
