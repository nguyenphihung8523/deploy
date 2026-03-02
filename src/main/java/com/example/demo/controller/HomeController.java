package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "Public endpoint";
    }

    @GetMapping("/secure")
    public String secure() {
        return "Bạn đã đăng nhập thành công 🎉";
    }
}