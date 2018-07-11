package com.csjscm.mysqldata.service.impl;

import com.csjscm.mysqldata.dao.ArticleMapper;
import com.csjscm.mysqldata.model.Article;
import com.google.common.collect.Maps;
import com.csjscm.mysqldata.dao.ArticleTypeMapper;
import com.csjscm.mysqldata.model.ArticleType;
import com.csjscm.mysqldata.model.ArticleTypeQuery;
import com.csjscm.mysqldata.service.ArticleService;
import com.vici.UUIDUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.SecurityUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.security.auth.Subject;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 文章服务实现类
 *
 * @author csjscm
 * create 2018-01-08 下午 4:10
 **/
@Service
@Slf4j
public class ArticleServiceImpl implements ArticleService {
    @Resource
    private ArticleTypeMapper articleTypeMapper;
    @Resource
    private ArticleMapper articleMapper;

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

    @Override
    public Map<String, Object> getArticleList(Article article) {
        HashMap<String, Object> map = Maps.newHashMap();
       // article.setStatus(1);
        List<Article> articleList = articleMapper.selectArticleByWhere(article);
        for (Article newArticle:articleList
             ) {
            String articleType = newArticle.getArticleType();
            ArticleType articleType1 = articleTypeMapper.selectByPrimaryKey(articleType);
            newArticle.setArticleType(articleType1.getTypename());
        }
        map.put("articleList",articleList);
        return map;
    }

    @Override
    public int insertArticle(Article article) {
        String principal = (String) SecurityUtils.getSubject().getPrincipal();
        //待审核
        article.setStatus(0);
        article.setGmtCreate(new Date());
        article.setId(UUIDUtils.getUUID());
        article.setOrganization(principal);
        int i =0;
        try {
           i=articleMapper.insertArticle(article);
        }catch (Exception e){
            log.error(e.getMessage(),e);
        }

        return i;
    }
}
