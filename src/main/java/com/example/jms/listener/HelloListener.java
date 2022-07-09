package com.example.jms.listener;

import com.example.jms.config.JmsConfig;
import com.example.jms.model.HelloWorldMessage;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class HelloListener {

    @JmsListener(destination = JmsConfig.QUEUE)
    public void listen(@Payload HelloWorldMessage helloWorldMessage, @Headers MessageHeaders headers, Message message) {
        System.out.println("I have a message!!!");
        System.out.println(helloWorldMessage);
        System.out.println(helloWorldMessage.getMessage());
        System.out.println("-----------------");

    }

}
