package com.app.demo.dto;

public class SubCategory {
	private Integer subCategoryId;
	private Category category;
	private String subCategory;
	public Integer getSubCategoryId() {
		return subCategoryId;
	}
	public void setSubCategoryId(Integer subCategoryId) {
		this.subCategoryId = subCategoryId;
	}
	public Category getCategoryId() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public String getSubCategory() {
		return subCategory;
	}
	public void setSubCategory(String subCategory) {
		this.subCategory = subCategory;
	}
	@Override
	public String toString() {
		return "SubCategory [subCategoryId=" + subCategoryId + ", categoryId=" + category + ", subCategory="
				+ subCategory + "]";
	}
	
}
