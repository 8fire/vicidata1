package com.csjscm.mysqldata.model;

import lombok.Data;

import java.io.Serializable;

/**
 * 文章类型查询实体类
 *
 * @author csjscm
 * create 2018-01-10 下午 3:59
 **/
@Data
public class ArticleTypeQuery extends BaseQuery implements Serializable {
    private String id;
    private String typename;
}
