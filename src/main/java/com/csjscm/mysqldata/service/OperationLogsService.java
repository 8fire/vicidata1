package com.csjscm.mysqldata.service;

import com.csjscm.oracledata.model.ModelExecl;
import com.csjscm.oracledata.model.OperationLog;
import com.csjscm.oracledata.model.OperationLogDTO;

import java.util.List;

/**
 * 操作日志查询
 *
 * @author csjscm
 * create 2018-06-08 上午 11:59
 **/
public interface OperationLogsService {

    //获取列表数据
    List<OperationLog> selectOperationLogAll(OperationLogDTO operationLogDTO);

    //获取数量
    int selectOperationLogCount(OperationLogDTO operationLogDTO);

    //查询导入模板
    List<ModelExecl> findModelExcelAll();

}
