package com.accountant.app.controllers;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.accountant.app.beans.Users;
import com.accountant.app.dao.impl.UserDaoImpl;

@Controller
@RequestMapping("/welcome")
public class HelloController {
	//get log4j handler
	private static final Logger log = Logger.getLogger(HelloController.class);
	
	@RequestMapping(value = "/{name}", method = RequestMethod.GET)
	public String getMovie(@PathVariable String name, ModelMap model) {
		log.info("Going to create HelloWord Obj");
		//Users users = new Users("Rupam","Gogoi","rupam@maillcom");
		//new UserDaoImpl().insertUserDetails(users);
		Users users = new UserDaoImpl().getUserDetailsById(1);
		System.out.println(users);
		model.addAttribute("name", name);
		log.info("Exiting the program");
		return "home";
 
	}
}
