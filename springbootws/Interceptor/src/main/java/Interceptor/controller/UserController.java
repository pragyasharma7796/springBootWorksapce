package Interceptor.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	@GetMapping("/produdt")
	public String getPoduct() {
		System.out.println("UserController::getPoduct");
		return "take Product";
	}
}
