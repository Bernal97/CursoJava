package com.mvc.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MazoModel {

	private List<CartaModel> mazo;
	private String name;
	
	

	public MazoModel(List<CartaModel> mazo, String name) {
		this.mazo = mazo;
		this.name = name;
	}
	
	public MazoModel(String name) {
		mazo = new ArrayList<CartaModel>();
		this.name = name;
	}
	public List<CartaModel> getMazo() {
		return mazo;
	}
	
	public boolean addCarta(CartaModel carta) {
		if(mazo.add(carta)) {
			return true;
		}else {
			return false;
		}
	}
	
	public int getSize() {
		return mazo.size();
	}
	
	public List<CartaModel> getMano(){
		List<CartaModel> aux = new ArrayList<CartaModel>();
		for(int x = 0; x < 5; x++) {
			aux.add(mazo.get((int)(Math.random()*(mazo.size()))));
		}
			
		return aux;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
