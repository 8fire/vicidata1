package com.csjscm.mysqldata.dao;

import com.csjscm.mysqldata.model.Article;

import java.util.List;

public interface ArticleMapper {


    List<Article> selectArticleByWhere(Article article);

    Article selectArticleById(String id);

    int insertArticle(Article record);

    int updateArticle(Article record);
}