package com.app.AutoMaticDeployInWildfly.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@RequestMapping("/home")
	public String helloPrint() {
		return "Hello, Spring boot project Auto connect with wild fly";
	}
}
