package com.example.hello.controller;

import com.example.hello.util.HelloUtil;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class TestController {

    @GetMapping
    public ResponseEntity<String> sayHello() {
        return ResponseEntity.ok().body(HelloUtil.sayHello());
    }

}
