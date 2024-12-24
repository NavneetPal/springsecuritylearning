package com.nav.springsecuritylearning.controller;


import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringSecurityController {

    @GetMapping("/")
    public String greet(HttpServletRequest request){
        return "Welcome to Navan"+request.getSession().getId();
    }

}
