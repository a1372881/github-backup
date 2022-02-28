package java.com.dida;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class Producer {
    private final static String QUEUE_NAME = "hello";

    public static void main(String[] args) throws IOException, TimeoutException {
        //创建连接工厂
        ConnectionFactory Factory = new ConnectionFactory();
        //设置连接
        Factory.setHost("127.0.0.1");
        Factory.setUsername("admin");
        Factory.setPassword("123456");

        //创建连接
        Connection connection = Factory.newConnection();
        //创建通道
        Channel channel = connection.createChannel();

        /*生成一个队列
        *参数
        * 1.队列名称
        * 2.队列里的信息是否持久化，是否用完就删除
        * 3.该队列是否只提供一个消费者进行消费，是否共享多个消费者进行消费
        * 4.是否自动删除，最后一个消费者断开连接后是否自动删除
        * 5。其他参数
        */
        channel.queueDeclare(QUEUE_NAME,false,false,false,null);
        String message = "hello world";

        /*发送消息
        *1.发送到哪个交换机
        *2.路由的keyy
        *3.其他的参数信息
        *4.发送消息的消息体
        */
        channel.basicPublish("",QUEUE_NAME,null,message.getBytes());
        System.out.println("消息 发送完毕");
    }
}
