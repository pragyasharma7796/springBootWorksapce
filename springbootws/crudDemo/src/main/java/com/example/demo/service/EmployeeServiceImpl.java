package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.EmployeeDAO;
import com.example.demo.dto.EmployeeDTO;
import com.example.demo.entity.EmployeeEntity;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeDAO dao;
	
	
	@Override
	public void save(EmployeeDTO e) {
		EmployeeEntity emp=new EmployeeEntity();
		BeanUtils.copyProperties(e, emp);
		dao.save(emp);
		}


	@Override
	public List<EmployeeDTO> getAll() {
		List<EmployeeDTO> dtoList=null;
		List<EmployeeEntity> eList=dao.findAll();
		if(eList!=null && !eList.isEmpty()){
			dtoList=new ArrayList<EmployeeDTO>();
			for(EmployeeEntity emp:eList){
				EmployeeDTO e=new EmployeeDTO();
				BeanUtils.copyProperties(emp,e);
				dtoList.add(e);				
			}
		}
		return dtoList;
	}

	@Override
	public EmployeeDTO findById(Integer id) {
		EmployeeDTO e=null;
//		EmployeeEntity emp=dao.findById(id).orElse(null);
//		if(emp!=null){
//		e=new EmployeeDTO();
//		BeanUtils.copyProperties(emp,e);
//		}
		
		Optional<EmployeeEntity> op = dao.findById(id);
		if(op.isPresent()) {
			EmployeeEntity emp = op.get();
			e=new EmployeeDTO();
			BeanUtils.copyProperties(emp,e);
		}
		return e;
	}

	@Override
	public void update(EmployeeDTO e) {
		EmployeeEntity entity=new EmployeeEntity();
		BeanUtils.copyProperties(e, entity);
		dao.save(entity);
	}

	@Override
	public void delete(Integer id) {
		dao.deleteById(id);
	}


//	@Override
//	public List<EmployeeDTO> searchByNameAndCity(String name, String city) {
//		List<EmployeeDTO> dtoList=null;
//		List<EmployeeEntity> eList=dao.searchByNameAndCity(name, city);
//		if(eList!=null && !eList.isEmpty()){
//			dtoList=new ArrayList<EmployeeDTO>();
//			for(EmployeeEntity emp:eList){
//				EmployeeDTO e=new EmployeeDTO();
//				BeanUtils.copyProperties(emp,e);
//				dtoList.add(e);				
//			}
//		}
//		return dtoList;
//	}

}
