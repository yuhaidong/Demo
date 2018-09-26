package com.example.myproject.login.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

	@GetMapping
	public String login() {
		
		return "login";
	}
	
	@RequestMapping("/h")
    public String hello1() {

        return "hello.html";
    }
}
