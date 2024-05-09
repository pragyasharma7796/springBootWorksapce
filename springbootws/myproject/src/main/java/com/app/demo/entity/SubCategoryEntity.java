package com.app.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="sub_category")
public class SubCategoryEntity {
	@Id
	@GeneratedValue
	private Integer subCategoryId;
	
	@ManyToOne
	@JoinColumn(name="categoryId")
	private CategoryEntity category;
	private String subCategory;
	public Integer getSubCategoryId() {
		return subCategoryId;
	}
	public void setSubCategoryId(Integer subCategoryId) {
		this.subCategoryId = subCategoryId;
	}
	public CategoryEntity getCategoryId() {
		return category;
	}
	public void setCategory(CategoryEntity categoryId) {
		this.category = categoryId;
	}
	public String getSubCategory() {
		return subCategory;
	}
	public void setSubCategory(String subCategory) {
		this.subCategory = subCategory;
	}
	@Override
	public String toString() {
		return "SubCategoryEntity [subCategoryId=" + subCategoryId + ", categoryId=" + category + ", subCategory="
				+ subCategory + "]";
	}
	
}
