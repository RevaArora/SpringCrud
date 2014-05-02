package com.spring.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class EmpMapper implements RowMapper<EmpData> {

	@Override
	public EmpData mapRow(ResultSet rs, int rowNum) throws SQLException {
	
			EmpData empdata = new EmpData();
			empdata.setName(rs.getString(1));
			empdata.setDepartment(rs.getString(2));
		     
		      return empdata;
		   }
	}

