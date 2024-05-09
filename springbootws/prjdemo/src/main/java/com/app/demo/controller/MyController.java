package com.app.demo.controller;

import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	@RequestMapping("show")
	public String showHello(Model model) {
		model.addAttribute("cts", Arrays.asList("Indore","Mumbai","Delhi"));
		return "hello";
	}

}
