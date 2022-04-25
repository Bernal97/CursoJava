package com.example.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Persona;

@Repository
public interface PersonaRepository extends MongoRepository<Persona, String>{

	
	boolean registrado (int id);
	void registrarPersona(int id, String nombre, String apellido, String email, int edad);
}
