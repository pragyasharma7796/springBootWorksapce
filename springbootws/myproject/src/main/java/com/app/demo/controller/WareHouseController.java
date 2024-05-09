package com.app.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.app.demo.dto.Location;
import com.app.demo.dto.WareHouse;
import com.app.demo.service.LocationService;
import com.app.demo.service.WareHouseService;

@Controller
public class WareHouseController {
	@Autowired
	private LocationService locationService;
	
	@Autowired
	private WareHouseService wareHouseService;
	                                                                                                
	@RequestMapping("wareHause")
	public ModelAndView show() {
		ModelAndView mav =new ModelAndView("WareHouse","warehouse",new WareHouse());
		mav.addObject("locationList", locationService.getByName("warehouse"));
		return mav;
	}
	
	@RequestMapping("enterWareHouse")
	public String addwrehouse(@ModelAttribute("warehouse")WareHouse warehouse ,@RequestParam("location")Integer locationId) {
		Location l = new Location();
		l.setLocationId(locationId);
		warehouse.setLocationId(l);
		wareHouseService.saveWareHouse(warehouse);
		System.out.println(warehouse);
		return "redirect:wareHause";
	}
}
