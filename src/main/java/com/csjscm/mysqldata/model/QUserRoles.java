package com.csjscm.mysqldata.model;

import lombok.Data;

import java.util.Date;

/**
 * @author csjscm
 * create 2018-05-14 上午 9:08
 **/
@Data
public class QUserRoles {
    private Integer id;
    private Integer userId;
    private Integer  roleId;
    private Date gmtTime;
    private Date gmtModify;
    private Integer  status;
    private String loginPhone;
    private String  loginEmail;
    private String roleName;
}
