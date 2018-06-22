package com.csjscm.mysqldata.dao;

import com.csjscm.mysqldata.model.QUserRoles;
import com.csjscm.mysqldata.model.userRoles;
import com.csjscm.mysqldata.model.userRolesExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface userRolesMapper {
    long countByExample(userRolesExample example);

    int deleteByExample(userRolesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(userRoles record);

    int insertSelective(userRoles record);

    List<userRoles> selectByExample(userRolesExample example);

    userRoles selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") userRoles record, @Param("example") userRolesExample example);

    int updateByExample(@Param("record") userRoles record, @Param("example") userRolesExample example);

    int updateByPrimaryKeySelective(userRoles record);

    int updateByPrimaryKey(userRoles record);
    List<QUserRoles> queryForUserRoles(Map<String,Object> map);
}