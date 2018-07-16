package com.csjscm.mysqldata.service.impl;


import com.google.common.collect.Maps;
import com.csjscm.mysqldata.dao.*;

import com.csjscm.mysqldata.model.*;
import com.csjscm.mysqldata.service.UserService;
import com.vici.StringUtils;
import com.vici.MD5Utils;
import com.vici.response.MsgResponse;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.SecurityUtils;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
@Slf4j
public class UserServiceImpl implements UserService {


    @Resource
    private MemberUserMapper memberUserMapper;
    @Resource
    private SysMenuMapper sysMenuMapper;
    @Resource
    private RoleMapper roleMapper;
    @Resource
    private UserRolesMapper userRolesMapper;
    @Resource
    private RoleAuthorMapper roleAuthorMapper;
    @Resource
    private AuthorizationsMapper authorizationsMapper;
    @Resource
    private RoleSysmenuMapper roleSysmenuMapper;
    @Resource
    private RoleAuthorizationMapper roleAuthorizationMapper;
    @Resource
    private SysPermissionInitMapper sysPermissionInitMapper;

    /**
     * 修改秘密
     * @param newPassword
     * @return
     */
    @Override
    public MsgResponse editPassword(String newPassword) {
        String loginPhone = (String) SecurityUtils.getSubject().getPrincipal();
        MemberUser memberUser = this.findByUsername(loginPhone);
        Map<String,Object> map=Maps.newHashMap();
        String md5NewPassword = MD5Utils.encryptMD5(newPassword, loginPhone);
        map.put("login_password",md5NewPassword);
        map.put("id",memberUser.getId());
        int i = memberUserMapper.updateById(map);
        return i>0?MsgResponse.success():MsgResponse.fail();
    }

    @Override
    public MemberUser findByUsername(String name) {
        MemberUserExample memberUserExample=new MemberUserExample();
        MemberUser memberUser=new MemberUser();
        memberUser.setLogin_phone(name);
        MemberUser user = memberUserMapper.selectByName(memberUser);
        return user;
    }
    @Override
    public Map<String ,Object>  selectBywhere(MemberUser memberUser) {
        Map<String ,Object> map= Maps.newHashMap();
       // memberUser.setStatus(0);//0启用-1禁用
        List<MemberUser> user = memberUserMapper.selectBywhere(memberUser);
        if(user.size()>0||user.equals(null)){
            map.put("status",1);
            map.put("MemberUser",user);
        }else {
            map.put("status",0);
        }
        return map;
    }

    @Override
    public int updateByid(Map<String, Object> map) {

        return memberUserMapper.updateById(map);
    }

    @Override
    public Map<String, Object> selectMenuInfo() {
        Map<String ,Object> map= Maps.newHashMap();
        List<SysMenuInfo> sysMenuInfo = sysMenuMapper.selectMenuInfo();
        if(sysMenuInfo.size()>0){
            map.put("status",1);
            map.put("sysMenuInfoList",sysMenuInfo);
            for (SysMenuInfo menuInfo1:sysMenuInfo){
                int syId = menuInfo1.getSyId();
                List<SysMenuInfo> sysMenuInfos = sysMenuMapper.selectMenuInfoByPid(syId);
                map.put("sysMenuInfos",sysMenuInfos);
            }
        }else {
            map.put("status",0);
        }
        return map;
    }

    @Override
    public Map<String, Object> selectRolesBywhere(RoleExample roleExample) {
        Map<String ,Object> map= Maps.newHashMap();
        List<Role> roles = roleMapper.selectByExample(roleExample);
        if(roles.size()>0){
            map.put("status",1);
            map.put("rolesList",roles);
        }else {
            map.put("status",0);
        }
        return map;
    }

    @Override
    public Map<String, Object> insertUserRoles(UserRoles userRoles) {
        Map<String,Object> map =Maps.newHashMap();
        int i = userRolesMapper.insertSelective(userRoles);
        if(i>0){
            map.put("status",0);
        }else {
            map.put("status",-1);
        }
        return map;
    }

