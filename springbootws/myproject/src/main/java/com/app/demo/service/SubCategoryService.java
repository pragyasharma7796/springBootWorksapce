package com.app.demo.service;

import java.util.List;

import com.app.demo.dto.Category;
import com.app.demo.dto.SubCategory;

public interface SubCategoryService {
		public void saveSubCategory(SubCategory subCategory);
		public List<SubCategory> getAll();
		public List<SubCategory> getByCategory(Category category);
}
