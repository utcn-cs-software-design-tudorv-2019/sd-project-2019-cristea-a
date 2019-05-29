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
@Table(name = "part")

public class Parts {
	
	public Parts( String name, int pret, String producator) {
		super();
		
		this.name = name;
		this.pret = pret;
		this.producator=producator;
		
	}




	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idpart", nullable = false)
	private int partid;

	@Column(name = "name", nullable = false)
	private String name;

	@Column(name = "pret", nullable = false)
	private int pret;
	@Column(name = "producator", nullable = false)
	private String producator;
	

	
public Parts() {}
	




	public int getPartid() {
		return partid;
	}




	public void setPartid(int partid) {
		this.partid = partid;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public int getPret() {
		return pret;
	}




	public void setPret(int pret) {
		this.pret = pret;
	}





	public String getProducator() {
		return producator;
	}





	public void setProducator(String producator) {
		this.producator = producator;
	}




	
	

	

	

}

