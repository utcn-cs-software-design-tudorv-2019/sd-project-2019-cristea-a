package com.csdepartment.mvc.model;

import com.csdepartment.entities.User;

public class UserModel {
	
	private User user;

	public UserModel() {
		this.user = new User();
	}
		
	public UserModel(User teacher) {
		this.user = teacher;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	
	

}