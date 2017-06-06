package com.example.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PreDestroy;

@SpringBootApplication
public class TestApplication {

    @PreDestroy
    public void destroy() {
        System.out.println("죽을때 이문자가 나와야함!!!");
    }

    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class, args);
    }
}
