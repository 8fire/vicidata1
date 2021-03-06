package com.csjscm.mysqldata.controller;


import com.google.code.kaptcha.Producer;
import com.google.common.collect.Maps;
import com.csjscm.mysqldata.model.*;
import com.csjscm.mysqldata.service.UserService;
import com.csjscm.mysqldata.service.impl.AsyncTaskService;
import com.csjscm.mysqldata.service.impl.MailService;
import com.csjscm.mysqldata.service.impl.RedisServiceImpl;
import com.vici.MD5Utils;
import com.vici.request.RequestUtils;
import com.vici.response.Constants;
import com.vici.response.ErrMessageConstants;
import com.vici.response.MsgResponse;
import com.vici.response.ViciException;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import net.sf.json.JSONObject;
import org.apache.ibatis.annotations.Param;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.image.BufferedImage;
import java.util.*;


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
public class UserController {
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

    /**
     * 跳转到登录界面
     * @return
     */
    @RequestMapping(value = "/tologin",method = RequestMethod.GET)
    public ModelAndView toLogin(){
        return new ModelAndView("login");
    }
    /**
     * 登录
     * @param
     * @return
     */
    @ApiOperation(value = "登录接口",notes = "登录接口")
    @RequestMapping(value="/ajaxlogin",method = RequestMethod.POST)
    public MsgResponse ajaxlogin(@Param("loginPassword") String loginPassword,
                                 @Param("loginPhone") String loginPhone,
                                 @Param("rememberMe") String rememberMe) {
        MemberUser user = new MemberUser();
        user.setLogin_password(loginPassword);
        JSONObject jsonObject = new JSONObject();
        UsernamePasswordToken token = new UsernamePasswordToken(loginPhone, loginPassword,Boolean.parseBoolean(rememberMe));
        Subject currentUser = SecurityUtils.getSubject();
        try {
            currentUser.login(token);
            jsonObject.put("token", currentUser.getSession().getId());
            jsonObject.put("msg", ErrMessageConstants.LOGIN_SUCCESS_INFO);
            //获取当前登录对象
            String principal = (String) SecurityUtils.getSubject().getPrincipal();
            //成功后，清空登录计数
            redisService.set(Constants.SHIRO_LOGIN_COUNT+loginPhone,0);
            return MsgResponse.success().add(Constants.DATA, jsonObject);
        } catch (IncorrectCredentialsException e) {
            //校验剩余输入密码的次数
            Integer shiroLoginCount =(Integer) redisService.get(Constants.SHIRO_LOGIN_COUNT + loginPhone);
            jsonObject.put("msg", String.format(ErrMessageConstants.PASSWORD_ERROR_INFO,5-shiroLoginCount));
            return MsgResponse.fail().add(Constants.DATA, jsonObject);
        } catch (LockedAccountException e) {
            jsonObject.put("msg", ErrMessageConstants.FREEZE_ACCOUT_INFO);
            return MsgResponse.fail().add(Constants.DATA, jsonObject);
        } catch (DisabledAccountException e) {
            jsonObject.put("msg", ErrMessageConstants.PASSWORD_ERROR_FIVE);
            return MsgResponse.fail().add(Constants.DATA, jsonObject);
        } catch (AuthenticationException e) {
            jsonObject.put("msg", ErrMessageConstants.NOEXIST_ACCOUT_INFO);
            return MsgResponse.fail().add(Constants.DATA, jsonObject);
        } catch (Exception e) {
            log.error(e.getMessage(),e);
            jsonObject.put("msg", ErrMessageConstants.SYSTEM_ERROR_INFO);
            return MsgResponse.fail().add(Constants.DATA, jsonObject);
        }

    }

