package com.accountant.app.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import com.accountant.app.beans.Users;
import com.accountant.app.dao.beanMapper.UserMapper;

/**
 * 
 * -------------------------------
 * @author SANDEEP K NAIR
 * EMAIL : sandeepsuvit@gmail.com
 * WEBSITE : www.dotedlabs.com
 * -------------------------------
 *
 * UserDAO.java | com.accountant.app.dao
 *
 * Mar 1, 2014 | 3:21:33 PM | 2014
 * 
 * Interface class for the user detials
 */
@Repository("userDao")
public class UserDAO extends AccountantGenericDAO{
	
private static final Logger log = Logger.getLogger(UserDAO.class);
	
	/**
	 * Inserting user details to the database
	 * @param users
	 */
	public void insertUserDetails(Users users){
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
	}
	
	
	/**
	 * Returns a user details
	 * @param userId
	 * @return
	 */
	public Users getUserDetailsById(int userId){
		String sql = "SELECT * FROM users_tb WHERE userId = :userId";
		if(log.isDebugEnabled()){
			log.debug("METHOD :: getUserDetailsById :: SQL : "+sql);
		}
		SqlParameterSource parameterSource = new MapSqlParameterSource("userId",userId);
		return this.getNamedParameterJdbcTemplate().queryForObject(sql, parameterSource, new UserMapper());
	}
	
	
	/**
	 * Gets the list of all the users in the user table
	 * @return
	 */
	public List<Users> getAllUserDetails(){
		String sql = "SELECT * FROM users_tb";
		if(log.isDebugEnabled()){
			log.debug("METHOD :: getAllUserDetails :: SQL : "+sql);
		}
		return this.getJdbcTemplate().query(sql, new UserMapper());
	}
}
