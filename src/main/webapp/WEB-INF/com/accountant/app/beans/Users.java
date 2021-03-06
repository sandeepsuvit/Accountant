/**
 * 
 */
package com.accountant.app.beans;

/**
 * @author Sandeep
 *
 */
public class Users {
	private int userId;
	private String userFname;
	private String userLname;
	private String userEmail;
	
	/**
	 * Empty constructor
	 */
	public Users(){
		
	}
	
	/**
	 * @param userId
	 * @param userFname
	 * @param userLname
	 * @param userEmail
	 */
	public Users( String userFname, String userLname,
			String userEmail) {
		this.userFname = userFname;
		this.userLname = userLname;
		this.userEmail = userEmail;
	}


	/**
	 * @return the userId
	 */
	public int getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}
	/**
	 * @return the userFname
	 */
	public String getUserFname() {
		return userFname;
	}
	/**
	 * @param userFname the userFname to set
	 */
	public void setUserFname(String userFname) {
		this.userFname = userFname;
	}
	/**
	 * @return the userLname
	 */
	public String getUserLname() {
		return userLname;
	}
	/**
	 * @param userLname the userLname to set
	 */
	public void setUserLname(String userLname) {
		this.userLname = userLname;
	}
	/**
	 * @return the userEmail
	 */
	public String getUserEmail() {
		return userEmail;
	}
	/**
	 * @param userEmail the userEmail to set
	 */
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
}
