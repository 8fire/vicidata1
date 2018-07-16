package com.csjscm.mysqldata.dao;


import com.csjscm.mysqldata.model.SysPermissionInit;
import com.csjscm.mysqldata.model.SysPermissionInitExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SysPermissionInitMapper {
    long countByExample(SysPermissionInitExample example);

    int deleteByExample(SysPermissionInitExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysPermissionInit record);

    int insertSelective(SysPermissionInit record);

    List<SysPermissionInit> selectByExample(SysPermissionInitExample example);

    SysPermissionInit selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SysPermissionInit record, @Param("example") SysPermissionInitExample example);

    int updateByExample(@Param("record") SysPermissionInit record, @Param("example") SysPermissionInitExample example);

    int updateByPrimaryKeySelective(SysPermissionInit record);

    int updateByPrimaryKey(SysPermissionInit record);
}