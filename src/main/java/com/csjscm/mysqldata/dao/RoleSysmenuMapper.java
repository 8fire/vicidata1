package com.csjscm.mysqldata.dao;

import com.csjscm.mysqldata.model.RoleSysmenu;
import com.csjscm.mysqldata.model.RoleSysmenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleSysmenuMapper {
    long countByExample(RoleSysmenuExample example);

    int deleteByExample(RoleSysmenuExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RoleSysmenu record);

    int insertSelective(RoleSysmenu record);

    List<RoleSysmenu> selectByExample(RoleSysmenuExample example);

    RoleSysmenu selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RoleSysmenu record, @Param("example") RoleSysmenuExample example);

    int updateByExample(@Param("record") RoleSysmenu record, @Param("example") RoleSysmenuExample example);

    int updateByPrimaryKeySelective(RoleSysmenu record);

    int updateByPrimaryKey(RoleSysmenu record);
}