package com.example.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * 功能描述：MyBatis Plus 配置
 *
 * @author Gjub
 * @version 1.0
 */
@Configuration
@EnableTransactionManagement
@MapperScan(basePackages = "com.example.mapper")
public class MyBatisPlusConfig {

    /**
     * 开启分页功能
     * @return
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }
}
