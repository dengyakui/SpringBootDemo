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

        String myNodeName = System.getenv("MY_NODE_NAME");
        String myPodName = System.getenv("MY_POD_NAME");
        String myPodNamespace = System.getenv("MY_POD_NAMESPACE");
        String myPodIp = System.getenv("MY_POD_IP");
        String myNodeIp = System.getenv("MY_NODE_IP");
        String myPodServiceAccount = System.getenv("MY_POD_SERVICE_ACCOUNT");


        return String.format("<ul>" +
                "<li>pod name: %s</li>" +
                "<li>pod ip: %s</li>" +
                "<li>pod namespace: %s</li>" +
                "<li>pod service account: %s</li>" +
                "<li>node name: %s</li></ul>", myPodName,myPodIp, myPodNamespace,myPodServiceAccount, myNodeName);

    }

    public static void main(String[] args) {
        SpringApplication.run(SpringDemoApplication.class, args);
    }

}
