package com.accountant.app.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import com.accountant.app.beans.EmployeeVO;
import com.accountant.app.services.EmployeeService;

/**
 * 
 * -------------------------------
 * @author SANDEEP K NAIR
 * EMAIL : sandeepsuvit@gmail.com
 * WEBSITE : www.dotedlabs.com
 * -------------------------------
 * 
 * EmployeeDAO.java | com.accountant.app.dao
 * 
 * Sep 5, 2014 | 10:54:49 AM | 2014
 *
 * Interface class for the employee details
 */
@Repository("employeeDao")
public class EmployeeDAO extends AccountantGenericDAO implements
		EmployeeService {
	private static final Logger log = Logger.getLogger(EmployeeDAO.class);

	/**
	 * Method to create a new Employee
	 * 
	 * @param employee
	 * @return the boolean status weather the records has been inserted
	 */
	public Boolean createNewEmployee(EmployeeVO employee) {
		log.info("ENTERING METHOD :: createNewEmployee");

		String sql = "INSERT INTO employee_tb (" + "user_id_fk, "
				+ "emp_fname, " + "emp_mname" + "emp_lname" + "emp_dob"
				+ "emp_email" + "emp_created_on" + "emp_last_access"
				+ "emp_last_access_ip" + ") VALUES (" + ":userIdFk,"
				+ ":empFname," + ":empMname" + ":empLname" + ":empDob"
				+ ":empEmail" + ":empCreatedOn" + ":empLastAccess"
				+ ":empLastAccessIp" + ")";

		if (log.isDebugEnabled()) {
			log.debug("METHOD :: createNewEmployee :: SQL : " + sql);
		}

		try {

			this.getJdbcTemplate().update(
					sql,
					new Object[] { employee.getUserIdFk(),
							employee.getEmpFname(), employee.getEmpMname(),
							employee.getEmpLname(), employee.getEmpDob(),
							employee.getEmpEmail(), employee.getEmpCreatedOn(),
							employee.getEmpLastAccess(),
							employee.getEmpLastAccessIp() });

			log.info("EXITING METHOD :: createNewEmployee");

			return true;
		} catch (Exception exception) {
			log.error("METHOD :: Couldn't insert the record : " + exception);

			log.info("EXITING METHOD :: createNewEmployee");

			return false;
		}
	}

	/**
	 * Method to update the employee details
	 */
	public void updateEmployee(EmployeeVO employee) {
		log.info("ENTERING METHOD :: updateEmployee");
		log.info("EXITING METHOD :: updateEmployee");
	}

	/**
	 * Method to get the details of the employee
	 * 
	 * @param employeeId
	 * @return the Employee object
	 */
	public EmployeeVO getEmployeeById(Integer employeeId) {
		log.info("ENTERING METHOD :: getEmployeeById");

		String sql = "SELECT * FROM employee_tb where user_id_fk = :userIdFk";

		if (log.isDebugEnabled()) {
			log.debug("METHOD :: getEmployeeById :: SQL : " + sql);
		}

		SqlParameterSource parameterSource = new MapSqlParameterSource(
				"userIdFk", employeeId);

		log.info("EXITING METHOD :: getEmployeeById");

		return this.getNamedParameterJdbcTemplate().queryForObject(sql,
				parameterSource,
				new BeanPropertyRowMapper<EmployeeVO>(EmployeeVO.class));
	}

	/**
	 * Method to delete the employee
	 * 
	 * @param employeeId
	 */
	public void deleteEmployee(Integer employeeId) {
		log.info("ENTERING METHOD :: deleteEmployee");
		log.info("EXITING METHOD :: deleteEmployee");
	}

	/**
	 * Method to delete all employee
	 */
	public void deleteAllEmployee() {
		log.info("ENTERING METHOD :: deleteAllEmployee");
		log.info("EXITING METHOD :: deleteAllEmployee");
	}

	/**
	 * Method to get the details of all the employees
	 */
	public List<EmployeeVO> getListOfAllEmployees() {
		log.info("ENTERING METHOD :: getListOfAllEmployees");

		String sql = "SELECT * FROM employee_tb";

		if (log.isDebugEnabled()) {
			log.debug("METHOD :: getListOfAllEmployees :: SQL : " + sql);
		}

		log.info("EXITING METHOD :: getListOfAllEmployees");

		return this.getJdbcTemplate().query(sql,
				new BeanPropertyRowMapper<EmployeeVO>(EmployeeVO.class));
	}
}
