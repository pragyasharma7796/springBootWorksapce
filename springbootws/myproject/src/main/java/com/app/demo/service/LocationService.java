package com.app.demo.service;

import java.util.List;

import com.app.demo.dto.Location;

public interface LocationService {
	public void addLocation(Location l);
	public void updateLocation(Location l);
	public Location getLocationById(Integer l);
	public List<Location> getAll();
	public List<Location> getByName(String Name);
}
