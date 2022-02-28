package com.dida.utils;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import jdk.nashorn.internal.runtime.regexp.JoniRegExp;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class RabbitMqUtils{
    public static Channel getchannel() throws IOException, TimeoutException {
        ConnectionFactory Factory = new ConnectionFactory();
        Factory.setHost("127.0.0.1");
        Factory.setUsername("admin");
        Factory.setPassword("123456");
        Connection connection = Factory.newConnection();
        Channel channel = connection.createChannel();
        return channel;
    }

}
