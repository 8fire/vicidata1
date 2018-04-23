package com.qiming.qimingdata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
@ComponentScan
@SpringBootApplication
@EnableCaching
public class VicidataApplication {

	public static void main(String[] args) {
		SpringApplication.run(VicidataApplication.class, args);
	}
}
