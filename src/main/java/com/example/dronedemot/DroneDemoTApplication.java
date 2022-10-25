package com.example.dronedemot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/hello")
public class DroneDemoTApplication {

    public static void main(String[] args) {
        SpringApplication.run(DroneDemoTApplication.class, args);
    }

    @RequestMapping("/test")
    public String sayHello(){
        return "hello";
    }
}
