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
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;
@Configuration
@Slf4j
public class MysqlDataSourceConfig {
    @Bean(name = "mysqlDataSource")
    @ConfigurationProperties(prefix = "datasource.mysql")
    @Primary
    public DataSource mysqlDataSource(){
        return DataSourceBuilder.create()
                .build();
    }

    @Bean(name = "mysqlTranscationManager")
    @Primary
    public DataSourceTransactionManager mysqlTranscationManager(@Qualifier("mysqlDataSource") DataSource mysqlDataSource){
        return new DataSourceTransactionManager(mysqlDataSource);
    }

    @Bean(name = "mysqlSqlSessionFactory")
    @Primary
    public SqlSessionFactory mysqlSqlSessionFactory(@Qualifier("mysqlDataSource") DataSource mysqlDataSource)throws Exception{
        final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(mysqlDataSource);
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
        MapperScannerConfigurer configur = new MapperScannerConfigurer();
        configur.setSqlSessionFactoryBeanName("mysqlSqlSessionFactory");
        configur.setBasePackage("com.csjscm.mysqldata.dao");
        return configur;
    }
}
