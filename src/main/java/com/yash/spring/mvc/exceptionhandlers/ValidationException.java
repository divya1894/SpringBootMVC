package com.yash.spring.mvc.exceptionhandlers;

public class ValidationException extends RuntimeException{

	private String message;
	
	public ValidationException(String message){
		super(message);
	}
	
	public String getMessage(){
		return message;		
	}
}