    /**
     * 生成二维码
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/captcha-image" ,method = RequestMethod.GET)
    public void getKaptchaImage(HttpServletRequest request,
                                HttpServletResponse response) throws Exception {
        HttpSession session = request.getSession();
        response.setDateHeader("Expires", 0);
        response.setHeader("Cache-Control", "no-store, no-cache, must-revalidate");
        response.addHeader("Cache-Control", "post-check=0, pre-check=0");
        response.setHeader("Pragma", "no-cache");
        response.setContentType("image/jpeg");
        String capText = captchaProducer.createText();
        session.setAttribute(com.google.code.kaptcha.Constants.KAPTCHA_SESSION_KEY, capText);
        System.out.println("验证码: " + capText );
        BufferedImage bi = captchaProducer.createImage(capText);
        ServletOutputStream out = response.getOutputStream();
        ImageIO.write(bi, "jpg", out);
        try {
            out.flush();
        } finally {
            out.close();
        }

    }

    /**
     * 校验验证码
     * @param kaptchaCode
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/captchaVerify",method=RequestMethod.POST)
    public Map<String,Object> captchaVerify( String kaptchaCode,HttpServletRequest request, HttpServletResponse response) throws Exception {
        Map<String,Object> result=new HashMap<>();
        HttpSession session = request.getSession();
        String code = (String)session.getAttribute(com.google.code.kaptcha.Constants.KAPTCHA_SESSION_KEY);
        if(org.apache.commons.lang.StringUtils.isNotBlank(kaptchaCode)&&kaptchaCode.equalsIgnoreCase(code)){
            result.put("isOK", "OK");
        }else{
            result.put("isOK", "WRONG");
        }
        return result;

    }
    /**
     * 没有权限
     * @return
     */
    @RequestMapping(value = "/403",method = RequestMethod.GET)
    public ModelAndView unauthorizedRole(){
        log.info("------没有权限-------");
        return new ModelAndView("/commons/403");
    }
    /**
     * 退出登录
     * @return
     */
    @RequestMapping(value = "/logout",method = RequestMethod.GET)
    public ModelAndView logout(){
        try {
            //退出
            SecurityUtils.getSubject().logout();
        } catch (Exception e) {
            log.error(e.getMessage(),e);
        }
        return new ModelAndView("login");
    }

    /**
     * 跳转到个人用户中心
     * @return
     */
    @RequestMapping(value = "/myUserInfo",method = RequestMethod.GET)
    public ModelAndView myUserInfo(){
        return new ModelAndView("admin/myUserInfo");
    }

    /**
     * 首页
     * @return
     */
    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public ModelAndView viewex(){
        ModelAndView modelAndView=new ModelAndView();
        //获取平台菜单
        List<SysMenu1> test = userService.getSysMenuInfo(1);
        //获取闲言博客菜单
        List<SysMenu1> blogMenuInfo = userService.getSysMenuInfo(2);
        modelAndView.addObject("menuList",test);
        modelAndView.addObject("blogMenuInfo",blogMenuInfo);
        modelAndView.setViewName("index");
        return modelAndView;
    }

    /**
     * 跳转到修改密码
     * @return
     */
    @RequestMapping(value = "/toEditPassWord",method = RequestMethod.GET)
    public ModelAndView toEditPassWord(){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("admin/admin-password-edit");
        return  modelAndView;
    }

    /**
     * 修改密码
     * @param
     * @param
     * @param
     * @return
     */
    @RequestMapping(value = "/editPassWord",method = RequestMethod.POST)
    public MsgResponse toEditPassWord(@RequestParam(value = "oldPassword") String oldPassword,
                                       @RequestParam(value = "newPassword") String newPassword,
                                       @RequestParam(value = "newPassword2") String newPassword2){
        //先校验两次的密码
        String loginPhone = (String) SecurityUtils.getSubject().getPrincipal();
        MemberUser memberUser = userService.findByUsername(loginPhone);
        String MD5Oldpassword = MD5Utils.encryptMD5(oldPassword, loginPhone);
        String login_password = memberUser.getLogin_password();
        if(!login_password.equals(MD5Oldpassword)){
            throw  new ViciException(ErrMessageConstants.ERR_OLD_PASSWORD);
        }
        if(oldPassword.equals(newPassword)){
            throw  new ViciException(ErrMessageConstants.NOT_EQUALS_OLDANDNEWPASSWORD);
        }
        if(!newPassword.equals(newPassword2))
        {
            throw  new ViciException(ErrMessageConstants.NOT_EQUALS_PASSWORD);
        }else {
           return   userService.editPassword(newPassword);
        }

    }
    /**
     * 初始页
     * @return
     */
    @RequestMapping(value = "/welcome")
    public ModelAndView welcome(HttpServletRequest request){
        ModelAndView modelAndView=new ModelAndView();
        Map<String,Object> map =Maps.newHashMap();
        //获取用户请求IP地址
        String ipAddr = RequestUtils.getIpAddr(request);
        map.put("ipAddr",ipAddr);
        modelAndView.addObject("map",map);
        modelAndView.setViewName("welcome");
        return  modelAndView;
    }


