package com.csjscm.mysqldata.model;

import lombok.Data;
import java.io.Serializable;
import java.util.Date;


/**
 * 角色权限
 *
 * @author csjscm
 * create 2018-05-14 下午 1:33
 **/
@Data
public class RoleAuth implements Serializable {
    private Integer id;
    //private Integer roleId;
    private Integer authorizationType;
    private Date gmtCreate;
    private Date gmtModify;
    private Integer status;
    private Authorizations authorizationsList;
    private Role role;
}
