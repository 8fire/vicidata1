package com.csjscm.oracledata.dao;

import com.csjscm.oracledata.model.EnterpriceInfo;
import com.csjscm.oracledata.model.EnterpriceInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EnterpriceInfoMapper {
    long countByExample(EnterpriceInfoExample example);

    int deleteByExample(EnterpriceInfoExample example);

    int deleteByPrimaryKey(String id);

    int insert(EnterpriceInfo record);

    int insertSelective(EnterpriceInfo record);

    List<EnterpriceInfo> selectByExample(EnterpriceInfoExample example);

    EnterpriceInfo selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") EnterpriceInfo record, @Param("example") EnterpriceInfoExample example);

    int updateByExample(@Param("record") EnterpriceInfo record, @Param("example") EnterpriceInfoExample example);

    int updateByPrimaryKeySelective(EnterpriceInfo record);

    int updateByPrimaryKey(EnterpriceInfo record);
}