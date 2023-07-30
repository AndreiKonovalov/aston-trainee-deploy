package ru.konovalov.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/v1/hello")
@RestController
public class ApiController {

    @GetMapping
    public String main(){
        return "Hello, Tomcat";
    }
}
