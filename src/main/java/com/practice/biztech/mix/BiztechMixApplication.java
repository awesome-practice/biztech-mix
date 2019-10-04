package com.practice.biztech.mix;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableCaching
@MapperScan(basePackages = "com.practice.biztech.mix.dal")
@EnableTransactionManagement
public class BiztechMixApplication {

    public static void main(String[] args) {
        SpringApplication.run(BiztechMixApplication.class, args);
    }

}
