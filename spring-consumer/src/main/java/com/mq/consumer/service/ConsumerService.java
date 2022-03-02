package com.mq.consumer.service;

import com.mq.consumer.ConnectionUtil.ConnectionUtil;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.DeliverCallback;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.TimeoutException;

@Service
public class ConsumerService {

    @Autowired
    private ConnectionUtil connectionUtil;

    public void consumer() throws IOException, TimeoutException {
        Connection connection = connectionUtil.getConnection();
        Channel channel = connection.createChannel();

        channel.queueDeclare("queue1", false, false, false, null);
        System.out.println(" [*] Waiting for messages. To exit press CTRL+C");

        DeliverCallback deliverCallback = (consumerTag, delivery) -> {
            String message = new String(delivery.getBody(), StandardCharsets.UTF_8);
            System.out.println(" [x] Received '" + message + "'");
        };
        channel.basicConsume("queue1", true, deliverCallback, consumerTag -> { });
    }
}
