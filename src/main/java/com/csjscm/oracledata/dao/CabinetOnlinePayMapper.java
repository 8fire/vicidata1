package com.csjscm.oracledata.dao;

import com.csjscm.oracledata.model.CabinetOnlinePay;
import com.csjscm.oracledata.model.CabinetOnlinePayExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CabinetOnlinePayMapper {
    long countByExample(CabinetOnlinePayExample example);

    int deleteByExample(CabinetOnlinePayExample example);

    int deleteByPrimaryKey(String id);

    int insert(CabinetOnlinePay record);

    int insertSelective(CabinetOnlinePay record);

    List<CabinetOnlinePay> selectByExample(CabinetOnlinePayExample example);
    List<CabinetOnlinePay> selectAll();

    CabinetOnlinePay selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") CabinetOnlinePay record, @Param("example") CabinetOnlinePayExample example);

    int updateByExample(@Param("record") CabinetOnlinePay record, @Param("example") CabinetOnlinePayExample example);

    int updateByPrimaryKeySelective(CabinetOnlinePay record);

    int updateByPrimaryKey(CabinetOnlinePay record);
}