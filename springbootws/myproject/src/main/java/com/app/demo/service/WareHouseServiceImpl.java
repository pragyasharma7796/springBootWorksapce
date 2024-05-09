package com.app.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.demo.dao.WareHauseDao;
import com.app.demo.dto.WareHouse;
import com.app.demo.entity.WareHouseEntity;

@Service
public class WareHouseServiceImpl implements WareHouseService {
	@Autowired
	private WareHauseDao wareHouseDao;

	@Override
	public void saveWareHouse(WareHouse wareHouse) {
		WareHouseEntity we = new WareHouseEntity();
		BeanUtils.copyProperties(wareHouse, we);
		wareHouseDao.save(we);

	}

	@Override
	public List<WareHouse> listofAllWareHouse() {
		List<WareHouseEntity> whel =  wareHouseDao.findAll();
		List<WareHouse> whl = new ArrayList<WareHouse>();
		for(WareHouseEntity whe: whel) {
			WareHouse  wh = new WareHouse();
			BeanUtils.copyProperties(whe, wh);
			whl.add(wh);
		}
		return whl;
	}

	@Override
	public WareHouse wareHousegetById(Integer id) {
		Optional<WareHouseEntity> op = wareHouseDao.findById(id);
		WareHouseEntity wh=null;
		if(op.isPresent()) {
			wh = op.get();
		}
		System.out.println(wh);
		WareHouse w = new WareHouse();
		BeanUtils.copyProperties(wh, w);
		return w;
	}

}
