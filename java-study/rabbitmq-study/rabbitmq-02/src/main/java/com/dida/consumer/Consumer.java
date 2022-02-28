package com.dida.consumer;

import com.dida.utils.RabbitMqUtils;
import com.rabbitmq.client.Channel;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class Consumer {

    private static final String QUEUE_NAME = "hello";

    public static void main(String[] args) throws IOException, TimeoutException {
        Channel channel = RabbitMqUtils.getchannel();


        /*
        queue 队列名
        autoAck 是否自动确认消息,true自动确认,false 不自动要手动调用,建立设置为false
        consumerTag 消费者标签，用来区分多个消费者
        noLocal 设置为true，表示 不能将同一个Conenction中生产者发送的消息传递给这个Connection中 的消费者
        exclusive 是否排他
        arguments 消费者的参数
        callback 消费者 DefaultConsumer建立使用，重写其中的方法
         */


    }
}
