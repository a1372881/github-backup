package java.com.dida;

import com.rabbitmq.client.*;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class Consumer {
    private final static String QUEUE_NAME = "hello";

    public static void main(String[] args) throws IOException, TimeoutException {
        ConnectionFactory Factory = new ConnectionFactory();
        Factory.setHost("127.0.0.1");
        Factory.setUsername("admin");
        Factory.setPassword("123456");
        Connection connection = Factory.newConnection();
        Channel channel = connection.createChannel();

        //推送的消息如何进行消费的接口回调
        DeliverCallback deliverCallback = (consumerTag, delivery) -> {
            String message = new String(delivery.getBody());
            System.out.println(message);
        };
        //取消消费的一个回调接口 如在消费的时候队列被删除掉了
        CancelCallback cancelCallback = (consumerTag) -> {
            System.out.println("消息消费被中断");
        };

        /*消费者消费信息-接收信息
        * 1.消费哪个队列
        * 2.消费成功是否要自动应答
        * 3。消费者未成功消费的回调
        * 4.消息被取消时的回调
        */
        channel.basicConsume(QUEUE_NAME,true,deliverCallback,cancelCallback);

    }

}
