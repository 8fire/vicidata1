package com.csjscm.config.datasource;


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
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

@Configuration
@Slf4j
public class MroMysqlDataSourceConfig {
    @Bean(name = "mysql1DataSource")
    @ConfigurationProperties(prefix = "datasource.mysql1")

    public DataSource mysql1DataSource(){
        return DataSourceBuilder.create()
                .build();
    }

    @Bean(name = "mysqlTranscationManager")
    @Primary
    public DataSourceTransactionManager mysqlTranscationManager(@Qualifier("mysql1DataSource") DataSource mysql1DataSource){
        return new DataSourceTransactionManager(mysql1DataSource);
    }

    @Bean(name = "mysqlSqlSessionFactory")
    @Primary
    public SqlSessionFactory mysqlSqlSessionFactory(@Qualifier("mysql1DataSource") DataSource mysql1DataSource)throws Exception{
        final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(mysql1DataSource);
        return sessionFactory.getObject();
    }

    @Bean
    @Scope("prototype")
    @Primary
    public SqlSessionTemplate sqlSessionTemplate(@Qualifier("mysqlSqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception {
        return new SqlSessionTemplate(sqlSessionFactory);
    }

    @Bean
    public MapperScannerConfigurer mysqlScannerConfigurer(){
        log.info("========================>mysql2");
        MapperScannerConfigurer configur = new MapperScannerConfigurer();
        configur.setSqlSessionFactoryBeanName("mysqlSqlSessionFactory");
        configur.setBasePackage("com.csjscm.mysqldata.mrodao");
        return configur;
    }
}
