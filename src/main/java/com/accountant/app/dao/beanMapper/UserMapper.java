package com.accountant.app.dao.beanMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;
import org.springframework.jdbc.core.RowMapper;

import com.accountant.app.beans.Users;

/**
 * 
 * -------------------------------
 * @author SANDEEP K NAIR
 * EMAIL : sandeepsuvit@gmail.com
 * WEBSITE : www.dotedlabs.com
 * -------------------------------
 *
 * UserMapper.java | com.accountant.app.dao.beanMapper
 *
 * Mar 1, 2014 | 3:22:18 PM | 2014
 * 
 * Mapper class for the Users class
 */
public class UserMapper implements RowMapper<Users> {
	private static final Logger log = Logger.getLogger(UserMapper.class);

	@Override
	public Users mapRow(ResultSet rs, int arg1) throws SQLException {
		log.info("ENTERING METHOD :: mapRow");
		Users users = new Users();
		users.setUserId(rs.getInt("userId"));
		users.setUserFname(rs.getString("userFname"));
		users.setUserLname(rs.getString("userLname"));
		users.setUserEmail(rs.getString("userEmail"));
		log.info("EXITING METHOD :: mapRow");
		return users;
	}

}
