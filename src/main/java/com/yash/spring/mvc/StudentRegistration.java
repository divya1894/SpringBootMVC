package com.yash.spring.mvc;

import java.util.ArrayList;
import java.util.List;

import com.yash.spring.mvc.dtos.StudentDetailsDto;

public class StudentRegistration {
	private List<StudentDetailsDto> studentRecords;
	private static StudentRegistration stdregd = null;

	private StudentRegistration() {
		studentRecords = new ArrayList<StudentDetailsDto>();
	}

	public static StudentRegistration getInstance() {
		if (stdregd == null) {
			stdregd = new StudentRegistration();
			return stdregd;
		} else {
			return stdregd;
		}
	}

	public void add(StudentDetailsDto std) {
		studentRecords.add(std);
	}

	public String upDateStudent(StudentDetailsDto std) {
		for (int i = 0; i < studentRecords.size(); i++) {
			StudentDetailsDto stdn = studentRecords.get(i);
			if (stdn.getStudentId().equals(std.getStudentId())) {
				studentRecords.set(i, std);// update the new record
				std.setFirstName(stdn.getFirstName());
				std.setLastName(stdn.getLastName());
				return "Update successful";
			}
		}
		return "Update un-successful";
	}

	public String deleteStudent(Integer registrationNumber) {
		for (int i = 0; i < studentRecords.size(); i++) {
			StudentDetailsDto stdn = studentRecords.get(i);
			if (stdn.getStudentId().equals(registrationNumber)) {
				studentRecords.remove(i);// update the new record
				return "Delete successful";
			}
		}
		return "Delete un-successful";
	}

	public List<StudentDetailsDto> getStudentRecords() {
		return studentRecords;
	}
}
