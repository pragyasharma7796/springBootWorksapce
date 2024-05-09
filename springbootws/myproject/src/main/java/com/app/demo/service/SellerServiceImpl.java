package com.app.demo.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.demo.dao.SellerDao;
import com.app.demo.dto.Seller;
import com.app.demo.entity.SellerEntity;

@Service
public class SellerServiceImpl implements SellerService {
	@Autowired
	private SellerDao sellerdao;

	@Override
	public void saveSeller(Seller s) {
		SellerEntity se = new SellerEntity();
		BeanUtils.copyProperties(s, se);
		sellerdao.save(se);
	}

	@Override
	public List<Seller> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Seller findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
