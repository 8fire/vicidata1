package com.csjscm.mysqldata.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class UserRoles implements Serializable{
    private Integer id;

    private Integer userId;

    private Integer roleId;

    //private List<MemberUser> memberUserList;

    //private List<Role> roleList;

    private Date gmtTime;

    private Date gmtModify;

    private Integer status;

    private Integer menuid;


}