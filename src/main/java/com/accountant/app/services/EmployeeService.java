package com.accountant.app.services;

import java.util.List;

import com.accountant.app.beans.EmployeeVO;

/**
 * 
 * -------------------------------
 * @author SANDEEP K NAIR
 * EMAIL : sandeepsuvit@gmail.com
 * WEBSITE : www.dotedlabs.com
 * -------------------------------
 * 
 * EmployeeService.java | com.accountant.app.services
 * 
 * Sep 5, 2014 | 10:51:10 AM | 2014
 *
 * Interface layer for Employee service
 */
public interface EmployeeService {
	
	/**
	 * Create a new Employee
	 * 
	 * @param employee
	 * @return
	 */
	public Boolean createNewEmployee(EmployeeVO employee);
	
	/**
	 * Update an existing employee
	 * 
	 * @param employee
	 */
	public void updateEmployee(EmployeeVO employee);
	
	/**
	 * Get an employee detail
	 * 
	 * @param employeeId
	 * @return
	 */
	public EmployeeVO getEmployeeById(Integer employeeId);
	
	/**
	 * Delete an employee
	 * 
	 * @param employeeId
	 */
	public void deleteEmployee(Integer employeeId);
	
	/**
	 * Delete all employee
	 */
	public void deleteAllEmployee();
	
	/**
	 * Get list of all employees
	 * 
	 * @return
	 */
	public List<EmployeeVO> getListOfAllEmployees();
}
