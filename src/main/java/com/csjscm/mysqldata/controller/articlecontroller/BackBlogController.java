package com.csjscm.mysqldata.controller.articlecontroller;

import com.csjscm.mysqldata.model.Article;
import com.csjscm.mysqldata.model.ArticleTypeQuery;
import com.csjscm.mysqldata.model.Discuss;
import com.csjscm.mysqldata.model.Reply;
import com.csjscm.mysqldata.service.impl.ArticleServiceImpl;
import com.vici.response.MsgResponse;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;
import java.util.Map;

/**
 * @program: vicidata
 * @description: 博客控制器
 * @author: 没用的阿吉
 * @create: 2018-07-10 08:29
 */
@RestController
@EnableAutoConfiguration
@RequestMapping("/backblog")
@Slf4j
public class BackBlogController {

    @Autowired
    private ArticleServiceImpl articleService;

    /**
     * 获取文章列表
     * @return
     */
    @RequiresPermissions("article:articleList")
    @RequestMapping(value = "/toArticle",method = RequestMethod.GET)
    public ModelAndView toArticle(){
       ModelAndView modelAndView=new ModelAndView();
        Article article=new Article();
       List<Article> articleList = articleService.getArticleList(article);
       modelAndView.addObject("list",articleList);
       modelAndView.setViewName("blog/back/article-list");
       return modelAndView;
    }

    /**
     * 跳转到添加文章界面
     * @return
     */
    @RequiresPermissions("article:addArticle")
    @RequestMapping(value = "/toAddArticle",method = RequestMethod.GET)
    public ModelAndView toAddArticle(){
        ModelAndView modelAndView=new ModelAndView();
        ArticleTypeQuery articleTypeQuery=new ArticleTypeQuery();
        articleTypeQuery.setPageIndex(0);
        articleTypeQuery.setPageSize(10);
        Map<String, Object> map = articleService.listArticleType(articleTypeQuery);
        modelAndView.addObject("list",map.get("dataRows"));
        modelAndView.setViewName("blog/back/AddArticle");
        return modelAndView;
    }

    /**
     * 添加文章
     * @return
     */
    @RequestMapping(value = "/addArticle",method = RequestMethod.POST)
    public MsgResponse addArticle(@RequestParam("title")  String title ,
                                  @RequestParam("articleType")  String articleType ,
                                  @RequestParam("isTop")  String isTop ,
                                  @RequestParam("context")  String context,
                                  @RequestParam("description")  String description,
                                  @RequestParam("articleSource")  String articleSource){

        Article article=new Article();
        article.setTitle(title);
        article.setArticleType(articleType);
        if(StringUtils.isBlank(isTop)){
            //不置顶
            article.setIsTop(0);
        }else {
            //置顶
            article.setIsTop(1);
        }
        article.setContext(context);
        article.setDescription(description);
        article.setArticleSource(articleSource);
        int i = articleService.insertArticle(article);
        return i>0? MsgResponse.success():MsgResponse.fail();
    }

    /**
     *删除文章
     * @param
     * @param
     * @return
     */
    @RequiresPermissions("article:deleteArticle")
    @RequestMapping(value = "/deleteArticle",method = RequestMethod.POST)
    public MsgResponse  deleteArticle(@RequestParam("id") String id){
        Article article=new Article();
        article.setId(id);
        int i = articleService.deleteArticle(article);
        return i>0? MsgResponse.success():MsgResponse.fail();
    }

    /**
     * 获取评论列表
     * @param articleid
     * @return
     */
    @RequiresPermissions("discuss:discussList")
    @RequestMapping(value = "/getCommentList",method =RequestMethod.GET)
    public ModelAndView getCommentList(@RequestParam(value = "articleid",defaultValue = "") String articleid){
        ModelAndView modelAndView=new ModelAndView();
        Discuss comment=new Discuss();
        if(StringUtils.isNotBlank(articleid)){
            comment.setArticleid(articleid);
        }
        List<Discuss> comments = articleService.selectCommentByWhere(comment);
        if(StringUtils.isNotBlank(articleid)){
            modelAndView.setViewName("blog/comment");
        }else {
            for(Discuss discuss:comments){
                Article article = articleService.selectArticleById(discuss.getArticleid());
                discuss.setArticleid(article.getTitle());
            }
            modelAndView.setViewName("blog/back/comment-list");
        }
        modelAndView.addObject("list",comments);
        return modelAndView;
    }

    /**
     * 跳转到回复页面
     * @param id
     * @return
     */
    @RequiresPermissions("discuss:addReply")
    @RequestMapping(value = "/toReply",method = RequestMethod.GET)
    public ModelAndView toReply(@RequestParam("id") String id){
        ModelAndView modelAndView=new ModelAndView();
        Discuss discuss=new Discuss();
        discuss.setId(id);
        Discuss discusses = articleService.selectCommentByWhere(discuss).get(0);
        modelAndView.addObject("discuss",discusses);
        modelAndView.setViewName("blog/back/reply-discuss");
        return modelAndView;
    }

    /**
     *
     * @param discussId
     * @param replyComment
     * @return
     */
    @RequestMapping(value = "/addReply",method = RequestMethod.POST)
    public MsgResponse addReply(@RequestParam("discussId") String discussId,
                                              @RequestParam("replyComment") String replyComment  ){
        Reply reply=new Reply();
        reply.setDiscussid(discussId);
        reply.setReplyComent(replyComment);
        int i = articleService.addReply(reply);
        return i>0? MsgResponse.success():MsgResponse.fail();
    }

    /**
     *删除评论
     * @param
     * @param
     * @return
     */
    @RequiresPermissions("discuss:deleteDiscuss")
    @RequestMapping(value = "/deleteDiscuss",method = RequestMethod.POST)
    public MsgResponse deleteDiscuss(@RequestParam("id") String id){
        Discuss discuss=new Discuss();
        discuss.setId(id);
        int i = articleService.deleteDiscuss(discuss);
        return i>0? MsgResponse.success():MsgResponse.fail();
    }
}