    /**
     * 查询角色列表
     * @return
     */
    @RequestMapping(value = "/admin-role",method = RequestMethod.GET)
    public ModelAndView toAdminRole(){
        ModelAndView modelAndView=new ModelAndView();
        RoleExample roleExample=new RoleExample();
        roleExample.createCriteria().andStatusEqualTo(0);
        Map<String, Object> map = userService.selectRolesBywhere(roleExample);
        int status = (int)map.get("status");
        if(status==1){
            modelAndView.addObject("list",map.get("rolesList"));
            modelAndView.setViewName("admin/admin-role");
        }else{
            modelAndView.setViewName("commons/404");
        }
        return modelAndView;
    }

    /**
     * 跳转到添加角色页面
     * @return
     */
    @RequestMapping(value = "/to-role-add",method = RequestMethod.GET)
    public ModelAndView toRoleAdd(){
        return new ModelAndView("/admin/addRole");
    }

    /**
     * 添加角色
     * @return
     */
    @RequestMapping(value = "/addRole",method = RequestMethod.POST)
    public MsgResponse addRole(@RequestParam(value = "roleName") String roleName,
                                @RequestParam(value = "description") String description){
        MsgResponse msgResponse = userService.insertRole(roleName, description);
        return msgResponse;
    }

    /**
     *跳转到角色编辑
     * @param id
     * @return
     */
    @RequiresPermissions("Permission:roleEdit")
    @RequestMapping(value = "/role-edit",method = RequestMethod.GET)
    public ModelAndView toEditRole(@RequestParam(value = "id") Integer id){
        ModelAndView modelAndView=new ModelAndView();
        RoleExample roleExample=new RoleExample();
        roleExample.createCriteria().andIdEqualTo(id);
        Map<String, Object> map = userService.selectRolesBywhere(roleExample);
        int status = (int)map.get("status");
        if(status==1) {
            List<Role> roles=(List<Role>)map.get("rolesList");
            modelAndView.addObject("role", roles.get(0));
            modelAndView.setViewName("/admin/role-edit");
        }else {
            modelAndView.setViewName("/commons/404");
        }
        return modelAndView;
    }

    /**
     * 编辑角色编辑
     * @param roleName
     * @param description
     * @param status
     * @param id
     * @return
     */
    @RequestMapping(value = "/roleEdit",method= RequestMethod.POST)
    public MsgResponse EditRole(@RequestParam(value = "roleName",required = true) String roleName,
                                @RequestParam(value="description") String description,
                                @Param(value = "status") String status,
                                @RequestParam(value="id") Integer id){
         Role role=new Role();
         role.setDescription(description);
         role.setRoleName(roleName);
         if(org.apache.commons.lang.StringUtils.isBlank(status)){
             role.setStatus(-1);
         }else {
             role.setStatus(0);
         }
        RoleExample roleExample=new RoleExample();
        roleExample.createCriteria().andIdEqualTo(id);
        return userService.updateRoleById(role,roleExample);
    }
    /**
     * 跳转到用户权限界面
     * @return
     */
    @RequestMapping(value = "/admin-permission",method = RequestMethod.GET)
    public ModelAndView toAdminPermission(){

        ModelAndView modelAndView=new ModelAndView();
        Map<String, Object> map = userService.queryForUserRoles(null);
        int status = (int)map.get("status");
        if(status==0){
            modelAndView.addObject("mvMap",map.get("list"));
            modelAndView.setViewName("admin/admin-permission");
        }else{
            modelAndView.setViewName("commons/404");
        }
        return modelAndView;
    }

