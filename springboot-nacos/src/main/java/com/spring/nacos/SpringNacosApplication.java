package com.spring.nacos;


import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@NacosPropertySource(dataId = "spring", autoRefreshed = true)
public class SpringNacosApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringNacosApplication.class, args);
    }
}
