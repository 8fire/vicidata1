package com.csjscm.mysqldata.model;

import java.util.Date;

public class Authorizations {
    private Integer id;

    private Integer parentTrId;

    private String authorizationName;

    private String description;

    private Date gmtCreate;

    private Date gmtModified;

    private Integer status;

    private String creater;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getParentTrId() {
        return parentTrId;
    }

    public void setParentTrId(Integer parentTrId) {
        this.parentTrId = parentTrId;
    }

    public String getAuthorizationName() {
        return authorizationName;
    }

    public void setAuthorizationName(String authorizationName) {
        this.authorizationName = authorizationName == null ? null : authorizationName.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater == null ? null : creater.trim();
    }
}