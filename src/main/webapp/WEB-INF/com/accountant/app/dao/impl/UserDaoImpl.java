package com.accountant.app.dao.impl;

import org.apache.log4j.Logger;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import com.accountant.app.beans.Users;
import com.accountant.app.controllers.HelloController;
import com.accountant.app.dao.AccountantGenericDAO;
import com.accountant.app.dao.UserDAO;

/**
 * 
 * @author Sandeep
 *
 */
public class UserDaoImpl extends AccountantGenericDAO implements UserDAO{
	private static final Logger log = Logger.getLogger(HelloController.class);
	
	/**
	 * Inserting user details to the database
	 * @param users
	 */
	public void insertUserDetails(Users users){
		log.info("ENTERING METHOD :: insertUserDetails");
		String sql = "INSERT INTO users_tb (userFname, userLname, userEmail) VALUES ("
									+ ":userFname,"
									+ ":userLname,"
									+ ":userEmail"
									+ ")";
		if(log.isDebugEnabled()){
			log.debug("METHOD :: insertUserDetails :: SQL : "+sql);
		}

		SqlParameterSource parameterSource = new MapSqlParameterSource("userFname",users.getUserFname())
												.addValue("userLname", users.getUserLname())
												.addValue("userEmail", users.getUserEmail());
		this.getNamedParameterJdbcTemplate().update(sql, parameterSource);
		log.info("EXITING METHOD :: insertUserDetails");
	}
	
	
	/**
	 * Returns a user details
	 * @param userId
	 * @return
	 */
	public Users getUserDetailsById(int userId){
		log.info("ENTERING METHOD :: getUserDetailsById");
		String sql = "SELECT * FROM users_tb";
		if(log.isDebugEnabled()){
			log.debug("METHOD :: getUserDetailsById :: SQL : "+sql);
		}
		log.info("EXITING METHOD :: getUserDetailsById"+this.getJdbcTemplate());
		return this.getJdbcTemplate().queryForObject(sql, Users.class);
	}
}
