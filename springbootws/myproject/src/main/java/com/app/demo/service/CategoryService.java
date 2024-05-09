package com.app.demo.service;

import java.util.List;

import com.app.demo.dto.Category;

public interface CategoryService {
	public void saveCategory(Category c);
	public Category getById(Integer id);
	public List<Category> getAll();
	public void removeCategory(Integer id);
}
