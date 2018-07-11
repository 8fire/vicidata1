package com.csjscm.mysqldata.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
@Data
public class ArticleType implements Serializable{
    private String id;

    private String typename;

    private Date gmtCreate;

    private Date gmtModified;

    private Integer isdelete;

}