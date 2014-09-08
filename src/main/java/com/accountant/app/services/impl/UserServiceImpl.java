/**
 * 
 */
package com.accountant.app.services.impl;

import java.util.List;

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
	
	@Autowired
	private UserDAO userDAO;
	
	/**
	 * Method for inserting user details
	 */
	public Boolean createNewUser(Users users) {
		return userDAO.createNewUser(users);
	}

	/**
	 * Method for getting the user details by id
	 */
	public Users getUserDetailsById(int userId) {
		return userDAO.getUserDetailsById(userId);
	}

	/**
	 * Method for getting all user deatils
	 */
	public List<Users> getListOfAllUser() {
		return userDAO.getListOfAllUser();
	}

}
