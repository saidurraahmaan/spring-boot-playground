package com.s4r.spring_boot_playground.config.rabbitmq;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Sender {
    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void sendMessage(String message) {
        for (int i = 0; i < 100000; i++) {
            rabbitTemplate.convertAndSend("myQueue", message);
            System.out.println("Sent: " + message);
        }
    }
}
