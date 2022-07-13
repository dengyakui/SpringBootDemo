package com.quintos.springdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringDemoApplication {

    @RequestMapping("/")
    public String Hello(){
        return "Hello, World";
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringDemoApplication.class, args);
    }

}
