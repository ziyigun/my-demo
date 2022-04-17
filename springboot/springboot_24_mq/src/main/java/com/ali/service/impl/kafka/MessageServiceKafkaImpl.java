package com.ali.service.impl.kafka;


import com.ali.service.MessageService;
import org.springframework.stereotype.Service;

@Service
public class MessageServiceKafkaImpl implements MessageService {

//    private Kafka<String, String> kafkaTemplate;
    @Override
    public void sendMessage(String id) {
        System.out.println("待发送短信的订单已纳入处理队列（kafka），id：" + id);

    }

    @Override
    public String doMessage() {
        return null;
    }
}
