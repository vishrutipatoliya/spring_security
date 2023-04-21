package com.unit.unittestdemo.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/home")
    public String home() {
        return "this is home page";
    }

    @GetMapping("/login")
    public String login() {
        return "this is login page";
    }

    @GetMapping("/register")
    public String register() {
        return "this is register page";
    }

//    @PreAuthorize("hasRole('admin')")
    @GetMapping("/preauthorize")
    public String preAuthorize() {
        return "this is preauthorize page";
    }
}
