package com.spring.two;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RestController {
	
	@RequestMapping(value="/query/{name}", method = RequestMethod.GET) //get name of url in Variable "name"
	public String DisplayRest(@PathVariable String name,ModelMap model){
		model.addAttribute("path",name);// attribute name is movie, with text "name" in it
		return "list"; // list.jsp to be called
	}
	@RequestMapping(value="/query", method = RequestMethod.GET)// for default "/"
	public String DisplayRestDefault(ModelMap model){
		model.addAttribute("path","you have not entered anything after /");
		return "list";
	}

}
