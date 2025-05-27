package com.icicibank.dev_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DevDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DevDemoApplication.class, args);
	}

	@GetMapping("/")
	public String hello() {
		return String.format("<h1>Hello There!!! Welcome to my webapplication</h1>");
	}
}
