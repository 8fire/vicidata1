package com.csjscm.oracledata.dao;

import com.csjscm.oracledata.model.InputInvoice;
import com.csjscm.oracledata.model.InputInvoiceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InputInvoiceMapper {
    long countByExample(InputInvoiceExample example);

    int deleteByExample(InputInvoiceExample example);

    int deleteByPrimaryKey(String ticketno);

    int insert(InputInvoice record);

    int insertSelective(InputInvoice record);

    List<InputInvoice> selectByExample(InputInvoiceExample example);

    InputInvoice selectByPrimaryKey(String ticketno);

    int updateByExampleSelective(@Param("record") InputInvoice record, @Param("example") InputInvoiceExample example);

    int updateByExample(@Param("record") InputInvoice record, @Param("example") InputInvoiceExample example);

    int updateByPrimaryKeySelective(InputInvoice record);

    int updateByPrimaryKey(InputInvoice record);
}