package com.mq.produce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class SpringBooProduce {
    public static void main(String[] args) {
        new SpringApplication(SpringBooProduce.class).run(args);
    }
}
