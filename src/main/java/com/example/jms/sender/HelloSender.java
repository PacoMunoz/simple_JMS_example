package com.example.jms.sender;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class HelloSender {

    @Scheduled(fixedRate = 2000)
    public void sendMessage() {
        System.out.println("Mensaje enviado!");
    }

}
