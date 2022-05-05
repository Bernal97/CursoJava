package com.app.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.web.entity.Persona;
import com.app.web.repository.PersonaRepository;

@Service
public class PersonaServiceImpl implements IPersonaService{

	@Autowired
	private PersonaRepository dbUtility;
	
	@Override
	public List<Persona> listAll() {
		return (List<Persona>) dbUtility.findAll();
	}

	@Override
	public void save(Persona usuario) {
		dbUtility.save(usuario);
		
	}

	@Override
	public Persona findById(Long id) {
		return dbUtility.findById(id).orElse(null);
	}

	@Override
	public void delete(Long id) {
		dbUtility.deleteById(id);
		
	}

}
