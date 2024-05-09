package com.app.demo.service;

import java.util.List;

import com.app.demo.model.Student;

public interface StudentService {
	public List<Student> getAll();
	public void save(Student stu);
	public void update(Student stu);
	public void delete(Student stu);
	public Student getById(Integer stuId);
}
