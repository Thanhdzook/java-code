package com.example.VD1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

@RestController 
@SpringBootApplication
@EnableAutoConfiguration
public class Vd1Application {
	@RequestMapping("/")
	
	String home() {
		return "Hello String boot";
	}
	public static void main(String[] args) {
		SpringApplication.run(Vd1Application.class, args);
	}

}