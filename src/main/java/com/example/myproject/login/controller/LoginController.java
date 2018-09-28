package com.example.myproject.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
@Controller
public class LoginController {

	@GetMapping
	public String login() {
		
		return "login";
	}
	
	@RequestMapping("/hello")
    public String hello(Model model) {

		model.addAttribute("name", "张三");
		
        return "test";
    }
}
