package com.csjscm.oracledata.dao;

import com.csjscm.oracledata.model.InputInvoiceItem;
import com.csjscm.oracledata.model.InputInvoiceItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InputInvoiceItemMapper {
    long countByExample(InputInvoiceItemExample example);

    int deleteByExample(InputInvoiceItemExample example);

    int deleteByPrimaryKey(String id);

    int insert(InputInvoiceItem record);

    int insertSelective(InputInvoiceItem record);

    List<InputInvoiceItem> selectByExample(InputInvoiceItemExample example);

    InputInvoiceItem selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") InputInvoiceItem record, @Param("example") InputInvoiceItemExample example);

    int updateByExample(@Param("record") InputInvoiceItem record, @Param("example") InputInvoiceItemExample example);

    int updateByPrimaryKeySelective(InputInvoiceItem record);

    int updateByPrimaryKey(InputInvoiceItem record);
}