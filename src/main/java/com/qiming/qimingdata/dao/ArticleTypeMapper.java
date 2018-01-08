package com.qiming.qimingdata.dao;

import com.qiming.qimingdata.model.ArticleType;

import java.util.List;

public interface ArticleTypeMapper {
    int deleteByPrimaryKey(String id);

    int insert(ArticleType record);

    int insertSelective(ArticleType record);

    ArticleType selectByPrimaryKey(String id);
    List<ArticleType> selectArticleTypeList();

    int updateByPrimaryKeySelective(ArticleType record);

    int updateByPrimaryKey(ArticleType record);
}