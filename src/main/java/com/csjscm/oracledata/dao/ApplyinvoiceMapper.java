package com.csjscm.oracledata.dao;

import com.csjscm.oracledata.model.Applyinvoice;
import com.csjscm.oracledata.model.ApplyinvoiceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ApplyinvoiceMapper {
    long countByExample(ApplyinvoiceExample example);

    int deleteByExample(ApplyinvoiceExample example);

    int deleteByPrimaryKey(String ticketno);

    int insert(Applyinvoice record);

    int insertSelective(Applyinvoice record);

    List<Applyinvoice> selectByExample(ApplyinvoiceExample example);

    Applyinvoice selectByPrimaryKey(String ticketno);

    int updateByExampleSelective(@Param("record") Applyinvoice record, @Param("example") ApplyinvoiceExample example);

    int updateByExample(@Param("record") Applyinvoice record, @Param("example") ApplyinvoiceExample example);

    int updateByPrimaryKeySelective(Applyinvoice record);

    int updateByPrimaryKey(Applyinvoice record);
}