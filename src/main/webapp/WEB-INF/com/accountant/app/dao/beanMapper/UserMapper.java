package com.accountant.app.dao.beanMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.accountant.app.beans.Users;

public class UserMapper implements RowMapper<Users> {

	@Override
	public Users mapRow(ResultSet rs, int arg1) throws SQLException {
		Users users = new Users();
		users.setUserId(rs.getInt("userId"));
		users.setUserFname(rs.getString("userFname"));
		users.setUserLname(rs.getString("userLname"));
		users.setUserEmail(rs.getString("userEmail"));
		return users;
	}

}
