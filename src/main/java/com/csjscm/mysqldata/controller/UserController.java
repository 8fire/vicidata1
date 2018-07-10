package com.csjscm.mysqldata.controller;


import com.google.code.kaptcha.Constants;
import com.google.code.kaptcha.Producer;
import com.google.common.collect.Maps;
import com.csjscm.mysqldata.model.*;
import com.csjscm.mysqldata.service.UserService;
import com.csjscm.mysqldata.service.impl.AsyncTaskService;
import com.csjscm.mysqldata.service.impl.MailService;
import com.csjscm.mysqldata.service.impl.RedisServiceImpl;
import com.vici.AppStringUtils;
import com.vici.request.RequestUtils;
import com.vici.response.MsgResponse;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import net.sf.json.JSONObject;
import org.apache.commons.lang.StringUtils;
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
        String name = "";
        if (AppStringUtils.isNumeric(loginPhone)) {
            name = loginPhone;
            user.setLogin_phone(name);
        } else {
            name = loginPhone;
            user.setLogin_email(name);
        }
        UsernamePasswordToken token = new UsernamePasswordToken(name, loginPassword,Boolean.parseBoolean(rememberMe));
        Subject currentUser = SecurityUtils.getSubject();
        try {
            currentUser.login(token);
            jsonObject.put("token", currentUser.getSession().getId());
            System.out.println(currentUser.getSession().getId());
            jsonObject.put("msg", "登录成功");
            //获取当前登录对象
            String principal = (String) SecurityUtils.getSubject().getPrincipal();
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
        session.setAttribute(Constants.KAPTCHA_SESSION_KEY, capText);
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
        String code = (String)session.getAttribute(Constants.KAPTCHA_SESSION_KEY);
        if(StringUtils.isNotBlank(kaptchaCode)&&kaptchaCode.equalsIgnoreCase(code)){
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
            log.info("========>"+e.getMessage());
        }
        return new ModelAndView("login");
    }


    /**
     * 首页
     * @return
     */
    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public ModelAndView viewex(){
        ModelAndView modelAndView=new ModelAndView();
        List<SysMenu1> test = userService.getSysMenuInfo();
        modelAndView.addObject("menuList",test);
        modelAndView.setViewName("index");
        return modelAndView;
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
    @RequestMapping(value = "/tologin",method = RequestMethod.GET)
    public ModelAndView toLogin(){
        return new ModelAndView("login");
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
     * 跳转到添加页面
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
     *跳转到编辑
     * @param id
     * @return
     */
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
     * 编辑
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
         if(StringUtils.isBlank(status)){
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
            mv.addObject("list",map.get("MemberUser"));
            mv.setViewName("admin/admin-list");
            //写入rides
            redisService.set("memberRides",map.get("MemberUser"));
            //List<MemberUser> memberRides = (List<MemberUser>)redisService.get("memberRides");
           // System.out.println(memberRides);
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
    public MsgResponse updateUserStatus(@Param("id") String id,
                                        @Param("flag") int flag){
        Map<String,Object> map= Maps.newHashMap();
        Integer id1=Integer.parseInt(id);
        if(flag==0){//启用
            map.put("id",id1);
            map.put("status",0);
        }else {//禁用
            map.put("id",id1);
            map.put("status",-1);
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
    public Boolean isExistMemberUser(  @RequestParam( required=false,value = "id") String id,
                                       @RequestParam( required=false,value = "login_phone") String login_phone,
                                       @RequestParam(required=false,value = "login_email") String login_email,
                                       @RequestParam(required=false,value = "last_login_time") String last_login_time){
        MemberUser memberUser=new MemberUser();
        memberUser.setLogin_phone(login_phone);
        memberUser.setLogin_email(login_email);
        Map<String, Object> map = userService.selectBywhere(memberUser);
        int status = (int)map.get("status");
        if(status==1){
            return true;
        }else {
            return false;
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
     * 跳向修改密码
     * @return
     */
    @RequestMapping(value = "/adminPasswordEdit",method = RequestMethod.GET)
    public ModelAndView toAdminPassswordEdit(){
        return new ModelAndView("/admin/admin-password-edit");
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
        if(StringUtils.isBlank(status)){
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
     * 跳转到菜单列表
     * @return
     */
    @RequestMapping(value = "sysmenu-list",method = RequestMethod.GET)
    public ModelAndView toSysMenus(){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("/admin/sysmenu-list");
        return modelAndView;
    }


    @RequestMapping(value = "mytest",method = RequestMethod.GET)
    public void getText(){
        String filePath="D:\\etp20180401.xls";
        mailService.sendAttachmentsMail("459816669@qq.com", "主题：带附件的邮件", "有附件，请查收！", filePath);
    }

    @RequestMapping("test")
    public ModelAndView test1(){
        return  new ModelAndView("index-2");
    }
}
