package com.app.firstpostgrsqlproject;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.app.firstpostgrsqlproject.person.entity.Person;
import com.app.firstpostgrsqlproject.repository.person.PersonRepo;
import com.app.firstpostgrsqlproject.repository.user.UserRepo;
import com.app.firstpostgrsqlproject.user.entity.User;

@SpringBootApplication
public class FirstpostgrsqlprojectApplication implements CommandLineRunner{
	
	@Autowired
	PersonRepo personRepo;
	
	@Autowired
	UserRepo userRepo;

	public static void main(String[] args) {
		SpringApplication.run(FirstpostgrsqlprojectApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		List<User> listuser = userRepo.findAll();
		System.out.println(listuser);
		Person p = new Person();
		p.setId(1);
		p.setName("Mohan");
	//	personRepo.save(p);
		if(p.getId() != 0) {
			System.out.print(p);
		}else {
			System.out.print("not save");
		}
		
	}

}
