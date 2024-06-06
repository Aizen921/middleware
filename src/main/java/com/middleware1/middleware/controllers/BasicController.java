package com.middleware1.middleware.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;

@RestController
@RequestMapping("/time")
public class BasicController {
    @GetMapping("/")
    public String getTime(){
        return LocalTime.now().toString();
    }
}
