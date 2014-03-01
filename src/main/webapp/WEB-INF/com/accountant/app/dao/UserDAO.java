package com.accountant.app.dao;

import com.accountant.app.beans.Users;

/**
 * 
 * @author Sandeep
 *
 */
public interface UserDAO{
	
	/**
	 * Inserting user details to the database
	 * @param users
	 */
	public void insertUserDetails(Users users);
	
	
	/**
	 * Returns a user details
	 * @param userId
	 * @return
	 */
	public Users getUserDetailsById(int userId);
}
