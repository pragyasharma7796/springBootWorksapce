package com.app.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.demo.dao.ProductDao;
import com.app.demo.dto.Product;
import com.app.demo.entity.ProductEntity;

@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductDao productdao;

	@Override
	public void saveProduct(Product product) {
		ProductEntity e = new ProductEntity();
		BeanUtils.copyProperties(product, e);
		productdao.save(e);
	}

	@Override
	public List<Product> getAll() {
		List<ProductEntity> pel =productdao.findAll();
		List<Product> pl = new ArrayList<Product>();
		for(ProductEntity pe : pel) {
			Product p = new Product();
			BeanUtils.copyProperties(pe, p);
			pl.add(p);
		}
		return pl;
	}

}
