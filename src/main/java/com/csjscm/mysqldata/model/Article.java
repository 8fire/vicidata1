package com.csjscm.mysqldata.model;

import lombok.Data;

import java.util.Date;
@Data
public class Article {
    private String id;

    private String title;

    private String description;

    private String articleSite;

    private String articleType;

    private String articlePic;

    private String articleSource;

    private String articleUrl;

    private Integer status;

    private String province;

    private Integer isTop;

    private String organization;

    private String attachment;

    private Long createOperator;

    private Date gmtCreate;

    private Date gmtMidifity;

    private String context;

}