package com.qiming.qimingdata.service.impl;

import com.qiming.qimingdata.dao.ArticleTypeMapper;
import com.qiming.qimingdata.model.ArticleType;
import com.qiming.qimingdata.service.ArticleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 文章服务实现类
 *
 * @author qiming
 * create 2018-01-08 下午 4:10
 **/
@Service
public class ArticleServiceImpl implements ArticleService {
    @Resource
    private ArticleTypeMapper articleTypeMapper;

    @Override
    public List<ArticleType> listArticleType() {
        return articleTypeMapper.selectArticleTypeList();
    }
}
