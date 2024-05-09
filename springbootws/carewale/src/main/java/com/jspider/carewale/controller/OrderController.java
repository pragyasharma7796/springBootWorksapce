package com.jspider.carewale.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jspider.carewale.constant.AppConstant;
import com.jspider.carewale.dto.BookDto;
import com.jspider.carewale.dto.OrderDto;
import com.jspider.carewale.service.OrderDetailsService;

@RestController
@RequestMapping(value =AppConstant.FORWARD_SLASH)
public class OrderController {
	@Autowired
	private OrderDetailsService orderDetailsService;
	
	@PostMapping(value =AppConstant.BOOK_ORDER)
	public void book(@RequestBody BookDto bookDto) {
		orderDetailsService.saveBookOrder(bookDto);
	}
	@PostMapping(value = AppConstant.DEILEVER_ORDER)
	public void deliverOrder(@RequestBody OrderDto  orderDto) {
		orderDetailsService.saveDeliverOrder(orderDto);
	}
}
