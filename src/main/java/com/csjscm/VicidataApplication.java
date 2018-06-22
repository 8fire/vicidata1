package com.csjscm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@ComponentScan
@SpringBootApplication
@EnableCaching
@ComponentScan(basePackages = {"com.csjscm","com.vici"})
public class VicidataApplication  extends WebMvcConfigurerAdapter{
	@Override
	public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {
		configurer.favorPathExtension(false);
	}

	public static void main(String[] args) {
		SpringApplication.run(VicidataApplication.class, args);
	}
}
