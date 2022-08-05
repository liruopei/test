package com.example.idea.controller;

import com.example.idea.bean.Person;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @Value("${spring.name}")
    private String name;


    @Value("${spring.age}")
    private int age;

    @RequestMapping("/test")
    @ResponseBody
    public String sayHello(Person p){
        return name+":"+age;
    }
}
