package com.csjscm.oracledata.dao;

import com.csjscm.oracledata.model.ApplyInvoiceItem;
import com.csjscm.oracledata.model.ApplyInvoiceItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ApplyInvoiceItemMapper {
    long countByExample(ApplyInvoiceItemExample example);

    int deleteByExample(ApplyInvoiceItemExample example);

    int deleteByPrimaryKey(String id);

    int insert(ApplyInvoiceItem record);

    int insertSelective(ApplyInvoiceItem record);

    List<ApplyInvoiceItem> selectByExample(ApplyInvoiceItemExample example);

    ApplyInvoiceItem selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ApplyInvoiceItem record, @Param("example") ApplyInvoiceItemExample example);

    int updateByExample(@Param("record") ApplyInvoiceItem record, @Param("example") ApplyInvoiceItemExample example);

    int updateByPrimaryKeySelective(ApplyInvoiceItem record);

    int updateByPrimaryKey(ApplyInvoiceItem record);
}