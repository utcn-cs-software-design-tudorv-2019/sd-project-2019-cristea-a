package com.csdepartment.services;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.csdepartment.entities.Parts;
import com.csdepartment.repositories.PartRepository;

@Service()
public class PartService {
	@Inject
	PartRepository partRepository;

	public List<Parts> getAllParts() {
		return partRepository.findAll();
	}

	public Parts getStudentById(int id) {
		return partRepository.findByPartid(id);
	}

	public Parts getStudentByName(String name) {
		return partRepository.findByName(name);
	}

	public Parts insert(Parts student) {
		return partRepository.save(student);
	}

	public void update(Parts oneStudent) {
		Parts foundStudent = partRepository.findByPartid(oneStudent.getPartid());
		foundStudent = oneStudent;
		partRepository.save(foundStudent);
	}
}
