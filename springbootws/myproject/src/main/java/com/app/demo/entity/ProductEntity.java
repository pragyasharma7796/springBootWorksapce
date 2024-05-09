package com.app.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name= "product")
public class ProductEntity {
	@Id
	@GeneratedValue
   public Integer productId;
	@ManyToOne
	@JoinColumn(name="subCategoryId")
   public SubCategoryEntity subCategory;
   public String availableQuatity;
   public String description;
   public String image;
   public String name;
   public String price;
		public Integer getProductId() {
			return productId;
		}
		public void setProductId(Integer productId) {
			this.productId = productId;
		}
		public SubCategoryEntity getSubCategoryId() {
			return subCategory;
		}
		public void setSubCategoryId(SubCategoryEntity subCategory) {
			this.subCategory = subCategory;
		}
		public String getAvailableQuatity() {
			return availableQuatity;
		}
		public void setAvailableQuatity(String availableQuatity) {
			this.availableQuatity = availableQuatity;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public String getImage() {
			return image;
		}
		public void setImage(String image) {
			this.image = image;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getPrice() {
			return price;
		}
		public void setPrice(String price) {
			this.price = price;
		}
		@Override
		public String toString() {
			return "Product [productId=" + productId + ", subCategoryId=" + subCategory + ", availableQuatity="
					+ availableQuatity + ", description=" + description + ", image=" + image + ", name=" + name + ", price="
					+ price + "]";
		}
   
}
