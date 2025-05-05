package com.s4r.spring_boot_playground.service;

import org.springframework.stereotype.Service;

@Service
public class FoulService implements IFoulService {
    @Override
    public void foulMethod() {
        System.out.println("Foul Method");
    }
}
