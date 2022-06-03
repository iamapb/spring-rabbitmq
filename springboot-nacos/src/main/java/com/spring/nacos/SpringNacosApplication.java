package com.spring.nacos;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
//@NacosPropertySource(dataId = "spring", autoRefreshed = true)
public class SpringNacosApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringNacosApplication.class, args);
    }
}
