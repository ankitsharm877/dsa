package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {

	@GetMapping("/")
	public String getData() {
		return new String("hello");
	}
	
	public String getUser() {
		return new String("user");
	}
	
	

}
