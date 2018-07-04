package com.csjscm.mysqldata.model;

import lombok.Data;

import java.util.Date;
@Data
public class MemberUser {
    private Integer id;

    private String login_phone;

    private String login_email;

    private String login_password;

    private Date gmt_create;

    private Date gmt_modified;

    private Integer status;

    private String credentialssalt;

    private Date last_login_time;

    private Integer login_count;

    private String username;

    private String card_id;

    private String checkuser;

    private String checkadvice;

    private String checkdate;
}