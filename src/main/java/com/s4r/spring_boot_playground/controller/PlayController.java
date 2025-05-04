package com.s4r.spring_boot_playground.controller;

import com.s4r.spring_boot_playground.config.rabbitmq.Sender;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlayController {
    private final Sender rabbitMqSender;


    public PlayController(Sender rabbitMqSender) {
        this.rabbitMqSender = rabbitMqSender;
    }

    @RequestMapping("/")
    public String sendMessage() {
        rabbitMqSender.sendMessage("Hello Saidur");
        return "Send successful";
    }
}
