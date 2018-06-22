package com.csjscm.mysqldata.service;


import com.csjscm.mysqldata.model.*;
import com.vici.response.MsgResponse;

import java.util.List;
import java.util.Map;

/**
 * Created by lxg
 * on 2017/2/21.
 */

public interface UserService {
    /**
     * 根据用户名查询用户信息
     * @param name
     * @return
     */
    MemberUser findByUsername(String name);

    /**
     * 根据对象查询用户信息
     * @param memberUser
     * @return
     */
    Map<String, Object> selectBywhere(MemberUser memberUser);

    int updateByid(Map<String, Object> map);

    Map<String, Object> selectMenuInfo();

    Map<String, Object> selectRolesBywhere(RoleExample roleExample);

    Map<String, Object> insertUserRoles(userRoles userRoles);

    Map<String, Object> updateUserRoleByid(userRoles userRoles);

    Map<String, Object> queryForUserRoles(Map<String, Object> mapId);

    Map<String, Object> selectRoleByExample();

    Map<String, Object> selectRoleAuthorByWhere(Map<String, Object> map);

    /**
     * 查询所有权限
     * @return
     */
    Map<String,Object> getAllAuthorization();

    /**
     * 添加权限
     * @param authorizationName
     * @param description
     * @return
     */
    MsgResponse insertAuthorization(Integer parentTrId,String authorizationName, String description);

    /**
     * 根据ID查询权限
     * @param id
     * @return
     */
    Authorizations queryAuthorizationById(Integer id);

    /**
     * 更新权限
     * @param authorizations
     * @return
     */
    MsgResponse updateAuthorizationById(Authorizations authorizations);

    /**
     * 查询所有没有被禁用的角色
     * @return
     */
    Map<String,Object> getAllRoles();

    /**
     * 添加角色
     * @param authorizationName
     * @param description
     * @return
     */
    MsgResponse insertRole(String authorizationName, String description);

    /**
     * 根据ID查询权限
     * @param id
     * @return
     */
    Authorizations queryRoleById(Integer id);

    /**
     * 修改角色
     * @param role
     * @param roleExample
     * @return
     */
    MsgResponse updateRoleById(Role role,RoleExample roleExample);

    /**
     * 查询系统菜单（主子关系的）
     * @return
     */
    List<SysMenu1> getSysMenuInfo();
    /**
     * 查询系统菜单和权限
     * @return
     */
    List<SysMenu1> getAllSysMenuInfo();
    /**
     * 添加角色-菜单
     */
    MsgResponse insertRoleSysmenu(RoleSysmenu roleSysmenu);

    /**
     * 删除角色-菜单
     * @param roleSysmenu
     * @return
     */
    MsgResponse deleteRoleSysmenu(RoleSysmenu roleSysmenu);

    /**
     * 添加角色权限
     * @param roleAuthorization
     * @return
     */
    MsgResponse insertRoleAuthorization(RoleAuthorization roleAuthorization);

    /**
     * 删除角色权限
     * @param roleAuthorization
     * @return
     */
    MsgResponse deleteRoleAuthorization(RoleAuthorization roleAuthorization);

    /**
     * 根据父节点查询菜单
     * @param id
     * @return
     */
    List<SysMenu> getSysMenuInfoByPid(Integer id);
}
