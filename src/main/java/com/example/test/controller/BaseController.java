package com.example.test.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {

    private LocalDateTime startTime;

    @PostConstruct
    public void init() {
        this.startTime = LocalDateTime.now();
    }

    @GetMapping("/")
    public String root() {
        System.out.println("호출됨: " +
                LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH시 mm분 ss초")));
        return String.format("jar deploy success (서버시작시간: %s)"
                , startTime.format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH시 mm분 ss초")));
    }

}
