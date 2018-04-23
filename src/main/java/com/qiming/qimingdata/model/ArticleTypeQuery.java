package com.qiming.qimingdata.model;

import lombok.Data;

import java.io.Serializable;

/**
 * 文章类型查询实体类
 *
 * @author qiming
 * create 2018-01-10 下午 3:59
 **/
@Data
public class ArticleTypeQuery extends BaseQuery implements Serializable {
    private String id;
    private String typename;
}
