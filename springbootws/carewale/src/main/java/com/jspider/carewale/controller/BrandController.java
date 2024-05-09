package com.jspider.carewale.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.jspider.carewale.constant.AppConstant;
import com.jspider.carewale.entity.Brand;
import com.jspider.carewale.service.BrandService;

@RestController
@RequestMapping("/")
public class BrandController {
		@Autowired
		private BrandService brandService;
		@PostMapping(value = AppConstant.SAVE_BRAND_DETAIL)
		public @ResponseBody Brand save(@RequestBody Brand brand) {
			System.out.println(brand);
			return brandService.save(brand);
		}
		
		@GetMapping(value = AppConstant.GET_ALL_BRAND_DETAILS)
		public @ResponseBody List<Brand> getAll(){
			return brandService.getAll();
		}
}
