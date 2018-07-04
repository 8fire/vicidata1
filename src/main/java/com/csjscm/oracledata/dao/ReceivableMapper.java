package com.csjscm.oracledata.dao;

import com.csjscm.oracledata.model.Receivable;
import com.csjscm.oracledata.model.ReceivableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReceivableMapper {
    long countByExample(ReceivableExample example);

    int deleteByExample(ReceivableExample example);

    int deleteByPrimaryKey(String ticketno);

    int insert(Receivable record);

    int insertSelective(Receivable record);

    List<Receivable> selectByExample(ReceivableExample example);

    Receivable selectByPrimaryKey(String ticketno);

    int updateByExampleSelective(@Param("record") Receivable record, @Param("example") ReceivableExample example);

    int updateByExample(@Param("record") Receivable record, @Param("example") ReceivableExample example);

    int updateByPrimaryKeySelective(Receivable record);

    int updateByPrimaryKey(Receivable record);
}