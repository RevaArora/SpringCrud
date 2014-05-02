package com.spring.two;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.model.EmpData;
import com.spring.service.DatabaseOperation;

@Controller

public class DatabaseDisplayController {
	@Autowired
	private DatabaseOperation databaseOperation;
	@RequestMapping(value = "/DatabaseDisplay",method = RequestMethod.GET)
	public String displayData(@ModelAttribute ("empdata") EmpData empdata, ModelMap model){
		List<EmpData> result = new 	ArrayList<EmpData>();
		 result = databaseOperation.listData();
		
		 model.addAttribute("employeeData", result);
		 return "AllRecords";
	}

}
