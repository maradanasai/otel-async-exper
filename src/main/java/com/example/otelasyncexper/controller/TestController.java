package com.example.otelasyncexper.controller;

import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/test")
    @Async("AsyncTaskExecutor")
    public String test() {
        return "Hello!";
    }
}
