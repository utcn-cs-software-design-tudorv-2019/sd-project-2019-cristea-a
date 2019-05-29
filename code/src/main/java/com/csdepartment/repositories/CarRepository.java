package com.csdepartment.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.csdepartment.entities.Car;
import com.csdepartment.entities.User;



public interface CarRepository extends JpaRepository<Car, Integer>{
	
	public List<Car> findAll();

	public Car findByIdcar(int id);

	public Car findByName(String name);

	

	

	public void delete(Car car);

	public void deleteByIdcar(int id);

}
