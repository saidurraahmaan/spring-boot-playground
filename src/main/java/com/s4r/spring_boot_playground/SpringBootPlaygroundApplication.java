package com.s4r.spring_boot_playground;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootPlaygroundApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootPlaygroundApplication.class, args);
        System.out.println("Hello Saidur");
    }

}
