package com.csjscm.mysqldata.controller.articlecontroller;

import com.csjscm.mysqldata.model.Article;
import com.csjscm.mysqldata.model.ArticleTypeQuery;
import com.csjscm.mysqldata.service.impl.ArticleServiceImpl;
import com.vici.response.MsgResponse;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.Map;

/**
 * @program: vicidata
 * @description: 博客控制器
 * @author: 没用的阿吉
 * @create: 2018-07-10 08:29
 */
@RestController
@RequestMapping("/backblog")
@Slf4j
public class BackBlogController {

    @Autowired
    private ArticleServiceImpl articleService;
    @RequestMapping("/toArticle")
    public ModelAndView toArticle(){
       ModelAndView modelAndView=new ModelAndView();
       Map<String, Object> articleList = articleService.getArticleList(null);
       modelAndView.addObject("map",articleList);
       modelAndView.setViewName("blog/back/article-list");
       return modelAndView;
    }

    /**
     * 跳转到添加文章界面
     * @return
     */
    @RequestMapping("/toAddArticle")
    public ModelAndView toAddArticle(){
        ModelAndView modelAndView=new ModelAndView();
        ArticleTypeQuery articleTypeQuery=new ArticleTypeQuery();
        articleTypeQuery.setPageindex(0);
        articleTypeQuery.setPagesize(10);
        Map<String, Object> map = articleService.listArticleType(articleTypeQuery);
        modelAndView.addObject("list",map.get("dataRows"));
        modelAndView.setViewName("blog/back/AddArticle");
        return modelAndView;
    }

    /**
     * 添加文章
     * @return
     */
    @RequestMapping("/addArticle")
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


    @RequestMapping("/details")
    public ModelAndView toDetails(){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("blog/details");
        return modelAndView;
    }

    @RequestMapping("/comment")
    public ModelAndView toComment(){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("blog/comment");
        return modelAndView;
    }
}
