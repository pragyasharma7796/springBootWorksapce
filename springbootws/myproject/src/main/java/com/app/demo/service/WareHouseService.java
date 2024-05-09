package com.app.demo.service;

import java.util.List;

import com.app.demo.dto.WareHouse;

public interface WareHouseService {
	public void saveWareHouse(WareHouse wareHouse);
	public List<WareHouse>  listofAllWareHouse();
	public WareHouse wareHousegetById(Integer id);
}
