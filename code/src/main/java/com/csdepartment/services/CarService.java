package com.csdepartment.services;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.csdepartment.entities.Car;
import com.csdepartment.entities.User;
import com.csdepartment.repositories.CarRepository;


@Service()
public class CarService {
	
	@Inject
	CarRepository carRepository;

	public List<Car> getAllCar() {
		return carRepository.findAll();
	}

	public Car getByIdcar(int id) {
		return carRepository.findByIdcar(id);
	}

	public Car getByName(String name) {
		return carRepository.findByName(name);
	}

	

	public Car insert(Car exam) {
		return carRepository.save(exam);
	}

	public void delete(Car exam) {
		carRepository.delete(exam);
	}

	public void deleteByIdcar(int id) {
		carRepository.deleteByIdcar(id);

	}

	public void update(Car course) {
		Car foundExam = carRepository.findByIdcar(course.getIdcar());
		foundExam = course;
		carRepository.save(foundExam);
	}

}
