package com.spring.service;

import java.util.List;

import javax.sql.DataSource;

import com.spring.model.EmpData;

public interface DatabaseOperationDAO {
	public void setDataSource(DataSource datasource);

	public String create(String name, String department);
	public List<EmpData> listData();
	public String deletedata(String name);
	
	

}
