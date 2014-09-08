package com.accountant.app.beans;

import javax.xml.bind.annotation.XmlRootElement;


/**
 * 
 * -------------------------------
 * @author SANDEEP K NAIR
 * EMAIL : sandeepsuvit@gmail.com
 * WEBSITE : www.dotedlabs.com
 * -------------------------------
 * 
 * Employee.java | com.accountant.app.beans
 * 
 * Sep 5, 2014 | 10:50:33 AM | 2014
 *
 * This is a User bean class for mapping the current
 * employee details
 */

@XmlRootElement(name="employee")  
public class EmployeeVO {
	private Integer empId;
	private Integer userIdFk;
	private String empFname;
	private String empMname;
	private String empLname;
	private String empDob;
	private String empEmail;
	private String empCreatedOn;
	private String empLastAccess;
	private String empLastAccessIp;
	
	public EmployeeVO(){
		
	}
	
	/**
	 * @return the empId
	 */
	public Integer getEmpId() {
		return empId;
	}
	/**
	 * @param empId the empId to set
	 */
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	/**
	 * @return the userIdFk
	 */
	public Integer getUserIdFk() {
		return userIdFk;
	}
	/**
	 * @param userIdFk the userIdFk to set
	 */
	public void setUserIdFk(Integer userIdFk) {
		this.userIdFk = userIdFk;
	}
	/**
	 * @return the empFname
	 */
	public String getEmpFname() {
		return empFname;
	}
	/**
	 * @param empFname the empFname to set
	 */
	public void setEmpFname(String empFname) {
		this.empFname = empFname;
	}
	/**
	 * @return the empMname
	 */
	public String getEmpMname() {
		return empMname;
	}
	/**
	 * @param empMname the empMname to set
	 */
	public void setEmpMname(String empMname) {
		this.empMname = empMname;
	}
	/**
	 * @return the empLname
	 */
	public String getEmpLname() {
		return empLname;
	}
	/**
	 * @param empLname the empLname to set
	 */
	public void setEmpLname(String empLname) {
		this.empLname = empLname;
	}
	/**
	 * @return the empDob
	 */
	public String getEmpDob() {
		return empDob;
	}
	/**
	 * @param empDob the empDob to set
	 */
	public void setEmpDob(String empDob) {
		this.empDob = empDob;
	}
	/**
	 * @return the empEmail
	 */
	public String getEmpEmail() {
		return empEmail;
	}
	/**
	 * @param empEmail the empEmail to set
	 */
	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}
	/**
	 * @return the empCreatedOn
	 */
	public String getEmpCreatedOn() {
		return empCreatedOn;
	}
	/**
	 * @param empCreatedOn the empCreatedOn to set
	 */
	public void setEmpCreatedOn(String empCreatedOn) {
		this.empCreatedOn = empCreatedOn;
	}
	/**
	 * @return the empLastAccess
	 */
	public String getEmpLastAccess() {
		return empLastAccess;
	}
	/**
	 * @param empLastAccess the empLastAccess to set
	 */
	public void setEmpLastAccess(String empLastAccess) {
		this.empLastAccess = empLastAccess;
	}
	/**
	 * @return the empLastAccessIp
	 */
	public String getEmpLastAccessIp() {
		return empLastAccessIp;
	}
	/**
	 * @param empLastAccessIp the empLastAccessIp to set
	 */
	public void setEmpLastAccessIp(String empLastAccessIp) {
		this.empLastAccessIp = empLastAccessIp;
	}
	
	
}
