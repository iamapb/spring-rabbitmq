package com.spring.transactional;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.spring.transactional")
public class SpringTransactionalApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringTransactionalApplication.class, args);
    }
}
