package com.accountant.app.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.accountant.app.beans.EmployeeVO;
import com.accountant.app.dao.EmployeeDAO;
import com.accountant.app.services.EmployeeService;

/**
 * 
 * -------------------------------
 * @author SANDEEP K NAIR
 * EMAIL : sandeepsuvit@gmail.com
 * WEBSITE : www.dotedlabs.com
 * -------------------------------
 * 
 * EmployeeServiceImpl.java | com.accountant.app.services.impl
 * 
 * Sep 5, 2014 | 10:53:27 AM | 2014
 *
 * Employee service implementation class
 */
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeDAO employeeDAO;
	
	public Boolean createNewEmployee(EmployeeVO employee) {
		return employeeDAO.createNewEmployee(employee);
	}

	public void updateEmployee(EmployeeVO employee) {
		
	}

	public EmployeeVO getEmployeeById(Integer employeeId) {
		return employeeDAO.getEmployeeById(employeeId);
	}

	public void deleteEmployee(Integer employeeId) {
		
	}

	public void deleteAllEmployee() {
		
	}

	public List<EmployeeVO> getListOfAllEmployees() {
		return employeeDAO.getListOfAllEmployees();
	}

}
