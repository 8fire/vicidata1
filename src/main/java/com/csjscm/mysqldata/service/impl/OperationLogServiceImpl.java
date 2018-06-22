package com.csjscm.mysqldata.service.impl;

import com.csjscm.oracledata.dao.EnterpriceInfoMapper;
import com.csjscm.oracledata.dao.ModelExeclMapper;
import com.csjscm.oracledata.dao.OperationLogMapper;
import com.csjscm.oracledata.model.*;
import com.csjscm.mysqldata.service.OperationLogsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class OperationLogServiceImpl implements OperationLogsService{
    @Resource
    private OperationLogMapper operationLogMapper;
    @Resource
    private ModelExeclMapper modelExeclMapper;
    @Resource
    private EnterpriceInfoMapper enterpriceInfoMapper;


    @Override
    public List<OperationLog> selectOperationLogAll(OperationLogDTO operationLogDTO) {
        return operationLogMapper.selectOperationLogAll(operationLogDTO);
    }

    @Override
    public int selectOperationLogCount(OperationLogDTO operationLogDTO) {
        return operationLogMapper.selectOperationLogCount(operationLogDTO);

    }

    @Override
    public List<ModelExecl> findModelExcelAll() {
        List<ModelExecl> modelExcelAll = modelExeclMapper.findModelExcelAll();
        for (ModelExecl modelExecl:modelExcelAll){
            EnterpriceInfoExample enterpriceInfoExample=new EnterpriceInfoExample();
            enterpriceInfoExample.createCriteria().andRequestidEqualTo(modelExecl.getServicer());
            List<EnterpriceInfo> enterpriceInfos = enterpriceInfoMapper.selectByExample(enterpriceInfoExample);
            modelExecl.setEnterpriceName(enterpriceInfos.get(0).getName());
        }
        return modelExcelAll;
    }
}
