package com.app.demo.controller;

import java.io.File;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.app.demo.dto.Product;
import com.app.demo.dto.Seller;
import com.app.demo.dto.SubCategory;
import com.app.demo.service.ProductService;
import com.app.demo.service.SellerService;

@Controller
public class SellerController {
	@Autowired 
	private ProductService productService;
	
	@Autowired
	private SellerService sellerService;
	
	@RequestMapping("sellerReg")
	public ModelAndView sellerReg() {
		ModelAndView mav = new ModelAndView("sellerRegForm");
		mav.addObject("seller", new Seller());
		return mav;
	}
	
	@RequestMapping("saveSeller")
	public String saveSeller(@ModelAttribute("seller")Seller seller) {
		sellerService.saveSeller(seller);
		return "redirect:sellerReg";
	}
	
	@RequestMapping("product")
	public ModelAndView show() {
		ModelAndView mav = new ModelAndView("product");
		mav.addObject("product",new Product());
		return mav;
	}
	
	@PostMapping("/upload") 
	 @ResponseBody
	  public ResponseEntity<?> handleFileUpload( @RequestParam("file") MultipartFile file ,HttpSession session) {

	    String fileName = file.getOriginalFilename();
	   
	    try {
	      file.transferTo( new File("d:\\abc\\" + fileName));
	      session.setAttribute("productImage","d:\\abc\\" + fileName);
	    } catch (Exception e) {
	      return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
	    } 
	    return ResponseEntity.ok("File uploaded successfully.");
	  }
	
	@RequestMapping("uplaodProduct")
	public String uploadProduct(@ModelAttribute("product")Product p,@RequestParam("subcategory")Integer sc,HttpSession session) {
		p.setImage((String)session.getAttribute("productImage"));
		SubCategory cs= new SubCategory();
		cs.setSubCategoryId(sc);
		p.setSubCategoryId(cs);
		productService.saveProduct(p);
		return "redirect:product";
	}

	@RequestMapping("sellerLogin")
	public ModelAndView sellerLogin(){
		return new ModelAndView("SellerLoginPage");
	}

}
