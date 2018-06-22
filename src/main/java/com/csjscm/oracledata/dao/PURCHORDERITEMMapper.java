package com.csjscm.oracledata.dao;

import com.csjscm.oracledata.model.PURCHORDERITEM;
import com.csjscm.oracledata.model.PURCHORDERITEMExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PURCHORDERITEMMapper {
    long countByExample(PURCHORDERITEMExample example);

    int deleteByExample(PURCHORDERITEMExample example);

    int deleteByPrimaryKey(String id);

    int insert(PURCHORDERITEM record);

    int insertSelective(PURCHORDERITEM record);

    List<PURCHORDERITEM> selectByExample(PURCHORDERITEMExample example);

    PURCHORDERITEM selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") PURCHORDERITEM record, @Param("example") PURCHORDERITEMExample example);

    int updateByExample(@Param("record") PURCHORDERITEM record, @Param("example") PURCHORDERITEMExample example);

    int updateByPrimaryKeySelective(PURCHORDERITEM record);

    int updateByPrimaryKey(PURCHORDERITEM record);
}