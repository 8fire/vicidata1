package com.qiming.qimingdata.model;

import java.io.Serializable;
import java.util.Date;

public class SettleAccount implements Serializable{
    private String id;

    private String userid;

    private String account;

    private String ispublic;

    private String realname;

    private Date gmtCreate;

    private Date gmtModified;

    private Integer isdelete;

    private String settlementid;

    private String channel;

    private String pingobject;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    public String getIspublic() {
        return ispublic;
    }

    public void setIspublic(String ispublic) {
        this.ispublic = ispublic == null ? null : ispublic.trim();
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
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

    public Integer getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(Integer isdelete) {
        this.isdelete = isdelete;
    }

    public String getSettlementid() {
        return settlementid;
    }

    public void setSettlementid(String settlementid) {
        this.settlementid = settlementid == null ? null : settlementid.trim();
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel == null ? null : channel.trim();
    }

    public String getPingobject() {
        return pingobject;
    }

    public void setPingobject(String pingobject) {
        this.pingobject = pingobject == null ? null : pingobject.trim();
    }
}