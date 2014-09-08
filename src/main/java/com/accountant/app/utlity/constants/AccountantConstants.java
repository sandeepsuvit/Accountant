/**
 * 
 */
package com.accountant.app.utlity.constants;

/**
 * 
 * -------------------------------
 * @author SANDEEP K NAIR
 * EMAIL : sandeepsuvit@gmail.com
 * WEBSITE : www.dotedlabs.com
 * -------------------------------
 *
 * CommonConstants.java | com.accountant.app.utlity.constants
 *
 * Mar 1, 2014 | 5:37:28 PM | 2014
 * 
 * Contains all commonly used values
 */
public final class AccountantConstants {
	
	private AccountantConstants() {
		// Private constructor to avoid creating object for this class
	}
	
	/* Service Codes */
	public static final String SUCCESS = "success";
	public static final String NO_RECORDS_FOUND = "No records found";
	public static final int ERROR_CODE_0 = 0;
	public static final int ERROR_CODE_1 = 1;
	// Invalid Authorization token error code
	public static final int ERROR_CODE_10 = 10;
	
	/* Global Variables */
	public static final String USER_SERVICE = "userService";
	public static final String SPACE_DELIMITER = " ";
	public static final String USER_NAME = "userName";
	public static final String USERS_LIST = "usersList";
	public static final String USER_ID = "user_id";
	public static final String AUTHTOKEN = "AUTHTOKEN";
	public static final String INVALID_AUTHTOKEN = "Invalid authtoken.";
	
	/* Pages */
	public static final String HOME_PAGE = "home";
	public static final String BANK_ACCOUNTS_PAGE = "bank-accounts";
}
