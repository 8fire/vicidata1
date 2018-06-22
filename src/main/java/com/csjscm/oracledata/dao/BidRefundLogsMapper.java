package com.csjscm.oracledata.dao;

import com.csjscm.oracledata.model.BidRefundLogs;
import com.csjscm.oracledata.model.BidRefundLogsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BidRefundLogsMapper {
    long countByExample(BidRefundLogsExample example);

    int deleteByExample(BidRefundLogsExample example);

    int deleteByPrimaryKey(String id);

    int insert(BidRefundLogs record);

    int insertSelective(BidRefundLogs record);

    List<BidRefundLogs> selectByExample(BidRefundLogsExample example);

    BidRefundLogs selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") BidRefundLogs record, @Param("example") BidRefundLogsExample example);

    int updateByExample(@Param("record") BidRefundLogs record, @Param("example") BidRefundLogsExample example);

    int updateByPrimaryKeySelective(BidRefundLogs record);

    int updateByPrimaryKey(BidRefundLogs record);
}