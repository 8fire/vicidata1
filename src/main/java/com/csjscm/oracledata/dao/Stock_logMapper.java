package com.csjscm.oracledata.dao;

import com.csjscm.oracledata.model.Stock_log;
import com.csjscm.oracledata.model.Stock_logExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Stock_logMapper {
    long countByExample(Stock_logExample example);

    int deleteByExample(Stock_logExample example);

    int deleteByPrimaryKey(String id);

    int insert(Stock_log record);

    int insertSelective(Stock_log record);

    List<Stock_log> selectByExample(Stock_logExample example);

    Stock_log selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Stock_log record, @Param("example") Stock_logExample example);

    int updateByExample(@Param("record") Stock_log record, @Param("example") Stock_logExample example);

    int updateByPrimaryKeySelective(Stock_log record);

    int updateByPrimaryKey(Stock_log record);
}