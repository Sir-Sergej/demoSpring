package com.example.demospring.contollers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BlogContoller {

    @GetMapping(value = "/")
    public String index() {
        return "index";
    }
}
