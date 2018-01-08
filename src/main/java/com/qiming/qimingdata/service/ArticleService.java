package com.qiming.qimingdata.service;

import com.qiming.qimingdata.model.ArticleType;

import java.util.List;

/**
 * 文章服务接口
 *
 * @author qiming
 * create 2018-01-08 下午 4:04
 **/
public interface ArticleService {
    /**
     * 查询文章类型
     *
     * @return Result<XxxxDO>
     */
     List<ArticleType> listArticleType();
}
