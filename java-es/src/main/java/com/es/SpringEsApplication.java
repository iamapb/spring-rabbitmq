package com.es;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@SpringBootApplication
@MapperScan
@EnableElasticsearchRepositories(basePackages = "com.es")
public class SpringEsApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringEsApplication.class, args);
    }
}
