package com.csdepartment.services;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.csdepartment.entities.Comanda;
import com.csdepartment.repositories.ComandaRepository;

@Service()
public class ComandaService {
	
	@Inject
	ComandaRepository comandaRepository;
	
	public List<Comanda> getAllComanda(){
		
		return comandaRepository.findAll();
	}
	public Comanda getIdcomanda(int id) {
		
		return comandaRepository.findByIdcomanda(id);
		
	}
	public void delete(Comanda comanda) {
		
		comandaRepository.delete(comanda);
	}
	public Comanda findByIduser(int id) {
		
		return comandaRepository.findByIduser(id);
	}
	public void deleteByIdcomanda(int id) {
		
		comandaRepository.deleteByIdcomanda(id);
	}
	public Comanda insert(Comanda comanda) {
		
		return comandaRepository.save(comanda);
	}
	public void update(Comanda comanda) {
		
		Comanda cm=comandaRepository.findByIdcomanda(comanda.getIdcomanda());
		cm=comanda;
		comandaRepository.save(comanda);
		
	}
	

}
