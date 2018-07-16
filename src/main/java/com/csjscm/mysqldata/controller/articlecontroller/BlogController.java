package com.csjscm.mysqldata.controller.articlecontroller;

import com.csjscm.mysqldata.model.Article;
import com.csjscm.mysqldata.model.Discuss;
import com.csjscm.mysqldata.service.impl.ArticleServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.vici.response.MsgResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @program: vicidata
 * @description: 博客控制器
 * @author: 没用的阿吉
 * @create: 2018-07-10 08:29
 */
@RestController
@RequestMapping("/blog")
@Slf4j
public class BlogController {
    @Autowired
    private ArticleServiceImpl articleService;

    /**
     * 加载首页
     * @return
     */
    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public ModelAndView toArticle(@RequestParam(value = "pageIndex",defaultValue = "1") Integer pageIndex,
                                  @RequestParam(value = "pageSize",defaultValue = "2") Integer pageSize){
        ModelAndView modelAndView=new ModelAndView();
        Article article=new Article();
        article.setPageIndex(pageIndex);
        article.setPageSize(pageSize);
        PageHelper.startPage(pageIndex, pageSize);
        List<Article> articleList = articleService.getArticleList(article);
        PageInfo<Article> appsPageInfo = new PageInfo<>(articleList);
        modelAndView.addObject("list",appsPageInfo);
        modelAndView.setViewName("blog/index");
        return modelAndView;
    }


    @RequestMapping("/message")
    public ModelAndView toMessage(){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("blog/message");
        return modelAndView;
    }

    @RequestMapping("/about")
    public ModelAndView toAbout(){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("blog/about");
        return modelAndView;
    }

    /**
     * 查看文章详情
     * @param
     * @return
     */
    @RequestMapping(value = "/details",method = RequestMethod.GET)
    public ModelAndView toDetails(HttpServletRequest request){
        String id= request.getParameter("id");
        ModelAndView modelAndView=new ModelAndView();
        Article article = articleService.selectArticleById(id);
        Discuss comment=new Discuss();
        comment.setArticleid(id);
        List<Discuss> comments = articleService.selectCommentByWhere(comment);
        modelAndView.addObject("article",article);
        modelAndView.addObject("comments",comments);
         modelAndView.setViewName("blog/details");
        return modelAndView;
    }

    @RequestMapping(value = "/comment",method = RequestMethod.GET)
    public ModelAndView toComment(HttpServletRequest request){
        ModelAndView modelAndView=new ModelAndView();
        String id= request.getParameter("id");
        Article article = articleService.selectArticleById(id);
        modelAndView.addObject("article",article);
        modelAndView.setViewName("blog/comment");
        return modelAndView;
    }

    @RequestMapping(value = "/addComment",method = RequestMethod.POST)
    public MsgResponse toArticle(@RequestParam(value = "content") String content,
                                 @RequestParam(value = "articleid") String articleid){
        Discuss comment=new Discuss();
        comment.setComment(content);
        comment.setArticleid(articleid);
        int i = articleService.insertComment(comment);
        return i>0?MsgResponse.success():MsgResponse.fail();
    }

    @RequestMapping(value = "/toProsceniumLogin",method = RequestMethod.GET)
    public ModelAndView toProsceniumLogin(){
        return  new ModelAndView("blog/prosceniumlogin");
    }
}
