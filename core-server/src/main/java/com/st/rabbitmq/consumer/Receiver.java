package com.st.rabbitmq.consumer;


import com.rabbitmq.client.*;
import com.st.consts.Constant;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

/**
 * @Author: shentao
 * @Date: 2021/1/28 0028 15:21
 */
public class Receiver {

    private static final String QUEUE_NAME = "products_queue";

    public static void main(String[] args) throws IOException, TimeoutException {
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost(Constant.IP);
        Connection connection = factory.newConnection();
        Channel channel = connection.createChannel();

        channel.queueDeclare(QUEUE_NAME, false, false, false, null);

        DefaultConsumer consumer = new DefaultConsumer(channel) {
            @Override
            public void handleDelivery(String consumerTag,
                                       Envelope envelope, AMQP.BasicProperties properties,
                                       byte[] body) throws IOException {
                String message = new String(body, "UTF-8");
                System.out.println(" [x] Received '" + message + "'");
            }
        };
        channel.basicConsume(QUEUE_NAME, true, consumer);
    }
}
