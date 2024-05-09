package com.app.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.demo.dao.LocationDao;
import com.app.demo.dto.Location;
import com.app.demo.entity.LocationEntity;

@Service

public class LocationServiceImpl implements LocationService {
	@Autowired
	private LocationDao dao;
	
	@Override
	public void addLocation(Location l) {
		LocationEntity locationEntity = new LocationEntity();
		BeanUtils.copyProperties(l, locationEntity);
		dao.save(locationEntity);
		
	}

	@Override
	public void updateLocation(Location l) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Location getLocationById(Integer l) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Location> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Location> getByName(String name) {
		List<LocationEntity>  list = dao.findByLocationName(name);
		List<Location> locationList=new ArrayList<Location>();
		for(LocationEntity le:list) {
			Location l = new Location();
			BeanUtils.copyProperties(le, l);
			locationList.add(l);
		}
		return locationList ;
	}

}
