package com.app.firstpostgrsqlproject.repository.person;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.firstpostgrsqlproject.person.entity.Person;

public interface PersonRepo extends JpaRepository<Person, Integer> {

}
