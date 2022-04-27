package com.mvc.model;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class CartaModel {


	private int id;
	private String name;
	private String clase;
	
	protected CartaModel() {
		
	}

	public CartaModel(int id, String name, String clase) {
		this.id = id;
		this.name = name;
		this.clase = clase;
	}
	
}
