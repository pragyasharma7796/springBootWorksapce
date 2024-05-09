package com.app.eshop.dto;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class OutputMapper implements RowMapper<Output> {

	@Override
	public Output mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		
		Output output = new Output();
		output.setGrantId(rs.getLong("grant_id"));
		output.setSum(rs.getDouble("sum"));
		return output;
	}

}
