package com.qiming.qimingdata.controller.articlecontroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * 文章类型管理
 *
 * @author qiming
 * @date 2018/1/8
 */
@RestController
@RequestMapping("/article")
public class ArticleController {

    @RequestMapping("/toarticle")
    public ModelAndView toArticle(){
        return new ModelAndView("article/articletype");
    }
}
