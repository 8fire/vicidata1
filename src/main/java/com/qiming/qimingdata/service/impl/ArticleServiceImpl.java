package com.qiming.qimingdata.service.impl;

import com.google.common.collect.Maps;
import com.qiming.qimingdata.dao.ArticleTypeMapper;
import com.qiming.qimingdata.model.ArticleType;
import com.qiming.qimingdata.model.ArticleTypeQuery;
import com.qiming.qimingdata.service.ArticleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

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
    public Map<String,Object> listArticleType(ArticleTypeQuery articleTypeQuery) {
        Map<String,Object> map= Maps.newHashMap();
        Integer count= articleTypeMapper.selectArticleTypeListCount(articleTypeQuery);
        List<ArticleType> articleTypes = articleTypeMapper.selectArticleTypeList(articleTypeQuery);
        map.put("dataRows",articleTypes);
        map.put("totalCount",count);
        map.put("currPage",articleTypeQuery.getPageindex());

        return map;
    }
}
