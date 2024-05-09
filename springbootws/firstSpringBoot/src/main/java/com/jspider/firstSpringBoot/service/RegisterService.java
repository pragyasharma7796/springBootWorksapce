package com.jspider.firstSpringBoot.service;

import java.util.List;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jspider.firstSpringBoot.dto.RegisterDto;
import com.jspider.firstSpringBoot.entity.Register;
import com.jspider.firstSpringBoot.repository.RegisterRepository;

@Service
public class RegisterService {
		@Autowired
		private RegisterRepository repository;
	   private static final Logger LOGGER = LoggerFactory.getLogger(RegisterService.class);
		public Register addRegister(Register register) {
			LOGGER.info("inside register service addservicemethod"+register);
			return repository.save(register);
		}
		
		public List<Register> getAllData(){
			LOGGER.warn("warn statement");

			return repository.findAll();
		}
		
		public Register getById(Long id) {
			return repository.findById(id).get();
		}
		
		public void deleteById(Long id) {
			Register register = getById(id);
			 repository.delete(register);
		}
		
		public List<Register> save(List<Register> registers) {
					  return	repository.saveAll(registers);
		}
		
		public void update(List<RegisterDto> registerDtos) {
		
			registerDtos.forEach(rd->{
				Register register = new Register();
				 BeanUtils.copyProperties(rd, register);
				 repository.save(register);
			});
		}
}
