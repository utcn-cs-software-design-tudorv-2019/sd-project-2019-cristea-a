package com.csdepartment.mvc.model;

import com.csdepartment.entities.Car;
import com.csdepartment.entities.Parts;

public class CarModel {
	
private  Car car;
	
	public CarModel() {
		this.car = new Car();
	}
	
	public CarModel(Car car)
	{
		this.car = car;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	
}
