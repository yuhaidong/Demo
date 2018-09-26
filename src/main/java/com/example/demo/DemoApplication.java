package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@SpringBootApplication
public class DemoApplication {
	
//	@Value("${boy.name}")
//    private String boyName;
//    @Value("${boy.age}")
//    private String boyAge;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	@RequestMapping("/hello")
    public String index() {
		System.out.println("HHHHHHH!");
        //return "Hello World！";
		
		//return "Hello World! The boy is "+ this.boyName+"; and his age is "+boyAge;
		return "Hello!";
    }
}
