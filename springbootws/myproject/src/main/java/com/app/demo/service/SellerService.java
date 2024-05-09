package com.app.demo.service;

import java.util.List;

import com.app.demo.dto.Seller;

public interface SellerService {
	public void saveSeller(Seller s);
	public List<Seller> getAll();
	public Seller findById(Integer id);
}
