package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	 @RequestMapping(value = "/sagar", method = RequestMethod.GET, produces = "application/json")
	
	public String home() {
		 System.out.println("Hello");
		return "Spring boot is working wow";
	}
}
