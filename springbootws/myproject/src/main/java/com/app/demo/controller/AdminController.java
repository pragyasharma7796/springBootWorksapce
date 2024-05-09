package com.app.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.app.demo.dto.Category;
import com.app.demo.service.CategoryService;

@Controller
public class AdminController {
	@Autowired
	private CategoryService categoryService;
	
	
	
	
	@RequestMapping("admin")
	public ModelAndView adminpage() {
		ModelAndView mav =new ModelAndView("adminpage");
		Category category = new Category();
		mav.addObject("category", category);
		mav.addObject("categoryList", categoryService.getAll());
		return mav;
	}
	
	@RequestMapping("addCategory")
	public ModelAndView addCategory (@ModelAttribute("category")Category c) {
		System.out.println(c.getCategoryName());
		categoryService.saveCategory(c);
		return new ModelAndView("adminpage");
	}
	
	
	
	@RequestMapping("removeCategory")
	public String removeCategory(@RequestParam("id")Integer id ,@ModelAttribute("category")Category c) {
		System.out.println(id);
		categoryService.removeCategory(id);
		
		return "redirect:admin";
	}
}
