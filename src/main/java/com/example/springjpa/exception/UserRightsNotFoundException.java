package com.example.springjpa.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author nageswara.eluri
 *
 */
@ResponseStatus(value= HttpStatus.NOT_FOUND)
public class UserRightsNotFoundException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3122667787179043789L;
	private String userName;
	private String fieldName;
	private Object fieldValue;

	/**
	 * @param userName
	 * @param fieldName
	 * @param fieldValue
	 */
	public UserRightsNotFoundException(String userName, String fieldName, Object fieldValue) {
		super(String.format("%s not found with %s : '%s'", userName, fieldName, fieldValue));
		this.userName = userName;
		this.fieldName = fieldName;
		this.fieldValue = fieldValue;
	}

	/**
	 * @return userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @return fieldName
	 */
	public String getFieldName() {
		return fieldName;
	}

	/**
	 * @return fieldValue
	 */
	public Object getFieldValue() {
		return fieldValue;
	}
}
