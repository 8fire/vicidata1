package com.csjscm.mysqldata.service.impl;

import com.csjscm.mysqldata.dao.ArticleMapper;
import com.csjscm.mysqldata.dao.DiscussMapper;
import com.csjscm.mysqldata.dao.ReplyMapper;
import com.csjscm.mysqldata.model.*;
import com.google.common.collect.Maps;
import com.csjscm.mysqldata.dao.ArticleTypeMapper;
import com.csjscm.mysqldata.service.ArticleService;
import com.vici.SysStatus;
import com.vici.UUIDUtils;
import com.vici.response.Constants;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.SecurityUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
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
    @Resource
    private DiscussMapper commentMapper;
    @Resource
    private ReplyMapper replyMapper;

    @Override
    public Map<String,Object> listArticleType(ArticleTypeQuery articleTypeQuery) {
        Map<String,Object> map= Maps.newHashMap();
        Integer count= articleTypeMapper.selectArticleTypeListCount(articleTypeQuery);
        List<ArticleType> articleTypes = articleTypeMapper.selectArticleTypeList(articleTypeQuery);
        map.put("dataRows",articleTypes);
        map.put("totalCount",count);
        map.put("currPage",articleTypeQuery.getPageIndex());
        return map;
    }

    @Override
    public List<Article> getArticleList(Article article) {
        article.setIsdelete(Constants.NO_IS_DELETE);
        List<Article> articleList = articleMapper.selectArticleByWhere(article);
        for (Article newArticle:articleList) {
            String articleType = newArticle.getArticleType();
            ArticleType articleType1 = articleTypeMapper.selectByPrimaryKey(articleType);
            newArticle.setArticleType(articleType1.getTypename());
        }
        return articleList;
    }

    @Override
    public Article selectArticleById(String id) {
      return  articleMapper.selectArticleById(id);
    }

    /**
     * 添加文章
     * @param article
     * @return
     */
    @Override
    public int insertArticle(Article article) {
        String principal = (String) SecurityUtils.getSubject().getPrincipal();
        //待审核
        article.setStatus(SysStatus.AUDIT_ORDER.getIndex());
        article.setGmtCreate(new Date());
        article.setId(UUIDUtils.getUUID());
        article.setCreateUser(principal);
        article.setIsdelete(Constants.NO_IS_DELETE);
        int i =0;
        try {
           i=articleMapper.insertArticle(article);
        }catch (Exception e){
            log.error(e.getMessage(),e);
        }
        return i;
    }
    /**
     * 删除文章
     * @param article
     * @return
     */
    @Override
    public int deleteArticle(Article article) {
        Discuss discuss=new Discuss();
        discuss.setArticleid(article.getId());
        //删除评论
        List<Discuss> discusses = commentMapper.selectCommentByWhere(discuss);
        for (Discuss discuss1:discusses){
            discuss1.setIsdelete(SysStatus.INVALID_FLAG.getIndex());
            commentMapper.updateComment(discuss1);
        }
        article.setIsdelete(SysStatus.INVALID_FLAG.getIndex());
        return  articleMapper.updateArticle(article);
    }
    /**
     *
      * @param comment
     * @return
     */
    @Override
    public List<Discuss> selectCommentByWhere(Discuss comment) {
        comment.setIsdelete(Constants.NO_IS_DELETE);
       return commentMapper.selectCommentByWhere(comment);

    }

    /**
     * 添加
     * @param comment
     * @return
     */
    @Override
    public int insertComment(Discuss comment) {
        String principal = (String) SecurityUtils.getSubject().getPrincipal();
        comment.setCheckuser(principal);
        comment.setId(UUIDUtils.getUUID());
        comment.setStatus(SysStatus.AUDIT_ORDER.getIndex());
        comment.setCreatetime(new Date());
        comment.setIsdelete(Constants.NO_IS_DELETE);
        return commentMapper.insertComment(comment);
    }

    @Override
    public int updateComment(Discuss record) {
        return 0;
    }

    /**
     * 添加评论
     * @param reply
     * @return
     */
    @Override
    public int addReply(Reply reply) {
        String principal = (String) SecurityUtils.getSubject().getPrincipal();
        reply.setId(UUIDUtils.getUUID());
        reply.setStatus(SysStatus.AUDIT_ORDER.getIndex());
        reply.setReplyTime(new Date());
        reply.setReplyUser(principal);
        return   replyMapper.insertSelective(reply);
    }

    /**
     * 删除评论
     * @param reply
     * @return
     */
    @Override
    public int deleteDiscuss(Discuss reply) {

        reply.setIsdelete(SysStatus.INVALID_FLAG.getIndex());

        return  commentMapper.updateComment(reply);
    }
}
