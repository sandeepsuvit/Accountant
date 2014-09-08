package com.accountant.app.services;

import java.util.List;

import com.accountant.app.beans.Users;

/**
 * 
 * -------------------------------
 * @author SANDEEP K NAIR
 * EMAIL : sandeepsuvit@gmail.com
 * WEBSITE : www.dotedlabs.com
 * -------------------------------
 *
 * UserService.java | com.accountant.app.services
 *
 * Mar 1, 2014 | 4:58:05 PM | 2014
 *
 */
public interface UserService {
	/**
	 * Inserting user details to the database
	 * @param users
	 * @return 
	 */
	public Boolean createNewUser(Users users);
	
	
	/**
	 * Returns a user details
	 * @param userId
	 * @return
	 */
	public Users getUserDetailsById(int userId);
	
	/**
	 * Returns details of all the users
	 * @return
	 */
	public List<Users> getListOfAllUser();
}
