package com.yash.spring.mvc.exceptionhandlers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalControllerExceptionHandler {

	@ExceptionHandler(BusinessException.class)
	public ResponseEntity<ErrorDetails> handleBusinessException(BusinessException exception){
		
		ErrorDetails details = new ErrorDetails();
		details.setMessage(exception.getMessage());
		details.setStatusCode(HttpStatus.BAD_REQUEST.value());
		ResponseEntity<ErrorDetails> response = new ResponseEntity<ErrorDetails>(details, HttpStatus.BAD_REQUEST);
		return response;
	}
	
	@ExceptionHandler(ValidationException.class)
	public ResponseEntity<ErrorDetails> handleValidationException(ValidationException exception){
		
		ErrorDetails details = new ErrorDetails();
		details.setMessage(exception.getMessage());
		details.setStatusCode(HttpStatus.BAD_REQUEST.value());
		ResponseEntity<ErrorDetails> response = new ResponseEntity<ErrorDetails>(details, HttpStatus.BAD_REQUEST);
		return response;
	}
}
