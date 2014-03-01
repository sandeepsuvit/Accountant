/**
 * 
 */
package com.accountant.app.controllers;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.accountant.app.utlity.constants.CommonConstants;

/**
 * -------------------------------
 * @author SANDEEP K NAIR
 * EMAIL : sandeepsuvit@gmail.com
 * WEBSITE : www.dotedlabs.com
 * -------------------------------
 *
 * BankAccountsController.java | com.accountant.app.controllers
 *
 * Mar 1, 2014 | 6:48:02 PM | 2014
 * 
 */
@Controller
@RequestMapping("/bank-accounts")
public class BankAccountsController {
	private static final Logger log = Logger.getLogger(BankAccountsController.class);
	
	/**
	 * Displays the bank accounts page
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping("/")
	public String getAccounts(ModelMap model) {
		log.info("ENTERING METHOD :: getAccounts");
		
		
		log.info("EXITING METHOD :: getAccounts");
		return CommonConstants.BANK_ACCOUNTS_PAGE;
	}
}
