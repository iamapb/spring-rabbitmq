package com.mq.consumer;

import lombok.Data;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class SpringBootConsumer {
    public static void main(String[] args) {
        new SpringApplication(SpringBootConsumer.class).run(args);
    }
}