    /**
     * 根据ID修改用户角色表
     * @param userRoles
     * @return
     */
    @Override
    public Map<String, Object> updateUserRoleByid(UserRoles userRoles) {
        Map<String,Object> map =Maps.newHashMap();
        int i = userRolesMapper.updateByPrimaryKeySelective(userRoles);
        if(i>0){
            map.put("status",0);
        }else {
            map.put("status",-1);
        }
        return map;
    }

    /**
     * 查询用户角色记录
     * @param mapId
     * @return
     */
    @Override
    public Map<String, Object>  queryForUserRoles (Map<String,Object> mapId) {
        Map<String,Object> map =Maps.newHashMap();
        List<QUserRoles> qUserRoles = userRolesMapper.queryForUserRoles(mapId);
        if(qUserRoles.size()>0&qUserRoles!=null){
            map.put("list",qUserRoles);
            map.put("status",0);
        }else {
            map.put("status",-1);
        }
        return map;
    }

    @Override
    public Map<String, Object> selectRoleByExample() {
        RoleExample roleExample=new RoleExample();
        roleExample.createCriteria();
        roleMapper.selectByExample(roleExample);
        return null;
    }

    @Override
    public Map<String, Object> selectRoleAuthorByWhere(Map<String, Object> map) {
        List<RoleAuth> qUserRoles = roleAuthorMapper.queryForWhere(map);
        if(qUserRoles.size()>0&qUserRoles!=null){
            map.put("list",qUserRoles);
            map.put("status",0);
        }else {
            map.put("status",-1);
        }
        return map;
    }
   @Override
    public  Map<String,Object> getAllAuthorization(){
       int i = authorizationsMapper.countAuthorizations();
       List<Authorizations> authorizations = authorizationsMapper.selectAll();
       Map<String,Object> map =Maps.newHashMap();
       map.put("total",i);
       map.put("authorizations",authorizations);
       return map;
    }

    /**
     * 添加权限
     * @param authorizationName
     * @param description
     * @return
     */
    @Override
    public MsgResponse insertAuthorization(Integer parentTrId,String authorizationName,String description) {

        String principal = String.valueOf(SecurityUtils.getSubject().getPrincipal());
        Authorizations authorizations=new Authorizations();
        authorizations.setAuthorizationName(authorizationName);
        authorizations.setDescription(description);
        authorizations.setGmtCreate(new Date());
        authorizations.setCreater(principal);
        authorizations.setStatus(0);
        authorizations.setParentTrId(parentTrId);
        int i = authorizationsMapper.insertSelective(authorizations);
        if(i>0){
            return MsgResponse.success();
        }else {
            return MsgResponse.fail();
        }
    }

    @Override
    public Authorizations queryAuthorizationById(Integer id) {
        return authorizationsMapper.selectByPrimaryKey(id);
    }

    @Override
    public MsgResponse updateAuthorizationById( Authorizations authorizations) {

        authorizations.setGmtModified(new Date());
        int i = authorizationsMapper.updateByPrimaryKeySelective(authorizations);
        if(i>0){
           return MsgResponse.success();
        }else {
           return MsgResponse.fail();
        }
    }

    @Override
    public Map<String, Object> getAllRoles() {
        return null;
    }

    @Override
    public MsgResponse updateRoleById(Role role,RoleExample roleExample) {
        role.setGmtModified(new Date());
        int i = roleMapper.updateByExampleSelective(role, roleExample);
        if(i>0){
            return MsgResponse.success();
        }else {
            return MsgResponse.fail();
        }
    }

    @Override
    public Authorizations queryRoleById(Integer id) {
        return null;
    }

    /**
     * 添加角色
     * @param roleName
     * @param description
     * @return
     */
    @Override
    public MsgResponse insertRole(String roleName, String description) {
        String principal = String.valueOf(SecurityUtils.getSubject().getPrincipal());
        Role role=new Role();
        role.setRoleName(roleName);
        role.setDescription(description);
        role.setCreater(principal);
        role.setGmtCreate(new Date());
        role.setStatus(0);
        int i = roleMapper.insertSelective(role);
        if(i>0){
           return MsgResponse.success();
        }else {
            log.info("===============添加角色失败======>");
          return  MsgResponse.fail();

        }

    }

