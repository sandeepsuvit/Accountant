package com.accountant.app.dao;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

/**
 * 
 * -------------------------------
 * @author SANDEEP K NAIR
 * EMAIL : sandeepsuvit@gmail.com
 * WEBSITE : www.dotedlabs.com
 * -------------------------------
 *
 * AccountantGenericDAO.java | com.accountant.app.dao
 *
 * Mar 1, 2014 | 3:14:37 PM | 2014
 * 
 * This is a generic DAO that provides extended support for
 * DAO operations from: 
 *  1. JDBC template class
 * 	2. Named JDBC template class
 */
public class AccountantGenericDAO {
	private static DataSource dataSource;
	private static JdbcTemplate jdbcTemplate;
	private static NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	private static final Logger log = Logger.getLogger(AccountantGenericDAO.class);
	
	/**
	 * @return the dataSource
	 */
	public DataSource getDataSource() {
		return dataSource;
	}

	/**
	 * @param dataSource the dataSource to set
	 * @throws SQLException 
	 */
	@Autowired
	public void setDataSource(DataSource dataSource) throws SQLException {
		log.info("ENTERING METHOD :: setDataSource");
		if(log.isDebugEnabled()){
			log.debug("METHOD :: setDataSource  :: "+dataSource.getConnection());
		}
		AccountantGenericDAO.jdbcTemplate = new JdbcTemplate(dataSource);
		AccountantGenericDAO.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
	}

	/**
	 * @return the namedParameterJdbcTemplate
	 */
	public NamedParameterJdbcTemplate getNamedParameterJdbcTemplate() {
		return namedParameterJdbcTemplate;
	}

	/**
	 * @param namedParameterJdbcTemplate the namedParameterJdbcTemplate to set
	 */
	public void setNamedParameterJdbcTemplate(NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
		AccountantGenericDAO.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
	}

	/**
	 * @return the jdbcTemplate
	 */
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	/**
	 * @param jdbcTemplate the jdbcTemplate to set
	 */
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		AccountantGenericDAO.jdbcTemplate = jdbcTemplate;
	}
}	
