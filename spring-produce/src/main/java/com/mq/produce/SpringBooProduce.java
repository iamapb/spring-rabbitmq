package com.mq.produce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.stereotype.Component;

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class }, scanBasePackages = "com.mq.produce")
@Component
public class SpringBooProduce {
    public static void main(String[] args) {
        new SpringApplication(SpringBooProduce.class).run(args);
    }
}
