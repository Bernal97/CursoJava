package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Persona;
import com.example.demo.repository.PersonaRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor //Crea implicitamente un constructor al compilar
public class PersonaService {
	@Autowired
	private PersonaRepository personaRepository;
	
	
	
	public void save (Persona persona) {
		personaRepository.save(persona);
	}
	
	
	public List<Persona> findAll(){
		return personaRepository.findAll();
	}
	
	
	//El optional es por si existe
	public Optional<Persona> findById(String id) {
		return personaRepository.findById(id);
	}
	
	public void deleteById(String id) {
		personaRepository.deleteById(id);
	}
}
