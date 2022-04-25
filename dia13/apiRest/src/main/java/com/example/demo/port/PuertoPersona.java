package com.example.demo.port;

import java.util.*;

import com.example.demo.repository.PersonaRepository;

public abstract class PuertoPersona implements PersonaRepository{

	private AbstractMap<Integer, String> personas;
	
	public PuertoPersona() {
		personas = new HashMap<Integer, String>();
		
	}
	
	public boolean registrado(int id) {
		return personas.containsKey(id);
	}
	
	public void registrarPersona(int id, String nombre, String apellido, String email, int edad) {
		personas.put(id, nombre);
	}
	
}
