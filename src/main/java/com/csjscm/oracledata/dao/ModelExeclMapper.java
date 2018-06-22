package com.csjscm.oracledata.dao;

import com.csjscm.oracledata.model.ModelExecl;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ModelExeclMapper {

    List<ModelExecl> findModelExcelAll();

    int deleteByPrimaryKey(String id);
    ModelExecl selectByPrimaryKey(String id);


}