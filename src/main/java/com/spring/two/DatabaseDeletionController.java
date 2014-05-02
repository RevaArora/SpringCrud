package com.spring.two;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.model.EmpData;
import com.spring.service.DatabaseOperation;

@Controller
public class DatabaseDeletionController {
	@Autowired
	private DatabaseOperation databaseOperation;

	@RequestMapping(value = "/deleteRecord", method = RequestMethod.GET)
	public String getinput(@ModelAttribute("deleteThisData") EmpData empdata,
			ModelMap model) {
		List<EmpData> result = new ArrayList<EmpData>();
		result = databaseOperation.listData();
		List<String> datatosendtoform = new ArrayList<String>();
		for (EmpData a : result) {
			datatosendtoform.add(a.getName());
		}

		model.addAttribute("employeeData", datatosendtoform);
		return "deleteRecord";

	}

	@RequestMapping(value = "/deleteRecord", method = RequestMethod.POST)
	public String deleteData(@ModelAttribute("deleteThisData") EmpData empdata,
			ModelMap model) {
		List<EmpData> allrecords = new ArrayList<EmpData>();
		allrecords = databaseOperation.listData();
		List<String> datatosendtoform = new ArrayList<String>();
		for (EmpData a : allrecords) {
			datatosendtoform.add(a.getName());
		}

		model.addAttribute("employeeData", datatosendtoform);
		
		String result = databaseOperation.deletedata(empdata.getName());
		model.addAttribute("result", result);
		System.out.println(empdata.getName());
		return "deleteRecord";

	}
	//for restful application
	@RequestMapping(value = "/employee/{id}", method = RequestMethod.DELETE)
	public String deleteEmployee(@ModelAttribute("deleteThisData") EmpData empdata,
			ModelMap model,@PathVariable String id){
			List<EmpData> allrecords = new ArrayList<EmpData>();
			allrecords = databaseOperation.listData();
			List<String> datatosendtoform = new ArrayList<String>();
			for (EmpData a : allrecords) {
				datatosendtoform.add(a.getName());
			}

			model.addAttribute("employeeData", datatosendtoform);
			
			String result = databaseOperation.deletedata(id);
			model.addAttribute("result", result);
			System.out.println(empdata.getName());
			return "deleteRecord";

	}
	
}
