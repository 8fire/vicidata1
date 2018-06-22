package com.csjscm.mysqldata.model;

import java.util.Date;

public class RoleAuthorization {
    private Integer id;

    private Integer roleId;

    private Integer authorizationId;

    private Integer authorizationType;

    private Date gmtCreate;

    private Date gmtModify;

    private Integer status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getAuthorizationId() {
        return authorizationId;
    }

    public void setAuthorizationId(Integer authorizationId) {
        this.authorizationId = authorizationId;
    }

    public Integer getAuthorizationType() {
        return authorizationType;
    }

    public void setAuthorizationType(Integer authorizationType) {
        this.authorizationType = authorizationType;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModify() {
        return gmtModify;
    }

    public void setGmtModify(Date gmtModify) {
        this.gmtModify = gmtModify;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}