/**
 * 
 */
package com.accountant.app.services.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accountant.app.beans.Users;
import com.accountant.app.dao.UserDAO;
import com.accountant.app.services.UserService;

/**
 * -------------------------------
 * @author SANDEEP K NAIR
 * EMAIL : sandeepsuvit@gmail.com
 * WEBSITE : www.dotedlabs.com
 * -------------------------------
 *
 * UserServiceImpl.java | com.accountant.app.services.impl
 *
 * Mar 1, 2014 | 4:53:35 PM | 2014
 * 
 */
@Service("userService")
public class UserServiceImpl implements UserService{
	private static final Logger log = Logger.getLogger(UserServiceImpl.class);
	
	@Autowired
	private UserDAO userDAO;
	
	/**
	 * Method for inserting user details
	 */
	public void insertUserDetails(Users users) {
		log.info("ENTERING METHOD :: insertUserDetails");
		userDAO.insertUserDetails(users);
		log.info("EXITING METHOD :: insertUserDetails");
	}

	/**
	 * Method for getting the user details by id
	 */
	public Users getUserDetailsById(int userId) {
		log.info("ENTERING METHOD :: getUserDetailsById");
		log.info("EXITING METHOD :: getUserDetailsById");
		return userDAO.getUserDetailsById(userId);
	}

	/**
	 * Method for getting all user deatils
	 */
	public List<Users> getAllUserDetails() {
		log.info("ENTERING METHOD :: getAllUserDetails");
		log.info("EXITING METHOD :: getAllUserDetails");
		return userDAO.getAllUserDetails();
	}

}
