package com.app.SpringBootSecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/home")
	public String homePage() {
		return "welcome.jsp";
	}
}
