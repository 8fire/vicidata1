package com.csjscm.mysqldata.dao;

import com.csjscm.mysqldata.model.ArticleType;
import com.csjscm.mysqldata.model.ArticleTypeQuery;

import java.util.List;

public interface ArticleTypeMapper {
    int deleteByPrimaryKey(String id);

    int insert(ArticleType record);

    int insertSelective(ArticleType record);

    ArticleType selectByPrimaryKey(String id);
    List<ArticleType> selectArticleTypeList(ArticleTypeQuery articleTypeQuery);
    Integer selectArticleTypeListCount(ArticleTypeQuery articleTypeQuery);

    int updateByPrimaryKeySelective(ArticleType record);

    int updateByPrimaryKey(ArticleType record);
}