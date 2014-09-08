package com.accountant.app.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import com.accountant.app.beans.Users;
import com.accountant.app.services.UserService;

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
 * Interface class for the user details
 */
@Repository("userDao")
public class UserDAO extends AccountantGenericDAO implements UserService{
	
	private static final Logger log = Logger.getLogger(UserDAO.class);

	/**
	 * Method to create a new user detail
	 * 
	 * @param users
	 * @return the boolean status weather the records has been inserted
	 */
	public Boolean createNewUser(Users users) {
		log.info("ENTERING METHOD :: createNewUser");
		String sql = "INSERT INTO users_tb (user_acc_id, user_password, user_status) VALUES ("
				+ ":userAcId," + ":userPassword," + ":userStatus" + ")";

		if (log.isDebugEnabled()) {
			log.debug("METHOD :: createNewUser :: SQL : " + sql);
		}

		try {

			this.getJdbcTemplate().update(
					sql,
					new Object[] { users.getUserAccId(),
							users.getUserPassword(), users.getUserStatus() });

			log.info("EXITING METHOD :: createNewUser");

			return true;
		} catch (Exception exception) {
			log.error("METHOD :: Couldn't insert the record : " + exception);
			log.info("EXITING METHOD :: createNewUser");
			return false;
		}
	}

	/**
	 * Method to return a user detail
	 * 
	 * @param userId
	 * @return the Users object
	 */
	public Users getUserDetailsById(int userId) {
		log.info("ENTERING METHOD :: getUserDetailsById");

		String sql = "SELECT user_acc_id, user_status FROM users_tb WHERE u_id = :uId";

		if (log.isDebugEnabled()) {
			log.debug("METHOD :: getUserDetailsById :: SQL : " + sql);
		}

		SqlParameterSource parameterSource = new MapSqlParameterSource("uId",
				userId);

		log.info("EXITING METHOD :: getUserDetailsById");
		return this.getNamedParameterJdbcTemplate().queryForObject(sql,
				parameterSource, new BeanPropertyRowMapper<Users>(Users.class));
	}

	/**
	 * Method to return the list of all users
	 * 
	 * @return the list id Users
	 */
	public List<Users> getListOfAllUser() {
		log.info("ENTERING METHOD :: getAllUserDetails");

		String sql = "SELECT * FROM users_tb";

		if (log.isDebugEnabled()) {
			log.debug("METHOD :: getAllUserDetails :: SQL : " + sql);
		}

		log.info("EXITING METHOD :: getAllUserDetails");

		return this.getJdbcTemplate().query(sql,
				new BeanPropertyRowMapper<Users>(Users.class));
	}
}
