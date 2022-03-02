package com.mq.consumer;

import lombok.Data;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class}, scanBasePackages = "com.mq.consumer")
public class SpringBootConsumer {
    public static void main(String[] args) {
        new SpringApplication(SpringBootConsumer.class).run(args);
    }
}
