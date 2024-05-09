package com.app.demo.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.demo.dao.StudentDao;
import com.app.demo.entity.StudentEntity;
import com.app.demo.model.Student;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	StudentDao dao;
	
	@Override
	public List<Student> getAll() {
		List<Student> el = new ArrayList<Student>();
		List<StudentEntity> ele = dao.findAll();
		System.out.println(ele);
		for(StudentEntity stuEntity :ele) {
			Student stu = new Student();
			BeanUtils.copyProperties(stuEntity, stu);
			el.add(stu);
		}
		return el;
	}

	@Override
	public void save(Student stu) {
		StudentEntity s = new StudentEntity();
		BeanUtils.copyProperties(stu, s);
		dao.save(s);

	}

	@Override
	public void update(Student stu) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Student stu) {
		// TODO Auto-generated method stub

	}

	@Override
	public Student getById(Integer stuId) {
		StudentEntity ste = dao.getById(stuId);
		Student st = new Student();
		BeanUtils.copyProperties(ste, st);
		return st;
	}

}
