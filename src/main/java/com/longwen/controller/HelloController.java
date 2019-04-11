package com.longwen.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/say")
    public String helloWorld(){
        return "To Say Hello World!";
    }

    @RequestMapping("/")
    public String say(){
        return "Hello World!";
    }

}