    /**
     * 查询用户列表
     * @param memberUser
     * @return
     */
    @RequestMapping(value = "/admin-list",method = RequestMethod.GET)
    @RequiresPermissions("userInfo:query")
    public ModelAndView toAdminList(MemberUser memberUser){
        ModelAndView mv=new ModelAndView();
        Map<String, Object> map = userService.selectBywhere(memberUser);
        int status = (int)map.get("status");
        if(status==0){
            mv.setViewName("commons/404");
        }else{
            List<MemberUser> memberUserList =(List<MemberUser>)  map.get("MemberUser");
            for (MemberUser memberUsers:memberUserList){
                Map<String, Object> maps =Maps.newHashMap();
                maps.put("userId",memberUsers.getId());
                List<QUserRoles> qUserRolesList =(List<QUserRoles>) userService.queryForUserRoles(maps).get("list");
                if(null==qUserRolesList||qUserRolesList.size()==0){
                    memberUsers.setRoleName("尚未分配角色");
                }else {
                    memberUsers.setRoleName(qUserRolesList.get(0).getRoleName());
                }
            }
            mv.addObject("list",memberUserList);
            mv.setViewName("admin/admin-list");
            //写入rides
            redisService.set("memberRides",map.get("MemberUser"));
        }
        return mv;
    }

    /**
     * 修改用户状态
     * @param id 用户ID
     * @param flag 是否禁用标识
     * @return
     */
    @RequiresPermissions("userInfo:modify")
    @RequestMapping(value = "/updateUserStatus",method = RequestMethod.POST)
    public MsgResponse updateUserStatus(@RequestParam("id") String id,
                                                          @RequestParam("flag") int flag,
                                                         @RequestParam(value = "checkAdvice",defaultValue = "默认同意") String checkAdvice){
        Map<String,Object> map= Maps.newHashMap();
        String currentUser = String.valueOf(SecurityUtils.getSubject().getPrincipal());
        Integer id1=Integer.parseInt(id);
        if(flag==0){//启用
            map.put("id",id1);
            map.put("status",0);
            map.put("checkuser",currentUser);
            map.put("checkadvice",checkAdvice);
            map.put("checkdate",new Date());
        }else {//禁用
            map.put("id",id1);
            map.put("status",-1);
            map.put("checkuser",currentUser);
            map.put("checkadvice",checkAdvice);
            map.put("checkdate",new Date());
        }
        int i = userService.updateByid(map);
        if(i>0){
            return MsgResponse.success();
        }else {
            return MsgResponse.fail();
        }
    }

    /**
     * 用户修改
     * @param id 用户ID
     * @return
     */
    @RequiresPermissions("userInfo:modify")
    @RequestMapping(value = "/toadmin-edit", method=RequestMethod.GET)
    public ModelAndView toEditMemberUser(@Param("id") Integer id){
        ModelAndView modelAndView=new ModelAndView();
        MemberUser memberUser=new MemberUser();
        memberUser.setId(id);
        Map<String, Object> memberMap = userService.selectBywhere(memberUser);
        int status =(int) memberMap.get("status");
        if(status==1){
            List<MemberUser> memberUserList =(List<MemberUser>) memberMap.get("MemberUser");
            modelAndView.addObject("memberUser",memberUserList.get(0));
        }else {
            modelAndView.addObject("memberUser",null);
        }
        modelAndView.setViewName("admin/admin-edit");
        return modelAndView;
    }

    /**
     * 修改
     * @param
     * @return
     */
    @RequestMapping(value = "/admin-edit", method=RequestMethod.POST)
    public MsgResponse editMemberUser( @RequestParam(required = false ,value = "id") Integer id,
                                       @RequestParam(required = false ,value = "login_phone") String login_phone,
                                       @RequestParam(required = false,value = "login_email") String login_email,
                                       @RequestParam(required = false,value = "last_login_time") String last_login_time){
        Map<String,Object> map=Maps.newHashMap();
        map.put("id",id);
        map.put("login_phone",login_phone);
        map.put("login_email",login_email);
        int i = userService.updateByid(map);
        if(i>0){
             return MsgResponse.success();
        }else {
            return MsgResponse.fail();
        }
    }

