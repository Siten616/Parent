package com.st.rabbitmq.producer;


import com.rabbitmq.client.*;
import com.st.consts.Constant;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

/**
 * @Author: shentao
 * @Date: 2021/1/28 0028 15:20
 */
public class Publisher {

    private final static String QUEUE_NAME = "products_queue";

    public static void main(String[] args) throws IOException, TimeoutException {
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost(Constant.IP);
        Connection connection = factory.newConnection();
        Channel channel = connection.createChannel();

        String message = "hello rabbit MQ";
        channel.queueDeclare(QUEUE_NAME, false, false, false, null);

        channel.basicPublish("", QUEUE_NAME, null, message.getBytes());
        System.out.println(" [x] Sent '" + message + "'");

        channel.close();
        connection.close();
    }
}