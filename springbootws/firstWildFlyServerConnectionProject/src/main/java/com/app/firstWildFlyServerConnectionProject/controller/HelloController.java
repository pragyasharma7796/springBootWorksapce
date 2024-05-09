package com.app.firstWildFlyServerConnectionProject.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@RequestMapping("/hello")
	public String helloPrint() {
		return "Hello, Spring boot project connect with wild fly";
	}
}