    /**
     * 查询是否存在
     * @param
     * @return
     */
    @RequestMapping(value = "/isExistMemberUser", method=RequestMethod.POST)
    public String isExistMemberUser(  @RequestParam( required=false,value = "id") String id,
                                       @RequestParam( required=false,value = "login_phone") String login_phone,
                                       @RequestParam(required=false,value = "login_email") String login_email,
                                       @RequestParam(required=false,value = "last_login_time") String last_login_time){
        MemberUser memberUser=new MemberUser();
        memberUser.setLogin_phone(login_phone);
        memberUser.setLogin_email(login_email);
        Map<String, Object> map = userService.selectBywhere(memberUser);
        int status = (int)map.get("status");
        if(status==1){
            return "false";
        }else {
            return "true";
        }
    }

    /**
     * 跳转到用户分配角色的界面
     * @param id
     * @return
     */
    @RequestMapping(value = "/toAdminRoleAdd",method = RequestMethod.GET)
    public ModelAndView toAdminRoleAdd(@Param("uid") Integer uid,
                                       @RequestParam("id") Integer id){
        ModelAndView modelAndView=new ModelAndView();
        Map<String,Object> maps=Maps.newHashMap();
        MemberUser memberUser=new MemberUser();
        memberUser.setId(uid);
        Map<String, Object> map = userService.selectBywhere(memberUser);
        Map<String, Object> map1 = userService.selectRolesBywhere(null);
        int status =(int) map.get("status");
        int status1 =(int) map1.get("status");
        if(status==0||status1==0){
            modelAndView.setViewName("/commons/404");
        }else {
            maps.put("list",map.get("MemberUser"));
            maps.put("roleList",map1.get("rolesList"));
            maps.put("id",id);
        }
        modelAndView.addObject("mvMap",maps);
        modelAndView.setViewName("admin/admin-role-add");
        return modelAndView;
    }

    /**
     * 修改用户角色表
     * @param uid
     * @param id
     * @param rid
     * @return
     */
    @RequestMapping(value = "/saveAdminRole",method = RequestMethod.POST)
    public MsgResponse saveAdminRloe(@RequestParam(value = "uid",required = false) Integer uid,
                                @RequestParam(value="id",required = false) Integer id,
                                @RequestParam(value = "rid",required = false) Integer rid
                               ){
        UserRoles userRoles=new UserRoles();
        userRoles.setId(id);
        userRoles.setUserId(uid);
        userRoles.setRoleId(rid);
        userRoles.setGmtModify(new Date());
        //UserRoles.setStatus(0);
        Map<String, Object> map = userService.updateUserRoleByid(userRoles);
        int status = (int)map.get("status");
        if(status==0){
            return MsgResponse.success();
        }else {
           return MsgResponse.fail();
        }
    }

    /**
     * 查询权限列表
     * @return
     */
    @RequestMapping(value = "/showAuthorization",method = RequestMethod.GET)
    public ModelAndView showAuthorization(){
        ModelAndView modelAndView=new ModelAndView();
        Map<String, Object> allAuthorization = userService.getAllAuthorization();
        modelAndView.addObject("list",allAuthorization);
        modelAndView.setViewName("/admin/showAuthorization");
        return  modelAndView;
    }

    /**
     * 跳转权限添加
     * @return
     */
    @RequestMapping(value = "/authorization-add",method = RequestMethod.GET)
    public ModelAndView toAddAuthorization(){
        ModelAndView modelAndView=new ModelAndView();
        List<SysMenu> SysMenu = userService.getSysMenuInfoByPid(0);
        modelAndView.addObject("SysMenu",SysMenu);
        modelAndView.setViewName("/admin/authorization-add");
        return modelAndView;
    }

    /**
     * 权限添加
     * @param authorizationName
     * @param description
     * @return
     */
    @RequestMapping(value = "/addAuthorization",method = RequestMethod.POST)
    public MsgResponse addAuthorization(@RequestParam(value = "parentTrId") Integer parentTrId,
                                @RequestParam(value = "authorizationName",required = true) String authorizationName,
                                @RequestParam(value = "description",required = true) String description){
        return  userService.insertAuthorization(parentTrId, authorizationName, description);
    }

