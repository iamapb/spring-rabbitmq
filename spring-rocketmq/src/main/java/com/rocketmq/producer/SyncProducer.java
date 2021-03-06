package com.rocketmq.producer;

import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.common.message.Message;

public class SyncProducer {
    public static void main(String[] args) throws Exception {
        DefaultMQProducer defaultMQProducer = new DefaultMQProducer();
        defaultMQProducer.setNamesrvAddr("localhost:9876");
        defaultMQProducer.setProducerGroup("test_producer_group");
        defaultMQProducer.start();
        for (int i = 0; i < 10; i++) {
            SendResult send = defaultMQProducer.send(new Message("test_topic", "tagA", "Hello RocketMQ".getBytes()));
            System.out.printf("%s%n",send);
        }
        defaultMQProducer.shutdown();
    }
}
