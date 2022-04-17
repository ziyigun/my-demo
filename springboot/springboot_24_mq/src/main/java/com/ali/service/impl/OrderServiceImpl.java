package com.ali.service.impl;

import com.ali.service.MessageService;
import com.ali.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private MessageService messageService;

    @Override
    public void order(String id) {
        //一系列的操作
        System.out.println("处理订单开始");
        //短信消息处理
        messageService.sendMessage(id);
        System.out.println("处理订单结束");
        System.out.println();
    }
}
