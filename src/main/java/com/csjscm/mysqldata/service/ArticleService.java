package com.csjscm.mysqldata.service;

import com.csjscm.mysqldata.model.ArticleTypeQuery;

import java.util.Map;

/**
 * 文章服务接口
 *
 * @author csjscm
 * create 2018-01-08 下午 4:04
 **/
public interface ArticleService {
    /**
     * 查询文章类型
     *
     * @return Result<XxxxDO>
     */
     Map<String,Object> listArticleType(ArticleTypeQuery articleTypeQuery);
}
