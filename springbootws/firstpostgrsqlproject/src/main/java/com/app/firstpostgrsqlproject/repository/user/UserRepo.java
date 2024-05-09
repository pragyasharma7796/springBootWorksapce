package com.app.firstpostgrsqlproject.repository.user;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.firstpostgrsqlproject.user.entity.User;

public interface UserRepo extends JpaRepository<User, Long> {

}
