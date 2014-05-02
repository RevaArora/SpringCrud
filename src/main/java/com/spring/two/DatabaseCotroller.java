package com.spring.two;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.spring.model.EmpData;
import com.spring.service.DatabaseOperation;


@Controller

public class DatabaseCotroller {
	
	@Autowired
	private DatabaseOperation databaseOperation;
	@RequestMapping(value = "/insertRecord",method = RequestMethod.GET)
	public String displayData(@ModelAttribute ("empdata") EmpData empdata, ModelMap model){

		return "insertRecord";
		
	}
	
	@RequestMapping(value = "/insertRecord",method = RequestMethod.POST)
	public String insertData(@ModelAttribute ("empdata") EmpData empdata, ModelMap model){

		/*ApplicationContext context = 
	             new ClassPathXmlApplicationContext("mvc-dispatcher-servlet.xml");
		DatabaseOperation DBOperation = 
			      (DatabaseOperation)context.getBean("databaseOperation");*/
		String result ="";
		if(empdata.getName()!=null && empdata.getDepartment()!=null)
		 result = databaseOperation.create(empdata.getName(), empdata.getDepartment());
		model.addAttribute("result", result);
		return "insertRecord";
		
	}
	


    
}