package com.app.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.demo.dao.CategoryDao;
import com.app.demo.dto.Category;
import com.app.demo.entity.CategoryEntity;

@Service
public class CategoryServiceImple implements CategoryService {
	
	@Autowired
	private CategoryDao dao;
	
	@Override
	public void saveCategory(Category c) {
		CategoryEntity ce = new CategoryEntity();
		BeanUtils.copyProperties(c, ce);
		dao.save(ce);

	}

	@Override
	public Category getById(Integer id) {
		CategoryEntity ce =dao.getById(id);
		Category c = new Category();
		BeanUtils.copyProperties(ce, c);
		return c;
	}

	@Override
	public List<Category> getAll() {
		List<CategoryEntity> cel = dao.findAll();
		List<Category> cl = new ArrayList<Category>();
		for(CategoryEntity ce: cel) {
			Category c = new Category();
			BeanUtils.copyProperties(ce, c);
			cl.add(c);
		}
		return cl;
	}

	@Override
	public void removeCategory(Integer id) {
	    CategoryEntity ce = dao.getById(id);
	    dao.delete(ce);
	}

}
