package com.example.demo;

import com.example.demo.repository.PersonaRepository;

public class Persona {

	private PersonaRepository personaRepository;
	
	public Persona(PersonaRepository repository) {
		this.personaRepository = repository;
	}
	
	public boolean registrarNuevaPersona(int id, String nombre, String apellido, String email, int edad) {
		boolean resultado = false;
		if (!personaRepository.registrado(id)) {
			personaRepository.registrarPersona(id, nombre, apellido, email, edad);
			resultado = true;
		}
		return resultado;
	}
}