    /**
     * 得到系统菜单根据角色
     * @return
     */
    @Override
    public List<SysMenu1> getSysMenuInfo(Integer menuid) {
        String currentUser = String.valueOf(SecurityUtils.getSubject().getPrincipal());
        MemberUser memberUser=new MemberUser();
        memberUser.setLogin_phone(currentUser);
        MemberUser newMemberUser= memberUserMapper.selectByName(memberUser);
        if(!StringUtils.isNullOrEmpty(memberUser)){
            UserRolesExample roleExample=new UserRolesExample();
            roleExample.createCriteria().andUserIdEqualTo(newMemberUser.getId());
            List<UserRoles> userRoles = userRolesMapper.selectByExample(roleExample);
            List<SysMenu1> sysMenus = sysMenuMapper.getSysMenuInfo(userRoles.get(0).getRoleId(),menuid);
            return sysMenus;
        }else {
            log.info("===============>"+"没有查询到用户");
            return null;
        }
    }

    @Override
    public List<SysMenu1> getAllSysMenuInfo() {
        return sysMenuMapper.getAllSysMenuInfo();
    }

    @Override
    public MsgResponse insertRoleSysmenu(RoleSysmenu roleSysmenu) {
        int i = roleSysmenuMapper.insertSelective(roleSysmenu);
        if(i>0){
            return MsgResponse.success();
        }else {
            return MsgResponse.fail();
        }
    }

    @Override
    public MsgResponse deleteRoleSysmenu(RoleSysmenu roleSysmenu){
        RoleSysmenuExample roleSysmenuExample=new RoleSysmenuExample();
        roleSysmenuExample.createCriteria().andRoleidEqualTo(roleSysmenu.getRoleid());
        int i = roleSysmenuMapper.deleteByExample(roleSysmenuExample);
        if(i>0){
            return MsgResponse.success();
        }else{
            return MsgResponse.fail();
        }
    }
    @Override
    public MsgResponse insertRoleAuthorization(RoleAuthorization roleAuthorization) {
        int i = roleAuthorizationMapper.insertSelective(roleAuthorization);
        if(i>0){
            return MsgResponse.success();
        }else {
            return MsgResponse.fail();
        }
    }
   @Override
    public MsgResponse deleteRoleAuthorization(RoleAuthorization roleAuthorization){
        RoleAuthorizationExample roleAuthorizationExample=new RoleAuthorizationExample();
        roleAuthorizationExample.createCriteria().andRoleIdEqualTo(roleAuthorization.getRoleId());
        int i = roleAuthorizationMapper.deleteByExample(roleAuthorizationExample);
        if(i>0){
            return MsgResponse.success();
        }else{
            return MsgResponse.fail();
        }
    }

    @Override
    public List<SysMenu> getSysMenuInfoByPid(Integer id) {
        return sysMenuMapper.getSysMenuInfoByPid(id);
    }

    @Override
    public List<SysPermissionInit> getSysPermissionInit(SysPermissionInitExample sysPermissionInitExample) {
        return  sysPermissionInitMapper.selectByExample(sysPermissionInitExample);
    }

    @Override
    public MsgResponse insertSysPermissionInit(SysPermissionInit sysPermissionInit) {
        sysPermissionInit.setGmtCreate(new Date());
        sysPermissionInit.setStatus(0);
        int i = sysPermissionInitMapper.insertSelective(sysPermissionInit);
        return i>0?MsgResponse.success():MsgResponse.fail();
    }

    @Override
    public MsgResponse updateSyspermissionInit(SysPermissionInit sysPermissionInit) {
        sysPermissionInit.setGmtModify(new Date());
        int i = sysPermissionInitMapper.updateByPrimaryKeySelective(sysPermissionInit);
        return i>0?MsgResponse.success():MsgResponse.fail();
    }

    @Override
    public MsgResponse deleteSyspermissionInit(Integer id) {
        int i = sysPermissionInitMapper.deleteByPrimaryKey(id);
        return i>0?MsgResponse.success():MsgResponse.fail();
    }
}
