package com.csdepartment.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.csdepartment.entities.Comanda;

public interface ComandaRepository extends JpaRepository<Comanda,Integer> {
	
	public List<Comanda> findAll();
	public Comanda findByIdcomanda(int id);
	public Comanda findByIduser (int id);
	public void delete(Comanda comanda);
	public void deleteByIdcomanda(int id);
	public Comanda save(Comanda comanda);
	

}
