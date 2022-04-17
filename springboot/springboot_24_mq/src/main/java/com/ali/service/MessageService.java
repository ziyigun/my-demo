package com.ali.service;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

//@Component
public interface MessageService {
    void sendMessage(String id);
    String doMessage();
}
