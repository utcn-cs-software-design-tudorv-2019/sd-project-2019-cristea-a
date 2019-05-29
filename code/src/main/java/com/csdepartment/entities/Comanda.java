package com.csdepartment.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "comanda")
public class Comanda {
	
	
	public Comanda(int idcomanda, int iduser, int idpiesa,String livrat) {
		super();
		this.idcomanda = idcomanda;
		this.iduser = iduser;
		this.idpiesa = idpiesa;
		this.livrat=livrat;
	}

	public Comanda() {
		// TODO Auto-generated constructor stub
	}
	@Id
	@Column(name = "idcomanda", nullable = false)
	private int idcomanda;
	
	@Column(name = "iduser", nullable = false)
	private int iduser;
	
	@Column(name = "idpiesa", nullable = false)
	private int idpiesa;
	@Column(name = "livrat", nullable = false)
	private String livrat;

	public int getIdcomanda() {
		return idcomanda;
	}

	public void setIdcomanda(int idcomanda) {
		this.idcomanda = idcomanda;
	}

	public int getIduser() {
		return iduser;
	}

	public void setIduser(int iduser) {
		this.iduser = iduser;
	}

	public int getIdpiesa() {
		return idpiesa;
	}

	public void setIdpiesa(int idpiesa) {
		this.idpiesa = idpiesa;
	}

	public String getLivrat() {
		return livrat;
	}

	public void setLivrat(String livrat) {
		this.livrat = livrat;
	}
	

}
