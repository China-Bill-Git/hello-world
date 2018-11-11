package com.wangheng.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@RequestMapping("/hello")
	public String sayHello() {
		return "hello world!";
	}
	
	@RequestMapping("/hi")
	public String seyHi() {
		return "hi!";
	}
}
