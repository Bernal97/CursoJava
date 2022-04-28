package com.mvc.model;

import java.util.ArrayList;
import java.util.List;

public class Coleccion {

	private List<User> coleccion;
	
	
	public Coleccion() {
		this.coleccion = new ArrayList<User>();
	}
	
	public List<User> getUser(){
		return coleccion;
	}
	
	public boolean addPerson(User carta) {
		if(coleccion.add(carta)) {
			return true;
		}else {
			return false;
		}
	}
}
