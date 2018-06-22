package com.csjscm.mysqldata.dao;

import com.csjscm.mysqldata.model.RoleAuthorization;
import com.csjscm.mysqldata.model.RoleAuthorizationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleAuthorizationMapper {
    long countByExample(RoleAuthorizationExample example);

    int deleteByExample(RoleAuthorizationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RoleAuthorization record);

    int insertSelective(RoleAuthorization record);

    List<RoleAuthorization> selectByExample(RoleAuthorizationExample example);

    RoleAuthorization selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RoleAuthorization record, @Param("example") RoleAuthorizationExample example);

    int updateByExample(@Param("record") RoleAuthorization record, @Param("example") RoleAuthorizationExample example);

    int updateByPrimaryKeySelective(RoleAuthorization record);

    int updateByPrimaryKey(RoleAuthorization record);
}