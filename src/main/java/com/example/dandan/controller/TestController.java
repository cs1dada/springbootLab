package com.example.dandan.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/demo")
    public String demo() {
        return "demo page";
    }

    @GetMapping("/admin")
    public String admin() {
        return "admin page";
    }

    @GetMapping("/home")
    public String home() {
        return "home page";
    }
}
