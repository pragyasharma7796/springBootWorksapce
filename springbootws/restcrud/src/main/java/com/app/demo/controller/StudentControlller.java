package com.app.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.demo.model.Student;
import com.app.demo.service.StudentService;

@RestController
@RequestMapping("/stu")
public class StudentControlller {
	@Autowired
	StudentService service;

	@GetMapping("/")
	public List<Student> getAll() {
		List<Student> stl = service.getAll();
		return stl;
	}
	
	  @PostMapping("/") 
	  public ResponseEntity<Void> create(@RequestBody Student st) {
		  service.save(st);
		  return new ResponseEntity<Void>(HttpStatus.CREATED);
	  }
	 
}
