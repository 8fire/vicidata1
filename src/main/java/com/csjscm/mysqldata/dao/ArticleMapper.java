package com.csjscm.mysqldata.dao;

import com.csjscm.mysqldata.model.Article;

import java.util.List;

public interface ArticleMapper {


    List<Article> selectArticleByWhere(Article article);

    /**
     * 查询总条数
     * @param article
     * @return
     */
    Integer selectArticleCountByWhere(Article article);

    Article selectArticleById(String id);

    int insertArticle(Article record);

    int updateArticle(Article record);
}