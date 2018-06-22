package com.csjscm.mysqldata.model;

import lombok.Data;

/**
 * 请求实体类
 *
 * @author csjscm
 * create 2018-05-29 下午 2:41
 **/
@Data
public class RequestInfo {
    private String host;
    private String path;
    private String no;
    private String type;
}
