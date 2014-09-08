/**
 * 
 */
package com.accountant.app.beans;

/**
 * 
 * -------------------------------
 * @author SANDEEP K NAIR
 * EMAIL : sandeepsuvit@gmail.com
 * WEBSITE : www.dotedlabs.com
 * -------------------------------
 *
 * Users.java | com.accountant.app.beans
 *
 * Mar 1, 2014 | 3:15:19 PM | 2014
 *
 * This is a User bean class for mapping the current
 * user details
 */
public class Users {
	private int uId;
	private String userAccId;
	private String userPassword;
	private String userStatus;
	/**
	 * @return the uId
	 */
	public int getuId() {
		return uId;
	}
	/**
	 * @param uId the uId to set
	 */
	public void setuId(int uId) {
		this.uId = uId;
	}
	/**
	 * @return the userAccId
	 */
	public String getUserAccId() {
		return userAccId;
	}
	/**
	 * @param userAccId the userAccId to set
	 */
	public void setUserAccId(String userAccId) {
		this.userAccId = userAccId;
	}
	/**
	 * @return the userPassword
	 */
	public String getUserPassword() {
		return userPassword;
	}
	/**
	 * @param userPassword the userPassword to set
	 */
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	/**
	 * @return the userStatus
	 */
	public String getUserStatus() {
		return userStatus;
	}
	/**
	 * @param userStatus the userStatus to set
	 */
	public void setUserStatus(String userStatus) {
		this.userStatus = userStatus;
	}
	
	
	
}
