package com.mq.consumer.ConnectionUtil;

import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

@Component
public class ConnectionUtil {

    @Value("${spring.rabbitmq.host}")
    private String host;

    @Value("${spring.rabbitmq.port}")
    private String port;

    @Value("${spring.rabbitmq.username}")
    private String username;

    @Value("${spring.rabbitmq.password}")
    private String password;

    public Connection getConnection() throws IOException, TimeoutException {
        ConnectionFactory factory = new ConnectionFactory();
        System.out.println(host);
        factory.setHost(host);
        factory.setPort(Integer.valueOf(port));
        factory.setUsername(username);
        factory.setPassword(password);
        factory.setVirtualHost("/");
        Connection connection = factory.newConnection();
        return connection;
    }
}
