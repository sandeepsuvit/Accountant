package com.accountant.app.test;

import org.apache.log4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.accountant.app.services.UserService;
import com.accountant.app.services.impl.UserServiceImpl;

@Controller
@RequestMapping("/welcome")
public class HelloController implements BeanFactoryAware{
	//get log4j handler
	private static final Logger log = Logger.getLogger(HelloController.class);
	private UserService userService;
	
	@RequestMapping(value = "/{name}", method = RequestMethod.GET)
	public String getMovie(@PathVariable String name, ModelMap model) {
		log.info("Going to create HelloWord Obj");

		
		model.addAttribute("name", name);
		log.info("Exiting the program");
		return "home";
 
	}

	@Override
	public void setBeanFactory(BeanFactory context) throws BeansException {
		// TODO Auto-generated method stub
		userService = context.getBean("userService", UserServiceImpl.class);
		log.info("Getting user dao--->"+userService);
	}

	
}