    /**
     * 跳转修改权限
     * @param id
     * @return
     */
    @RequestMapping(value = "/to-authorization-edit",method = RequestMethod.GET)
    public ModelAndView toAuthorizationEdit(@RequestParam(value = "id",required = true) Integer id){
        ModelAndView modelAndView=new ModelAndView();
        Authorizations authorizations = userService.queryAuthorizationById(id);
        modelAndView.addObject("authorizations",authorizations);
        modelAndView.setViewName("/admin/authorization-edit");
        return modelAndView;
    }
    /**
     * 编辑修改权限
     */
    @RequestMapping(value = "/authorizationEdit",method = RequestMethod.POST)
    public MsgResponse authorizationEdit(@RequestParam(value = "authorizationName",required = true) String authorizationName,
                                          @RequestParam(value="description") String description,
                                          @Param(value = "status") String status,
                                          @RequestParam(value="id") Integer id ){
        Authorizations authorizations=new Authorizations();
        authorizations.setId(id);
        authorizations.setAuthorizationName(authorizationName);
        authorizations.setDescription(description);
        if(org.apache.commons.lang.StringUtils.isBlank(status)){
            authorizations.setStatus(-1);
        }else {
            authorizations.setStatus(0);
        }
        return userService.updateAuthorizationById(authorizations);
    }

    /**
     * 跳转到权限界面
     * @param id
     * @return
     */
    @RequiresPermissions("permission:addRolePermission")
    @RequestMapping(value = "to-add-role-permission",method = RequestMethod.GET)
    public ModelAndView toAddRolePremission(@RequestParam(value = "id") Integer id){
       ModelAndView modelAndView=new ModelAndView();
       Map<String,Object> map=Maps.newHashMap();
       RoleExample roleExample=new RoleExample();
       roleExample.createCriteria().andIdEqualTo(id);
       Map<String, Object> map1 = userService.selectRolesBywhere(roleExample);
       int status=(int) map1.get("status");
        if(status==1){
            List<Role>  rolesList =(List<Role>) map1.get("rolesList");
            map.put("roles",rolesList.get(0));
        }else {
            modelAndView.setViewName("/common/error");
            return modelAndView;
        }
        List<SysMenu1> sysMenuInfo = userService.getAllSysMenuInfo();
        map.put("menuInfo",sysMenuInfo);
       modelAndView.addObject("map",map);
       modelAndView.setViewName("/admin/role-premission-add");
       return modelAndView;
    }

    /**
     * 添加权限
     * @return
     */
    @Transactional(value = "mysqlTranscationManager",rollbackFor = Exception.class)
    @RequestMapping(value = "add-role-permission",method = RequestMethod.POST)
    public MsgResponse addRolePermission(@RequestParam(value = "rid",required = false) Integer rid,
                                    @RequestParam(value = "fMenuName",required =false ) List<Integer> fMenuNameList,
                                    @RequestParam(value = "sMenuName",required = false) List<Integer> sMenuNameList,
                                    @RequestParam(value = "authorizationName",required = false) List<Integer> authorizationNameList
                                    ){
        try {
            if (null==fMenuNameList||fMenuNameList.size()==0){
                return MsgResponse.isDefine("您一级菜单一个也没有选择哦！");
            }else {
                //每次分配新权限的时候，先删除原来的老角色菜单权限
                RoleSysmenu roleSysmenu=new RoleSysmenu();
                roleSysmenu.setRoleid(rid);
                userService.deleteRoleSysmenu(roleSysmenu);
                //根据前台的数据，重新分配新的权限(批量插入)
                fMenuNameList.forEach(fMenuName->{
                    insertRoleSystemuInfo(rid,fMenuName);
                });
                if(null==sMenuNameList|| sMenuNameList.size()==0){
                    return MsgResponse.isDefine("您二级菜单一个也没有选择哦！");
                }else {
                    sMenuNameList.forEach(sMenuName->{
                        insertRoleSystemuInfo(rid,sMenuName);
                    });
                    if(null==authorizationNameList||authorizationNameList.size()==0){
                        return MsgResponse.isDefine("你还没有选择具体权限！");
                    }else {
                        //每次分配权限的时候，先删除原来老的角色权限
                        RoleAuthorization roleAuthorization=new RoleAuthorization();
                        roleAuthorization.setRoleId(rid);
                        userService.deleteRoleAuthorization(roleAuthorization);
                        authorizationNameList.forEach(authorizationName->{
                            RoleAuthorization roleAuthorization1=new RoleAuthorization();
                            roleAuthorization1.setRoleId(rid);
                            roleAuthorization1.setAuthorizationId(authorizationName);
                            roleAuthorization1.setGmtCreate(new Date());
                            roleAuthorization1.setStatus(0);
                            asyncTaskService.executeAsyncTask(userService.insertRoleAuthorization(roleAuthorization1));
                        });
                    }
                }
            }
            return MsgResponse.success();
        }catch (Exception e){
            e.printStackTrace();
            return MsgResponse.fail();
        }

    }

