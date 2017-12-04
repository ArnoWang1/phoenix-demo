package com.nan.phoenixdemo.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * 数据源配置
 */
@Configuration
public class DruidConfig {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Value("${spring.datasource.url}")
    private String dbUrl;

    @Value("${spring.datasource.driver-class-name}")
    private String driverClassName;

    @Bean
    @Primary
    public DataSource druidDataSource() {
        DruidDataSource datasource = new DruidDataSource();
        datasource.setUrl(this.dbUrl);
        datasource.setDriverClassName(driverClassName);
        datasource.setInitialSize(1);
        datasource.setMinIdle(1);
        datasource.setMaxActive(200);
        datasource.setMaxWait(60000);
        datasource.setTimeBetweenEvictionRunsMillis(45000);
        datasource.setValidationQuery("SELECT 1");
        datasource.setTestWhileIdle(true);
        datasource.setTestOnBorrow(true);
        datasource.setTestOnReturn(false);
        datasource.setRemoveAbandonedTimeout(3600);
        try {
            datasource.setFilters("stat");
        } catch (SQLException e) {
            logger.error("druid configuration initialization filter", e);
        }
        return datasource;
    }

}