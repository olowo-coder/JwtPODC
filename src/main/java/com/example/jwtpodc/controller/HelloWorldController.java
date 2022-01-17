package com.example.jwtpodc.controller;


import com.example.jwtpodc.service.JwtUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class HelloWorldController {

    private final JwtUserDetailsService jwtUserDetailsService;

    @Autowired
    public HelloWorldController(JwtUserDetailsService jwtUserDetailsService) {
        this.jwtUserDetailsService = jwtUserDetailsService;
    }

    @PostMapping("/signup")
    public String signUp(@RequestBody User user){
        return jwtUserDetailsService.signUpUser(user);
    }
}
