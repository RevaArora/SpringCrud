package com.spring.two;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloWorldController {

	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {

		model.addAttribute("message", "Spring 3 MVC Hello World ");// message
																	// is
																	// attribute
																	// name and
																	// after
																	// that its
																	// value
		return "hello"; // this is name of jsp file to be called

	}
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String printWelcomeOnIndexPage(ModelMap model) {

		model.addAttribute("message", "Spring 3 MVC Hello World 2");
		return "hello"; // this is name of jsp file to be called

	}

}