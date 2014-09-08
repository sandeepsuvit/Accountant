/**
 * 
 */
package com.accountant.app.beans;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * -------------------------------
 * @author SANDEEP K NAIR
 * EMAIL : sandeepsuvit@gmail.com
 * WEBSITE : www.dotedlabs.com
 * -------------------------------
 * 
 * StatusVO.java | com.accountant.app.beans
 * 
 * Sep 8, 2014 | 2:22:50 PM | 2014
 *
 */
@XmlRootElement(name = "statusVO")
public class StatusVO {
	private Integer code;
	private String message;

	/**
	 * @return the code
	 */
	public Integer getCode() {
		return code;
	}

	/**
	 * @param code
	 *            the code to set
	 */
	public void setCode(Integer code) {
		this.code = code;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message
	 *            the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

}
