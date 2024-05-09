package com.app.sample.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.app.sample.dto.EmployeeDto;
import com.app.sample.service.EmployeeService;

@RestController
@RequestMapping(value = "/")
public class EmployeeController {

	@Autowired
	private EmployeeService service;

	@GetMapping(value = "employee")
	public ModelAndView getEmployee() {
		ModelAndView modelAndView = new ModelAndView("employeeList");
		List<EmployeeDto> dtos = service.listOfEmployee();
		System.out.println(dtos);
		modelAndView.addObject("empList", dtos);
		return modelAndView;
	}

	@GetMapping(value = "/callregemployee")
	public ModelAndView addEmployeeForm() {
		ModelAndView modelAndView = new ModelAndView("addEmployee");
		EmployeeDto emp = new EmployeeDto();
		modelAndView.addObject("emp", emp);
		return modelAndView;
	}

	@RequestMapping(value = "deleteEmployee")
	public ModelAndView deleteEmploye(@PathParam("id") Long id) {
		service.deleteEmployee(id);
		ModelAndView modelAndView = new ModelAndView("employeeList");
		List<EmployeeDto> dtos = service.listOfEmployee();
		System.out.println(dtos);
		modelAndView.addObject("empList", dtos);
		modelAndView.addObject("emp", new EmployeeDto());
		return modelAndView;
	}

	
	  @RequestMapping(value="/updateEmployee")
	  public void editEmployee( EmployeeDto dto ) {
		service.addEmployee(dto);  
	    
	  }
	  
	 
	@RequestMapping(value = "editEmployee/{id}")
	public @ResponseBody EmployeeDto getEmployeeById(@PathVariable("id") Long id) {
		return service.getEmployeeById(id);
	}

	@PostMapping(value = "/addEmployee")
	public ModelAndView addEmployee(@ModelAttribute("emp") EmployeeDto dto) {
		System.out.println(dto);
		service.addEmployee(dto);
		ModelAndView modelAndView = new ModelAndView("employeeList");
		List<EmployeeDto> dtos = service.listOfEmployee();
		System.out.println(dtos);
		modelAndView.addObject("empList", dtos);
		modelAndView.addObject("emp", new EmployeeDto());
		return modelAndView;
	}
}
