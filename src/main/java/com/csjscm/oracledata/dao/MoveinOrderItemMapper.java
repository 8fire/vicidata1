package com.csjscm.oracledata.dao;

import com.csjscm.oracledata.model.MoveinOrderItem;
import com.csjscm.oracledata.model.MoveinOrderItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MoveinOrderItemMapper {
    long countByExample(MoveinOrderItemExample example);

    int deleteByExample(MoveinOrderItemExample example);

    int deleteByPrimaryKey(String id);

    int insert(MoveinOrderItem record);

    int insertSelective(MoveinOrderItem record);

    List<MoveinOrderItem> selectByExample(MoveinOrderItemExample example);

    MoveinOrderItem selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") MoveinOrderItem record, @Param("example") MoveinOrderItemExample example);

    int updateByExample(@Param("record") MoveinOrderItem record, @Param("example") MoveinOrderItemExample example);

    int updateByPrimaryKeySelective(MoveinOrderItem record);

    int updateByPrimaryKey(MoveinOrderItem record);
}