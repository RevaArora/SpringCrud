package com.spring.service;


import java.util.List;

import javax.sql.DataSource;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.model.EmpData;
import com.spring.model.EmpMapper;

public class DatabaseOperation implements DatabaseOperationDAO {
	//private DataSource dataSource;
	private JdbcTemplate databaseOperationObject;

	public void setDataSource(DataSource dataSource) {
	//	this.dataSource = dataSource;
		this.databaseOperationObject = new JdbcTemplate(dataSource);
	}

	public String create(String name, String department) {
		try {
			databaseOperationObject.execute("insert into EMP (name,department) values (\'"+name+"\',\'"+department+"\')");
		} catch (DataAccessException e) {
			// TODO Auto-generated catch block
			System.out.println("error here");
			e.printStackTrace();
			return e.getMessage();
		}
		System.out.println("Created Record Name = " + name + " Department = "
				+ department);
		return "Record updated sucessfully";
	}

	public List<EmpData> listData() {
		String SQL = "select * from EMP";
		List<EmpData>  empdata;
		try {
			empdata = databaseOperationObject.query(SQL, new EmpMapper());
		} catch (DataAccessException e) {
			System.out.println("error here");
			e.printStackTrace();
			return null;
		}
		return empdata;
	}
	
	public String deletedata(String name) {
		String SQL = "delete from EMP where NAME=\""+name+"\"";
		try {
			databaseOperationObject.execute(SQL);
		} catch (DataAccessException e) {
			// TODO Auto-generated catch block
			System.out.println("error here");
			e.printStackTrace();
			return e.getMessage();
		}
		System.out.println("Deleted Record Name = " + name);
		return "Record deleted sucessfully";
	}

}
