package com.app.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.demo.dao.SubCategoryDao;
import com.app.demo.dto.Category;
import com.app.demo.dto.SubCategory;
import com.app.demo.entity.CategoryEntity;
import com.app.demo.entity.SubCategoryEntity;

@Service
public class SubCategoryServiceImpl implements SubCategoryService {
	@Autowired
	private SubCategoryDao subCategoryDao;

	@Override
	public void saveSubCategory(SubCategory subCategory) {
		SubCategoryEntity sce = new SubCategoryEntity();
		BeanUtils.copyProperties(subCategory, sce);
		
		subCategoryDao.save(sce);
	}

	@Override
	public List<SubCategory> getAll() {
		List<SubCategoryEntity> scel =subCategoryDao.findAll();
		List<SubCategory> scl = new ArrayList<SubCategory>();
		for(SubCategoryEntity sce : scel) {
			SubCategory sc = new SubCategory();
			BeanUtils.copyProperties(sce, sc);
			scl.add(sc);
		}
		return scl;
	}

	
	  @Override public List<SubCategory> getByCategory(Category category) {
		/*
		 * CategoryEntity ce = new CategoryEntity(); BeanUtils.copyProperties(category,
		 * ce);
		 */
	  
	  return null; }
	 

}
