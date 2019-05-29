package com.csdepartment.validators;

import javax.inject.Inject;

import com.csdepartment.entities.Parts;
import com.csdepartment.services.PartService;



public class StudentValidator {
	
	@Inject
	PartService studentService;
	public StudentValidator() {
	}

	public String validateStudent(Parts st) {
		String message = "correct";
		
		
		return message;
		}
}