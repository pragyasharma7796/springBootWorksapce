package com.app.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.demo.entity.User;

public interface UserDao extends JpaRepository<User, Long> {
	User findByName(String name);
}
