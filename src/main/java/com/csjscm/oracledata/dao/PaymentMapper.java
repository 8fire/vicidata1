package com.csjscm.oracledata.dao;

import com.csjscm.oracledata.model.Payment;
import com.csjscm.oracledata.model.PaymentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PaymentMapper {
    long countByExample(PaymentExample example);

    int deleteByExample(PaymentExample example);

    int deleteByPrimaryKey(String ticketno);

    int insert(Payment record);

    int insertSelective(Payment record);

    List<Payment> selectByExample(PaymentExample example);

    Payment selectByPrimaryKey(String ticketno);

    int updateByExampleSelective(@Param("record") Payment record, @Param("example") PaymentExample example);

    int updateByExample(@Param("record") Payment record, @Param("example") PaymentExample example);

    int updateByPrimaryKeySelective(Payment record);

    int updateByPrimaryKey(Payment record);
}