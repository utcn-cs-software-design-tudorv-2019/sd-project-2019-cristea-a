package com.csdepartment.mvc.model;

import com.csdepartment.entities.Comanda;

public class ComandaModel {
	
	private Comanda comanda;
	
	public ComandaModel() {
		
		this.comanda=new Comanda();
	}

public ComandaModel(Comanda comanda) {
		
		this.comanda=comanda;
	}

public Comanda getComanda() {
	return comanda;
}

public void setComanda(Comanda comanda) {
	this.comanda = comanda;
}


}
