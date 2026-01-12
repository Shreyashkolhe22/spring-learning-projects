package com.example.oauth2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloword {

    @RequestMapping("/")
    public String greet()
    {
        return "Welcome to Oauth2 project";
    }
}
