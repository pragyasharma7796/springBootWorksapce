package com.jspider.carewale.service;

import java.sql.Date;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jspider.carewale.dto.BookDto;
import com.jspider.carewale.dto.OrderDto;
import com.jspider.carewale.entity.OrderDetails;
import com.jspider.carewale.repository.OrderDetailRepository;

@Service
public class OrderDetailsService {
		@Autowired
		private OrderDetailRepository detailRepository;
		public void saveBookOrder(BookDto dto){
			OrderDetails orederDetails = new OrderDetails();
			orederDetails.setBrandId(dto.getBradId());
			orederDetails.setAdvancePaid(dto.getAdvancePaid());
			orederDetails.setPaymentMode(dto.getPaymentMode());
			orederDetails.setIsDelivered(false);
			orederDetails.setOrderdDate(Date.valueOf(LocalDate.now()));
			orederDetails.setTotalAmountReceived(dto.getAdvancePaid());
			detailRepository.save(orederDetails);
		}
		
		public void saveDeliverOrder(OrderDto dto) {
			System.out.println(dto);
			OrderDetails details = detailRepository.findById(dto.getOrderId()).get();
			System.out.println(details);
			LocalDate localDate = LocalDate.now();
			details.setDeliveredDate(Date.valueOf(localDate));
			details.setIsDelivered(true);
			 double amount = details.getAdvancePaid()+dto.getAmountPaid();
			details.setTotalAmountReceived(amount);
			detailRepository.save(details);
		}
}
