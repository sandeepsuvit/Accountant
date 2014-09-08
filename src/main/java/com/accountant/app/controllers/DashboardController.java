/**
 * 
 */
package com.accountant.app.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.accountant.app.beans.EmployeeListVO;
import com.accountant.app.beans.EmployeeVO;
import com.accountant.app.beans.StatusVO;
import com.accountant.app.services.EmployeeService;
import com.accountant.app.services.UserService;
import com.accountant.app.utlity.constants.AccountantConstants;

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
	private static final Logger log = Logger
			.getLogger(DashboardController.class);

	@Autowired
	private UserService userService;

	@Autowired
	private EmployeeService employeeService;

	/**
	 * Displays the summary page with the summary details
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String getDashboardPage(ModelMap model, HttpSession session) {
		log.info("ENTERING METHOD :: getSummary");
		EmployeeVO employee = employeeService.getEmployeeById(1);

		Map<String, Object> viewMap = new HashMap<String, Object>();

		viewMap.put(AccountantConstants.USER_NAME, employee.getEmpFname()
				+ AccountantConstants.SPACE_DELIMITER + employee.getEmpLname());

		// Set the session attributes
		session.setAttribute(AccountantConstants.USER_NAME,
				employee.getEmpFname() + AccountantConstants.SPACE_DELIMITER
						+ employee.getEmpLname());
		
		// Set the user id to the session
		session.setAttribute(AccountantConstants.USER_ID, employee.getUserIdFk());
		
		model.addAllAttributes(viewMap);
		log.info("EXITING METHOD :: getSummary");
		return AccountantConstants.HOME_PAGE;
	}
	
	
	/**
	 * Method to get the list of all employees in JSON/XML format
	 * 
	 * @return
	 */
	@RequestMapping(value = "/employeesList", method = RequestMethod.GET, produces = {"application/xml", "application/json" })
	@ResponseStatus(HttpStatus.OK)
	public @ResponseBody
	EmployeeListVO getListOfAllEmployees() {
		log.info("ENTERING METHOD :: getListOfAllEmployees");
		
		List<EmployeeVO> employeeVOs = employeeService.getListOfAllEmployees();
		EmployeeListVO employeeListVO = null;
		StatusVO statusVO = new StatusVO();
		
		if(employeeVOs.size()!=0){
			statusVO.setCode(AccountantConstants.ERROR_CODE_0);
			statusVO.setMessage(AccountantConstants.SUCCESS);
		}else{
			statusVO.setCode(AccountantConstants.ERROR_CODE_1);
			statusVO.setMessage(AccountantConstants.NO_RECORDS_FOUND);
		}
		
		employeeListVO = new EmployeeListVO(employeeVOs, statusVO);
		
		log.info("EXITING METHOD :: getListOfAllEmployees");
		return employeeListVO;
	}

}
