package com.app.sample.service;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.sample.dto.EmployeeDto;
import com.app.sample.entity.EmployeeEntity;
import com.app.sample.repository.EmployeeRepository;

@Service
public class EmployeeService {
	   @Autowired
		private EmployeeRepository repository;
		public EmployeeDto addEmployee(EmployeeDto dto) {
			System.out.println(dto);
			EmployeeEntity employeeEntity = new EmployeeEntity();
		//	int cage = LocalDate.now().getYear();
			//employeeEntity.setAge();
			employeeEntity.setDob(new Date(dto.getDob().getTime()));
			BeanUtils.copyProperties(dto, employeeEntity);
			System.out.println(employeeEntity);
			employeeEntity = repository.save(employeeEntity);
			System.out.println(employeeEntity);
			BeanUtils.copyProperties(employeeEntity, dto);
			return dto;
		}
		
		public EmployeeDto getEmployeeById(Long id) {
			EmployeeEntity employeeEntity = repository.findById(id).get();
			EmployeeDto dto = new EmployeeDto();
			BeanUtils.copyProperties(employeeEntity, dto);
			return dto;
		}
		
		public void editEmployee(EmployeeDto dto) {
			EmployeeEntity employeeEntity = new EmployeeEntity();
			BeanUtils.copyProperties(dto, employeeEntity);
			repository.save(employeeEntity);
		}
		public void deleteEmployee(Long id) {
			EmployeeEntity employeeEntity = repository.findById(id).get();
			repository.delete(employeeEntity);
		}
		
		public List<EmployeeDto> listOfEmployee() {
			List<EmployeeEntity> list = repository.findAll();
			List<EmployeeDto> listDtos = new ArrayList<EmployeeDto>();
			list.forEach(e->{
				EmployeeDto dto = new EmployeeDto();
				BeanUtils.copyProperties(e, dto);
				listDtos.add(dto);
			});
			return listDtos;
		}
}
