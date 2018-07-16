package com.csjscm.mysqldata.service;

import com.csjscm.mysqldata.model.Article;
import com.csjscm.mysqldata.model.ArticleTypeQuery;
import com.csjscm.mysqldata.model.Discuss;
import com.csjscm.mysqldata.model.Reply;

import java.util.List;
import java.util.Map;

/**
 * 文章服务接口
 *
 * @author csjscm
 * create 2018-01-08 下午 4:04
 **/
public interface ArticleService {

    List<Article> getArticleList(Article article);

    /**
     * 查询文章类型
     *
     * @return Result<XxxxDO>
     */
     Map<String,Object> listArticleType(ArticleTypeQuery articleTypeQuery);

    /**
     * 添加文章
     * @param article
     * @return
     */
    int  insertArticle(Article article);

    /**
     * 删除文章
     * @param article
     * @return
     */
     int deleteArticle(Article article);

    /**
     *
     * @param id
     * @return
     */
    Article selectArticleById(String id);

    /**
     *
     * @param Comment
     * @return
     */
    List<Discuss> selectCommentByWhere(Discuss Comment);

    /**
     * 添加
     * @param record
     * @return
     */
    int insertComment(Discuss record);

    int updateComment(Discuss record);

    int addReply(Reply reply);

     int deleteDiscuss(Discuss reply);
}
