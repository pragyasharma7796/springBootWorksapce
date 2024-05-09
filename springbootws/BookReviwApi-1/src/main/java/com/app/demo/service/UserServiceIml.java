package com.app.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.demo.dao.UserDao;
import com.app.demo.dto.UserDto;
import com.app.demo.entity.User;

@Service
public class UserServiceIml implements UserService{
	
	@Autowired
	private UserDao userDao;

	@Override
	public void addUser(UserDto user) {
		// TODO Auto-generated method stub
		User userEntity = new User();
		BeanUtils.copyProperties(user, userEntity);
		userDao.save(userEntity);
	}

	@Override
	public User givenDataById(Long id) {
		// TODO Auto-generated method stub
		
		
		return userDao.findById(id).get();
	}

	@Override
	public List<UserDto> givenAll() {
		List<User> ul=userDao.findAll();
		List<UserDto> userdtolist=new ArrayList<UserDto>();
		ul.forEach(u->{
			UserDto ud= new UserDto();
			BeanUtils.copyProperties(u, ud);
			userdtolist.add(ud);
		});
		return userdtolist;
	}
	@Override
	public User getByName(String name) {
		return userDao.findByName(name);
	}
}
