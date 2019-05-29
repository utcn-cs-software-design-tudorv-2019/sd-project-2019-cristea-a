package com.csdepartment.validators;

import javax.inject.Inject;

import com.csdepartment.entities.User;
import com.csdepartment.services.UserService;



public class TeacherValidator {
	
	
	@Inject
	UserService teacherService;
	
	public TeacherValidator() {
		
	}
	
	public String validateTeacher(User tc) {
		String message = "correct";

		if (tc.getName().equals(""))
			return message = "Wrong name field format";

		return message;
	}

}