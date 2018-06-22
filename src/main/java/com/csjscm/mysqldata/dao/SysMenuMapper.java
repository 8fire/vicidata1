package com.csjscm.mysqldata.dao;

import com.csjscm.mysqldata.model.SysMenu;

import java.util.List;

import com.csjscm.mysqldata.model.SysMenu1;
import com.csjscm.mysqldata.model.SysMenuInfo;

public interface SysMenuMapper {


    int deleteByPrimaryKey(Integer id);

    int insert(SysMenu record);

    int insertSelective(SysMenu record);

    List<SysMenuInfo> selectMenuInfo();
    List<SysMenuInfo> selectMenuInfoByPid(Integer parentid);

    SysMenu selectByPrimaryKey(Integer id);


    int updateByPrimaryKeySelective(SysMenu record);

    int updateByPrimaryKey(SysMenu record);
    List<SysMenu1> getSysMenuInfo(Integer rid);
    List<SysMenu1> getAllSysMenuInfo();
    List<SysMenu> getSysMenuInfoByPid(Integer parentId);
}