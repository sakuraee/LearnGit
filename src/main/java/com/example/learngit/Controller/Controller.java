package com.example.learngit.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Controller {
    @RequestMapping("/hello")
    public String web() {
        String result = "hello Spring Boot！这是一个用Spring Boot开发的网站。";
        return result;
    }
}
