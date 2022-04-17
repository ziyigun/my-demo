package com.ali.service.impl.rabbitmq.topic;

import com.ali.service.MessageService;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//@Service
public class MessageServiceRabbitmqTopicImpl implements MessageService {

    @Autowired
    private AmqpTemplate amqpTemplate;

    @Override
    public void sendMessage(String id) {
        System.out.println("待发送短信的订单已经纳入处理队列（rabbitmq topic），id：" + id);
        amqpTemplate.convertAndSend("topicExchange","topic.orders.id",id);
    }

    @Override
    public String doMessage() {
        return null;
    }
}
