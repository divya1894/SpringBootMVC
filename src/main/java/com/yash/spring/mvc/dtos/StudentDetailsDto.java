package com.yash.spring.mvc.dtos;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class StudentDetailsDto {
	
	@NotNull(message="FistName should not be null")
	@Size(max=10,min=5,message="FirstName should have more than 5 and less than 10 alphabets")
	private String firstName;
	@NotNull(message="LastName should not be null")
	@Size(max=10,min=4,message="LastName should have more than 4 and less than 10 alphabets")
	private String lastName;
	@NotNull(message="StudentId should not be null")
	private Integer studentId;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Integer getStudentId() {
		return studentId;
	}
	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}	
	
	@Override
	public String toString() {
		return "StudentDetailsDto [firstName=" + firstName + ", lastName=" + lastName + ", studentId=" + studentId
				+ "]";
	}
}
