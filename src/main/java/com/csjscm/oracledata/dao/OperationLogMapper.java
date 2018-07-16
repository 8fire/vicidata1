package com.csjscm.oracledata.dao;


import com.csjscm.oracledata.model.OperationLog;
import com.csjscm.oracledata.model.OperationLogDTO;

import java.util.List;

public interface OperationLogMapper {

    //获取列表数据
    List<OperationLog> selectOperationLogAll(OperationLogDTO operationLogDTO);

    //获取数量
    int selectOperationLogCount(OperationLogDTO operationLogDTO);

    //插入数据
    int insertOperationLog(OperationLog operationLog);


    //修改数据
    int updateOperationLog(OperationLog operationLog);


}