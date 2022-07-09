package com.example.jms.sender;

import com.example.jms.config.JmsConfig;
import com.example.jms.model.HelloWorldMessage;
import lombok.RequiredArgsConstructor;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.UUID;

@RequiredArgsConstructor
@Component
public class HelloSender {

    private final JmsTemplate jmsTemplate;

    @Scheduled(fixedRate = 100)
    public void sendMessage() {

        HelloWorldMessage message = HelloWorldMessage.builder()
                .id(UUID.randomUUID())
                .message("Hola Mundo!!!")
                .build();

        System.out.println("Enviando mensaje...");
        jmsTemplate.convertAndSend(JmsConfig.QUEUE, message);
        System.out.println("Mensaje enviado!");
    }

}
