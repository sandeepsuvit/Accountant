/**
 * 
 */
package com.accountant.app.controllers;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.accountant.app.beans.Users;
import com.accountant.app.services.UserService;
import com.accountant.app.utlity.constants.CommonConstants;

/**
 * 
 * -------------------------------
 * @author SANDEEP K NAIR
 * EMAIL : sandeepsuvit@gmail.com
 * WEBSITE : www.dotedlabs.com
 * -------------------------------
 *
 * DashboardController.java | com.accountant.app.controllers
 *
 * Mar 1, 2014 | 6:35:09 PM | 2014
 * 
 * The Dashboard Controller
 */
@Controller
@RequestMapping("/home")
public class DashboardController {
	private static final Logger log = Logger.getLogger(DashboardController.class);
	
	@Autowired
	private UserService userService;
	
	/**
	 * Displays the summary page with the summary details
	 * @param model
	 * @return
	 */
	@RequestMapping("/")
	public String getSummary( ModelMap model) {
		log.info("ENTERING METHOD :: getSummary");
		Users users = userService.getUserDetailsById(1);
	
		Map<String, Object> viewMap = new HashMap<String, Object>();
		
		viewMap.put(CommonConstants.USER_NAME, users.getUserFname() +CommonConstants.SPACE_DELIMITER+ users.getUserLname());
		viewMap.put(CommonConstants.USERS_LIST, userService.getAllUserDetails());
		
		model.addAllAttributes(viewMap);
		log.info("EXITING METHOD :: getSummary");
		return CommonConstants.HOME_PAGE;
	}

}