    /**
     * 插入
     * @param rid
     * @param menuid
     */
    public void insertRoleSystemuInfo(Integer rid,Integer menuid){
        String currentUser = String.valueOf(SecurityUtils.getSubject().getPrincipal());
        RoleSysmenu roleSysmenu=new RoleSysmenu();
        roleSysmenu.setMenuId(menuid);
        roleSysmenu.setRoleid(rid);
        roleSysmenu.setGmtCreate(new Date());
        roleSysmenu.setCreater(currentUser);
        roleSysmenu.setStatus(0);
        //开个线程让你快点执行
        asyncTaskService.executeAsyncTask(userService.insertRoleSysmenu(roleSysmenu));
    }
    /**
     * 跳转初始化权限的地方
     * @param
     * @return
     */
    @RequiresPermissions("permissionInit:permissionInitList")
    @RequestMapping(value = "/to-PermissionInit",method = RequestMethod.GET)
    public ModelAndView toPermissionInit(){
        ModelAndView modelAndView=new ModelAndView();
        SysPermissionInitExample sysPermissionInitExample=new SysPermissionInitExample();
        sysPermissionInitExample.createCriteria().andStatusEqualTo(0);
        List<SysPermissionInit> sysPermissionInit = userService.getSysPermissionInit(sysPermissionInitExample);
        modelAndView.addObject("list",sysPermissionInit);
        modelAndView.setViewName("/admin/permissionInit-list");
        return modelAndView;
    }
    /**
     * 跳转到菜单列表
     * @return
     */
    @RequestMapping(value = "sysmenu-list",method = RequestMethod.GET)
    public ModelAndView toSysMenus(){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("/admin/sysmenu-list");
        return modelAndView;
    }

    /**
     * 跳转到权限界面
     * @param
     * @return
     */
    @RequiresPermissions("permissionInit:add")
    @RequestMapping(value = "permissionInit-add",method = RequestMethod.GET)
    public ModelAndView toAddPermissionInit(){
        ModelAndView modelAndView=new ModelAndView();
        Map<String,Object> map=Maps.newHashMap();
        modelAndView.addObject("map",map);
        modelAndView.setViewName("/admin/permissionInit-add");
        return modelAndView;
    }


    @RequestMapping(value = "addPermissionInit",method = RequestMethod.POST)
    public MsgResponse addPermissionInit(@RequestParam(value = "permissionInit",required = false) String permissionInit,
                                         @RequestParam(value = "url",required =false ) String url,
                                         @RequestParam(value = "permissionType",required = false) String permissionType
    ){
        SysPermissionInit sysPermissionInit=new SysPermissionInit();
        sysPermissionInit.setPermissionInit(permissionInit);
        sysPermissionInit.setPermissionType(permissionType);
        sysPermissionInit.setUrl(url);
        return userService.insertSysPermissionInit(sysPermissionInit);
    }

    @RequestMapping(value = "mytest",method = RequestMethod.GET)
    public void getText(){
        String filePath="D:\\etp20180401.xls";
        mailService.sendAttachmentsMail("459816669@qq.com", "主题：带附件的邮件", "有附件，请查收！", filePath);
    }





   // ---------------------------------------------

    @RequestMapping(value = "toProsceniumLogin",method = RequestMethod.GET)
    public ModelAndView toProsceniumLogin(){
        return  new ModelAndView("index-2");
    }
}
