package com.csjscm.mysqldata.dao;

import com.csjscm.mysqldata.model.SettleAccount;
import com.csjscm.mysqldata.model.SettleAccountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SettleAccountMapper {
    long countByExample(SettleAccountExample example);

    int deleteByExample(SettleAccountExample example);

    int insert(SettleAccount record);

    int insertSelective(SettleAccount record);

    List<SettleAccount> selectByExample(SettleAccountExample example);

    int updateByExampleSelective(@Param("record") SettleAccount record, @Param("example") SettleAccountExample example);

    int updateByExample(@Param("record") SettleAccount record, @Param("example") SettleAccountExample example);
}