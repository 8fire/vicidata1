package com.qiming.qimingdata.config.datasource;

import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

/**
 * oracle连接
 *
 * @author qiming
 * create 2018-03-19 上午 11:30
 **/
@Configuration
@Slf4j
public class OracleDataSourceConfig {
    @Bean(name = "oracleDataSource")
    @ConfigurationProperties(prefix = "datasource.oracle")
    public DataSource oracleDataSource() {
        return DataSourceBuilder.create()
                .build();
    }

    @Bean(name = "oracleTranscationManager")
    public DataSourceTransactionManager oracleTranscationManager() {
        return new DataSourceTransactionManager(oracleDataSource());
    }

    @Bean(name = "oracleSqlSessionFactory")
    public SqlSessionFactory oracleSqlSessionFactory(@Qualifier("oracleDataSource") DataSource oracleDataSource) throws Exception {
        final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(oracleDataSource);
        return sessionFactory.getObject();
    }

    @Bean
    @Scope("prototype")
    public SqlSessionTemplate sqlSessionTemplate(@Qualifier("oracleSqlSessionFactory") SqlSessionFactory sqlSessionFactory) {
        return new SqlSessionTemplate(sqlSessionFactory);
    }

    @Bean
    public MapperScannerConfigurer oracleScannerConfigurer(){
        log.info("======启动orcal=========>");
        MapperScannerConfigurer configur = new MapperScannerConfigurer();
        configur.setSqlSessionFactoryBeanName("oracleSqlSessionFactory");
        configur.setBasePackage("com.qiming.oracledata.dao");
        return configur;
    }
}
