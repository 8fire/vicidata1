package com.csjscm.mysqldata.controller.articlecontroller;

import com.csjscm.mysqldata.model.ArticleTypeQuery;
import com.csjscm.mysqldata.service.ArticleService;
import lombok.extern.slf4j.Slf4j;
import net.sf.json.*;
import net.sf.json.processors.JsDateJsonValueProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * 文章类型管理
 *
 * @author csjscm
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
        ArticleTypeQuery articleTypeQuery=new ArticleTypeQuery();
        articleTypeQuery.setPageindex(0);
        articleTypeQuery.setPagesize(10);
        Map<String, Object> map = articleService.listArticleType(articleTypeQuery);
        log.info("articleTypesList"+map);
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("articleTypesList",map);
        modelAndView.setViewName("article/articletype");
        return modelAndView;
    }


    @RequestMapping("/toarticle1")
    public ModelAndView toArticle1(){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("article/articletype1");
        return modelAndView;
    }

    @RequestMapping("/listtoarticle")
    public String listArticleType(ArticleTypeQuery articleTypeQuery){
        System.out.println(articleTypeQuery.getPagesize()+ "=============="+articleTypeQuery.getPageindex());
        Map<String, Object> map = articleService.listArticleType(articleTypeQuery);
        JsonConfig jsonConfig = new JsonConfig();
        jsonConfig.registerJsonValueProcessor(java.util.Date.class, new JsDateJsonValueProcessor());
        JSONObject jsonObject = JSONObject.fromObject(map, jsonConfig);
        return jsonObject.toString();
    }

}
