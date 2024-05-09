package com.app.eshop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.stereotype.Service;

import com.app.eshop.dto.Output;
import com.app.eshop.dto.OutputMapper;

@Service
public class JdbcService {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List<Output> getGrantAndSumOfAllocatio(Long planId){
		String q = "SELECT g.id grant_id,SUM(a.number_of_allocation) sum FROM grant_table g JOIN allocation_table a WHERE g.id = a.grant_id  AND g.plan_id = ? AND a.allocation_status = 'approve';";
		
		List<Output> list = jdbcTemplate.query(q,new OutputMapper()  ,planId);
		list.forEach(o->System.out.print(o.toString()));
		return list;
	}
}
