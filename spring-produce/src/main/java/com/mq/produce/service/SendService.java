package com.mq.produce.service;

import com.mq.produce.ConnectionUtil.ConnectionUtil;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

@Service
public class SendService {

    @Autowired
    private ConnectionUtil connectionUtil;

    private final Logger logger = LoggerFactory.getLogger(SendService.class);

    public void sendMessage(String msg) throws IOException, TimeoutException {
        Connection connection = connectionUtil.getConnection();
        Channel channel = connection.createChannel();
        channel.queueDeclare("queue1", false, false, false, null );
        channel.basicPublish("", "queue1", null, msg.getBytes());
        System.out.println("发送" + msg);
        channel.close();
        connection.close();
    }
}
