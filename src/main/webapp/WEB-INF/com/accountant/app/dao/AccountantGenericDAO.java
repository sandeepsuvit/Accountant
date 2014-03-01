package com.accountant.app.dao;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import com.accountant.app.controllers.HelloController;

/**
 * This is a generic DAO that provides extended support for
 * DAO operations from: 
 *  1. JDBC template class
 * 	2. Named JDBC template class
 * 
 * @author Sandeep
 *
 */
public class AccountantGenericDAO {
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	private static final Logger log = Logger.getLogger(HelloController.class);
	
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
		//this.dataSource = dataSource;
		log.info("ENTERING METHOD :: setDataSource");
		log.info("setDataSource : "+dataSource.getConnection());
		jdbcTemplate = new JdbcTemplate(dataSource);
		namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
		//this.setJdbcTemplate(new JdbcTemplate(dataSource));
		//this.setNamedParameterJdbcTemplate(new NamedParameterJdbcTemplate(dataSource));
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
		this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
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
		this.jdbcTemplate = jdbcTemplate;
	}
}	
