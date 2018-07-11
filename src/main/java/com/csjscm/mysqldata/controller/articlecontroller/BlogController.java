package com.csjscm.mysqldata.controller.articlecontroller;

import com.csjscm.mysqldata.model.ArticleType;
import com.csjscm.mysqldata.service.impl.ArticleServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

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
    @RequestMapping("/index")
    public ModelAndView toArticle(){
       ModelAndView modelAndView=new ModelAndView();

        Map<String, Object> articleList = articleService.getArticleList(null);
        modelAndView.addObject("map",articleList);
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
