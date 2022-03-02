package com.mq.produce.produce.demo;

import com.mq.produce.ConnectionUtil.ConnectionUtil;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class ProduceMqDemo {

    public static void main(String[] args) throws IOException, TimeoutException {

        ConnectionUtil connectionUtil= new ConnectionUtil();

        String msg = "666 rabbitmq";
        Connection connection = connectionUtil.getConnection();
        Channel channel = connection.createChannel();
        channel.queueDeclare("queue1", false, false, false, null );
        channel.basicPublish("", "queue1", null, msg.getBytes());
        System.out.println("发送" + msg);
        channel.close();
        connection.close();
    }
}
