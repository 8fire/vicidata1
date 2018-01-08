package com.qiming.qimingdata.dao;

import com.qiming.qimingdata.model.ArticleType;

public interface ArticleTypeMapper {
    int deleteByPrimaryKey(String id);

    int insert(ArticleType record);

    int insertSelective(ArticleType record);

    ArticleType selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ArticleType record);

    int updateByPrimaryKey(ArticleType record);
}