package com.qiming.qimingdata.service;

import com.qiming.qimingdata.model.ArticleType;
import com.qiming.qimingdata.model.ArticleTypeQuery;

import java.util.List;
import java.util.Map;

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
     Map<String,Object> listArticleType(ArticleTypeQuery articleTypeQuery);
}
