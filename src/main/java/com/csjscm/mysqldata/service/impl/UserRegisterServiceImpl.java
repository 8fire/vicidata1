package com.csjscm.mysqldata.service.impl;

import com.csjscm.mysqldata.dao.MemberUserMapper;
import com.csjscm.mysqldata.dao.UserRolesMapper;
import com.csjscm.mysqldata.model.MemberUser;
import com.csjscm.mysqldata.model.UserRoles;
import com.csjscm.mysqldata.model.UserRolesExample;
import com.csjscm.mysqldata.service.UserRegisterService;
import com.google.common.collect.Maps;
import com.vici.MD5Utils;
import com.vici.response.Constant;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;
import java.util.Map;

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
    @Resource
    private UserRolesMapper userRolesMapper;
    @Resource
    private MailService mailService;
    @Resource
    private AsyncTaskService asyncTaskService;

    @Override
    @Transactional(value = "mysqlTranscationManager")
    public int userRegister(HttpServletRequest request) {
        MemberUser memberUser=new MemberUser();
        memberUser.setLogin_phone(request.getParameter("loginPhone"));
        memberUser.setLogin_email(request.getParameter("loginEmail"));
        memberUser.setGmt_create(new Date());
        memberUser.setStatus(-1);
        memberUser.setUsername(request.getParameter("userName"));
        memberUser.setCard_id(request.getParameter("cardId"));
        //加密后的用户密码
        String password = MD5Utils.encryptMD5(request.getParameter("loginPassword"), request.getParameter("loginPhone"));
        memberUser.setLogin_password(password);
        int row = memberUserMapper.insertSelective(memberUser);
        if(row>0){
            //添加到用户角色表中
            MemberUser fmemberUser=new MemberUser();
            fmemberUser.setLogin_phone(request.getParameter("loginPhone"));
            MemberUser newMemberUser= memberUserMapper.selectByName(fmemberUser);
            Integer roleId =Integer.parseInt(request.getParameter("roleId"));
            UserRoles userRoles=new UserRoles();
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

    /**
     * 判断手机号是否已经注册过
     * @param loginName
     * @return
     */
    public Boolean isExistAccount(String loginName){
        MemberUser memberUser=new MemberUser();
        memberUser.setLogin_phone(loginName);
        List<MemberUser> memberUser1 = memberUserMapper.selectBywhere(memberUser);
        return  (null==memberUser1||memberUser1.size()==0) ?false:true;
    }

    /**
     * 判断邮箱是否注册过
     * @param loginEmail
     * @return
     */
    public Boolean isExistEmail(String loginEmail){
        MemberUser memberUser=new MemberUser();
        memberUser.setLogin_email(loginEmail);
        List<MemberUser> memberUser1 = memberUserMapper.selectBywhere(memberUser);
        return  (null==memberUser1||memberUser1.size()==0) ?false:true;
    }

    /**
     * 定时任务审核账户(普通账户类型为3的)
     * @return
     */
    @Override
    @Transactional(value = "mysqlTranscationManager",rollbackFor = Exception.class)
    public String registerJob(){
        //查询普通账户并且是待审核的
        UserRolesExample userRolesExample=new UserRolesExample();
        userRolesExample.createCriteria().andRoleIdEqualTo(3).andStatusEqualTo(-2);
        List<UserRoles> userRoles = userRolesMapper.selectByExample(userRolesExample);
        int i=0;
        int j=0;
        for (UserRoles userRole:userRoles
                ) {
            Map<String,Object> map=Maps.newHashMap();
            map.put("id",userRole.getUserId());
            map.put("status",0);
            map.put("checkuser",Constant.SYSTEM_CHECK_USER);
            map.put("checkadvice",Constant.SYSTEM_CHECK_ADVICE);
            map.put("checkdate",new Date());
            i = memberUserMapper.updateById(map);
            MemberUser memberUser = memberUserMapper.selectByPrimaryKey(userRole.getUserId());
            //修改账户状态
            UserRoles userRoles1=new UserRoles();
            userRoles1.setId(userRole.getId());
            userRoles1.setStatus(0);
            j= userRolesMapper.updateByPrimaryKeySelective(userRoles1);
            //定时成功发送邮件通知
            if(i>0&&j>0){
                String subject="账号审核通过";
                String content="尊敬的客户：<span style='color:red'>"+memberUser.getLogin_phone()+"</span>恭喜你成为平台会员，您现在即可登录系统。<a href='http://localhost:8000/user/tologin'>立即登录</a>";
                asyncTaskService.executeAsyncTask(mailService.sendReturnHtmlMail(memberUser.getLogin_email(),subject,content));
            }
        }
        return null;
    }
}
