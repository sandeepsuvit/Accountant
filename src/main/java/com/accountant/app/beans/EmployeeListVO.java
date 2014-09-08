/**
 * 
 */
package com.accountant.app.beans;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * -------------------------------
 * @author SANDEEP K NAIR
 * EMAIL : sandeepsuvit@gmail.com
 * WEBSITE : www.dotedlabs.com
 * -------------------------------
 * 
 * EmployeeListVO.java | com.accountant.app.beans
 * 
 * Sep 8, 2014 | 2:25:00 PM | 2014
 *
 */
@XmlRootElement(name = "employees")
public class EmployeeListVO {
	private List<EmployeeVO> employees;
	private StatusVO statusVO;

	// Added for JAXB control
	protected EmployeeListVO() {
	}

	public EmployeeListVO(List<EmployeeVO> employees, StatusVO statusVO) {
		this.employees = employees;
		this.statusVO = statusVO;
	}

	/**
	 * @return the employees
	 */
	@XmlElement(name = "employee")
	public List<EmployeeVO> getEmployees() {
		return employees;
	}

	/**
	 * @param employees
	 *            the employees to set
	 */
	public void setEmployees(List<EmployeeVO> employees) {
		this.employees = employees;
	}

	/**
	 * @return the statusVO
	 */
	@XmlElement(name = "statusVO")
	public StatusVO getStatusVO() {
		return statusVO;
	}

	/**
	 * @param statusVO
	 *            the statusVO to set
	 */
	public void setStatusVO(StatusVO statusVO) {
		this.statusVO = statusVO;
	}
}
