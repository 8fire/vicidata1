package com.csjscm.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
@Configuration
@Slf4j
public class StaticConfig extends WebMvcConfigurerAdapter {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {

        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
        //配置本地磁盘的虚拟路径
        registry.addResourceHandler("/upload/**").addResourceLocations("file:F:/blog/file/static/");
        super.addResourceHandlers(registry);
    }
}
