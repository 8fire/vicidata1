package com.csjscm.oracledata.dao;

import com.csjscm.oracledata.model.MoveOrderItem;
import com.csjscm.oracledata.model.MoveOrderItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MoveOrderItemMapper {
    long countByExample(MoveOrderItemExample example);

    int deleteByExample(MoveOrderItemExample example);

    int deleteByPrimaryKey(String id);

    int insert(MoveOrderItem record);

    int insertSelective(MoveOrderItem record);

    List<MoveOrderItem> selectByExample(MoveOrderItemExample example);

    MoveOrderItem selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") MoveOrderItem record, @Param("example") MoveOrderItemExample example);

    int updateByExample(@Param("record") MoveOrderItem record, @Param("example") MoveOrderItemExample example);

    int updateByPrimaryKeySelective(MoveOrderItem record);

    int updateByPrimaryKey(MoveOrderItem record);
}