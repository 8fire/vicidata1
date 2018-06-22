package com.csjscm.oracledata.dao;

import com.csjscm.oracledata.model.PURCHORDER;
import com.csjscm.oracledata.model.PURCHORDERExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PURCHORDERMapper {
    long countByExample(PURCHORDERExample example);

    int deleteByExample(PURCHORDERExample example);

    int deleteByPrimaryKey(String id);

    int insert(PURCHORDER record);

    int insertSelective(PURCHORDER record);

    List<PURCHORDER> selectByExample(PURCHORDERExample example);

    PURCHORDER selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") PURCHORDER record, @Param("example") PURCHORDERExample example);

    int updateByExample(@Param("record") PURCHORDER record, @Param("example") PURCHORDERExample example);

    int updateByPrimaryKeySelective(PURCHORDER record);

    int updateByPrimaryKey(PURCHORDER record);
}