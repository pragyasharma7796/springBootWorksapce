package com.app.demo.service;

import java.util.List;

import com.app.demo.dto.Product;

public interface ProductService {
		public void saveProduct(Product product);
		public List<Product> getAll();
}
