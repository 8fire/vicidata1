package com.csjscm.mysqldata.model;

import java.util.Date;

public class Reply {
    private String id;

    private String replyComent;

    private String replyUser;

    private Date replyTime;

    private Date gmtModify;

    private Integer status;

    private String discussid;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getReplyComent() {
        return replyComent;
    }

    public void setReplyComent(String replyComent) {
        this.replyComent = replyComent == null ? null : replyComent.trim();
    }

    public String getReplyUser() {
        return replyUser;
    }

    public void setReplyUser(String replyUser) {
        this.replyUser = replyUser == null ? null : replyUser.trim();
    }

    public Date getReplyTime() {
        return replyTime;
    }

    public void setReplyTime(Date replyTime) {
        this.replyTime = replyTime;
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

    public String getDiscussid() {
        return discussid;
    }

    public void setDiscussid(String discussid) {
        this.discussid = discussid == null ? null : discussid.trim();
    }
}