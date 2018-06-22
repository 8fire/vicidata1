package com.csjscm.oracledata.dao;

import com.csjscm.oracledata.model.MoveOrder;
import com.csjscm.oracledata.model.MoveOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MoveOrderMapper {
    long countByExample(MoveOrderExample example);

    int deleteByExample(MoveOrderExample example);

    int deleteByPrimaryKey(String ticketno);

    int insert(MoveOrder record);

    int insertSelective(MoveOrder record);

    List<MoveOrder> selectByExample(MoveOrderExample example);

    MoveOrder selectByPrimaryKey(String ticketno);

    int updateByExampleSelective(@Param("record") MoveOrder record, @Param("example") MoveOrderExample example);

    int updateByExample(@Param("record") MoveOrder record, @Param("example") MoveOrderExample example);

    int updateByPrimaryKeySelective(MoveOrder record);

    int updateByPrimaryKey(MoveOrder record);
}