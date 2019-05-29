package com.csdepartment.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.csdepartment.entities.Parts;


public interface PartRepository  extends CrudRepository<Parts, Integer> {
	
	public List<Parts> findAll();

	public Parts findByPartid(int id);

	public Parts findByName(String name);

	

	

	public void delete(Parts part);

	public void deleteByPartid(int id);

}