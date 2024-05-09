package com.app.demo.service;

import static org.junit.Assert.assertTrue;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.modules.junit4.PowerMockRunner;
import org.springframework.test.util.ReflectionTestUtils;

import com.app.demo.dao.UserDao;
import com.app.demo.entity.User;

@RunWith(value=PowerMockRunner.class)

public class UserServiceTest {
	@Mock
	UserDao repo;
	
	@Mock
	UserService  service;
	
	@Test
	public void testGetUserdtoByName() throws Exception {
		MockitoAnnotations.initMocks(this);
		User mock = PowerMockito.mock(User.class);
		PowerMockito.when(repo,"findByName","name").thenReturn(mock);
		
		ReflectionTestUtils.invokeMethod(service,"getByName","name");
		assertTrue(true);
	}
	
	@Test
	public void testGetUserById() throws Exception{
		MockitoAnnotations.initMocks(this);
		Optional<User> mock = PowerMockito.mock(Optional.class);
		PowerMockito.when(repo,"findById",1L).thenReturn(mock);
		
		ReflectionTestUtils.invokeMethod(service,"givenDataById",1L);
		assertTrue(true);
	}
}


