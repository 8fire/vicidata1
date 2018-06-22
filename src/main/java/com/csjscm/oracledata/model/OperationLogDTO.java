package com.csjscm.oracledata.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class OperationLogDTO extends BaseQuery implements Serializable {//所有的查询条件

    //主键
    private String id;

    //操作人员
    private String operationuser;

    //操作日期
    private String operationdate;

    //0 新增 1删除  2修改 3 审核通过  4驳回  5撤回
    private Integer operationtype;

    //单号
    private String ticketno;

    //单据类型
    private String ordertype;

    //企业（裕达）
    private String enterprise;

    //平台企业名称 （裕大）
    private String enterprisename;

    //默认为0 是否对接 0不对接 1对接  2对接成功  3对接失败
    private Integer flag;

    //发送wms的信息
    private String responsemesg;

    //WMS返回结果
    private String requestmesg;

}