package com.csjscm.mysqldata.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
@Data
public class Article extends BaseQuery implements Serializable {

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

    private String createUser;

    private Date gmtCreate;

    private Date gmtMidifity;

    private String context;
    //点赞次数
    private String pointPraise;

    private String checkUser;

    private Date checkDate;

    private String checkAdvice;

    //阅读次数
    private Integer readTime;

    private Integer isdelete;

}