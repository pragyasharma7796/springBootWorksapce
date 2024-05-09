package com.app.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.demo.dto.UserDto;
import com.app.demo.service.UserService;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping
public class UserController {
	@Autowired
	UserService userService;
	@PostMapping("/user")
	public void adduser(@RequestBody UserDto u) {
		System.out.println(u);
		userService.addUser(u);
	}
	@GetMapping("/getALl")
	public @ResponseBody List<UserDto> getAll(){
		return userService.givenAll();
	}
}
