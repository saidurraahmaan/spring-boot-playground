package com.s4r.spring_boot_playground.controller;

import com.s4r.spring_boot_playground.service.IFoulService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    private final IFoulService foulService;


    public FirstController(IFoulService foulService) {
        this.foulService = foulService;
    }

    @GetMapping("/foul")
    public String foulLink() {
        System.out.println("Hello World");
        foulService.foulMethod();
        return "Hello Saidur";
    }
}
