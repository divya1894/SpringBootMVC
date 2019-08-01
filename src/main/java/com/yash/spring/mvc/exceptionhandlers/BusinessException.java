package com.yash.spring.mvc.exceptionhandlers;

public class BusinessException extends RuntimeException {

	private String message;
	
	public BusinessException(String message) {
		super(message);
		this.message=message;
	}

	public String getMessage(){
		return this.message;
	}
}
