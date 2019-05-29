package com.csdepartment.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name = "car")

public class Car {
	
	public Car( String name,int an,String model) {
		super();
		this.an=an;
		this.name = name;
		
		this.model=model;
	}



	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idcar", nullable = false)
	private int idcar;

	@Column(name = "name", nullable = false)
	private String name;
	@Column(name = "an", nullable = false)
	private int an;
	@Column(name = "model", nullable = false)
	private String model;

	

	

	public Car() {
	}



	public int getIdcar() {
		return idcar;
	}



	public void setIdcar(int idcar) {
		this.idcar = idcar;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getAn() {
		return an;
	}



	public void setAn(int an) {
		this.an = an;
	}



	public String getModel() {
		return model;
	}



	public void setModel(String model) {
		this.model = model;
	}



	

	
	





}
