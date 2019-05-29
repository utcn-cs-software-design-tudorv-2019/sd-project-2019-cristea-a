package com.csdepartment.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.csdepartment.entities.User;



public interface UserRepository extends JpaRepository<User, Integer> {
	
	public List<User> findAll();

	public User findByIduser(int id);

	public User findByName(String name);

	public User findByUsername(String username);

	public void delete(User teacher);

	public void deleteByIduser(int id);

	public User save(User user);

}