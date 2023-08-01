package ru.konovalov.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/hello")
@RestController
public class ApiController {

    @GetMapping
    public String main(){
        return "Hello, World";
    }
}
