package com.csjscm.mysqldata.model;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class SysMenu1 {
    private Integer id1;

    private String menuName1;

    private Integer userRoleId1;

    private Date gmtTime1;

    private Integer status1;

    private Date gmtModified1;

    private Integer parentId;

    private String url1;
    List<Authorizations> authorizationsList;
}