package com.app.demo.service;

import java.util.List;


import com.app.demo.dto.UserDto;
import com.app.demo.entity.User;

public interface UserService {
	public void addUser(UserDto user);
	public User givenDataById(Long id);
	public List<UserDto> givenAll();
	public User getByName(String name);
}
