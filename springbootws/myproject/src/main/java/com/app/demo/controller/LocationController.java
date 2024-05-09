package com.app.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.app.demo.dto.Location;
import com.app.demo.service.LocationService;

@Controller

public class LocationController {
	@Autowired
	private LocationService service;
	
	@RequestMapping("/location")
	public String location(Model model) {
		Location l = new Location();
		model.addAttribute("location", l);
		return "location";
	}
	
	@RequestMapping("/addLocation")
	public String add(@ModelAttribute("location") Location l) {
		service.addLocation(l);
		return "redirect:location";
	}
	@RequestMapping("getlocationByName/{name}")
	public @ResponseBody List<Location> getLocationByName(@PathVariable("name")String name){
		return service.getByName(name);
	}
}
