package com.csdepartment.services;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.csdepartment.entities.User;
import com.csdepartment.repositories.UserRepository;



@Service()
public class UserService {
	
	@Inject
	UserRepository userRepository;

	public List<User> getAllUser() {

		return userRepository.findAll();
	}

	public User getByIduser(int id) {
		return userRepository.findByIduser(id);
	}

	public User getByName(String name) {
		return userRepository.findByName(name);
	}

	public User getByUsername(String username) {
		return userRepository.findByUsername(username);
	}

	public void delete(User teacher) {
		userRepository.delete(teacher);
	}

	public void deleteByIduser(int id) {
		userRepository.deleteByIduser(id);
	}

	public User insert(User teacher) {
		return userRepository.save(teacher);
	}

	public void update(User teacher) {
		User foundTeacher = userRepository.findByIduser(teacher.getIduser());
		foundTeacher = teacher;
		userRepository.save(teacher);
	}

}
