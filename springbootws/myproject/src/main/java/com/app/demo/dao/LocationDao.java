package com.app.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.app.demo.entity.LocationEntity;

public interface LocationDao extends JpaRepository<LocationEntity, Integer>{
	@Query("select l from LocationEntity l where l.locationName=?1")
	 List<LocationEntity> findByLocationName(String locationName);
}
