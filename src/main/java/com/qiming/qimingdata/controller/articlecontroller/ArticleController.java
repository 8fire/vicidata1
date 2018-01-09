package com.qiming.qimingdata.controller.articlecontroller;

import com.qiming.qimingdata.model.ArticleType;
import com.qiming.qimingdata.service.ArticleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * 文章类型管理
 *
 * @author qiming
 * @date 2018/1/8
 */
@RestController
@RequestMapping("/article")
@Slf4j
public class ArticleController {

    @Autowired
    private ArticleService articleService;
    @RequestMapping("/toarticle")
    public ModelAndView toArticle(){
        List<ArticleType> articleTypesList = articleService.listArticleType();
        log.info("articleTypesList"+articleTypesList);
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("articleTypesList",articleTypesList);
        modelAndView.setViewName("article/articletype");
        return modelAndView;
    }


}
