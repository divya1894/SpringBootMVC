package com.yash.spring.mvc.controllers;

import javax.validation.Valid;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.yash.spring.mvc.StudentRegistration;
import com.yash.spring.mvc.dtos.StudentDetailsDto;
import com.yash.spring.mvc.exceptionhandlers.ValidationException;

@RestController
@RequestMapping("/student")
public class StudentController {

	@GetMapping("/details/{id}")
	public StudentDetailsDto getStudentDetailsById(@PathVariable("id") Integer id) {

		StudentDetailsDto studentDetailsDto = new StudentDetailsDto();
		studentDetailsDto.setFirstName("Divya");
		studentDetailsDto.setLastName("Jain");	
		studentDetailsDto.setStudentId(1);
		if (id == 1)
			return studentDetailsDto;
		else
			return null;
	}

	@GetMapping("/details")
	public StudentDetailsDto getStudentDetailsByIdAsRequestParam(@RequestParam("id") Integer id) {

		StudentDetailsDto studentDetailsDto = new StudentDetailsDto();
		studentDetailsDto.setFirstName("Divya");
		studentDetailsDto.setLastName("Jain");
		studentDetailsDto.setStudentId(1);
		if (id == 1)
			return studentDetailsDto;
		else
			return null;
	}

	@PostMapping("/create")
	public void createStudent(@RequestBody @Valid StudentDetailsDto dto, BindingResult result) {

		if (result.hasErrors()) {
			System.out.println("Error present");
			throw new ValidationException(result.getFieldError().getDefaultMessage());
			// throw new BusinessException("exception");
		}
		System.out.println(dto);
	}

	@PutMapping(value = "/update/{id}")
	@ResponseBody
	public String updateStudentRecord(@RequestBody StudentDetailsDto stdn, @PathVariable Integer id) {
		System.out.println("In updateStudentRecord");
		return StudentRegistration.getInstance().upDateStudent(stdn);
	}

	@DeleteMapping(value = "/delete/{id}")
	@ResponseBody
	public String deleteStudentRecord(@PathVariable("id") Integer id) {
		System.out.println("In deleteStudentRecord");
		return StudentRegistration.getInstance().deleteStudent(id);
	}

	/*
	 * @ExceptionHandler(Exception.class) public void exceptionHandler(){
	 * 
	 * }
	 */
}
