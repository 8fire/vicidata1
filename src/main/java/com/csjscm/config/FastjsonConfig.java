package com.csjscm.config;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;

import java.util.ArrayList;
import java.util.List;


/**
 * fastjson配置
 *
 * @author csjscm
 * create 2018-04-28 下午 2:28
 **/
@SpringBootApplication
public class FastjsonConfig {
    @Bean
    public HttpMessageConverters fastjsonHttpMessageConverter(){
        //1.需要定义一个convert转换消息的对象;
           FastJsonHttpMessageConverter fastJsonHttpMessageConverter = new FastJsonHttpMessageConverter();
        //2:添加fastJson的配置信息;
            FastJsonConfig fastJsonConfig = new FastJsonConfig();
             fastJsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat);
            //3处理中文乱码问题
            List<MediaType> fastMediaTypes = new ArrayList<>();
             fastMediaTypes.add(MediaType.APPLICATION_JSON_UTF8);
             //4.在convert中添加配置信息.
             fastJsonHttpMessageConverter.setSupportedMediaTypes(fastMediaTypes);
            fastJsonHttpMessageConverter.setFastJsonConfig(fastJsonConfig);
             HttpMessageConverter<?> converter = fastJsonHttpMessageConverter;
             return new HttpMessageConverters(converter);

    }
}
