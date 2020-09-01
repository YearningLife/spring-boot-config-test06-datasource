package com.green.springboot.config;


import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
/*
1. 引入druid数据源
2. 在application.yml文件中添加数据源属性
3. 重新加载DruidDataSource数据源，并配置 ConfigurationProperties(prefix="spring.datasource") 属性
4. 启动后 会报错，需要在pom.xml文件中引入 <groupId>log4j</groupId> 依赖，参考： https://blog.csdn.net/dingjianmin/article/details/106532075
 */
@Configuration
public class DruidSourceConfig {

    @ConfigurationProperties(prefix="spring.datasource")
    @Bean
    public DataSource mydruidDataSource(){

        return new DruidDataSource();
    }
}
