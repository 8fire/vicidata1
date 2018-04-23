package com.qiming.qimingdata.model;

import java.util.Date;

public class MemberUser {
    private String id;

    private String login_phone;

    private String login_email;

    private String login_password;

    private Date gmt_create;

    private Date gmt_modified;

    private Integer status;

    private String credentialssalt;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getLogin_phone() {
        return login_phone;
    }

    public void setLogin_phone(String login_phone) {
        this.login_phone = login_phone;
    }

    public String getLogin_email() {
        return login_email;
    }

    public void setLogin_email(String login_email) {
        this.login_email = login_email;
    }

    public String getLogin_password() {
        return login_password;
    }

    public void setLogin_password(String login_password) {
        this.login_password = login_password;
    }

    public Date getGmt_create() {
        return gmt_create;
    }

    public void setGmt_create(Date gmt_create) {
        this.gmt_create = gmt_create;
    }

    public Date getGmt_modified() {
        return gmt_modified;
    }

    public void setGmt_modified(Date gmt_modified) {
        this.gmt_modified = gmt_modified;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getCredentialssalt() {
        return credentialssalt;
    }

    public void setCredentialssalt(String credentialssalt) {
        this.credentialssalt = credentialssalt == null ? null : credentialssalt.trim();
    }
}