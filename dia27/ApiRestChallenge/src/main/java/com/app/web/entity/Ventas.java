package com.app.web.entity;

import javax.persistence.*;

@Entity
public class Ventas {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_venta;
	
	@ManyToOne
	@JoinColumn(name = "cliente", nullable = false)
	private Cliente un_client;

	public Cliente getUn_client() {
		return un_client;
	}

	public void setUn_client(Cliente un_client) {
		this.un_client = un_client;
	}

	public Ventas(Cliente un_client) {
		super();
		this.un_client = un_client;
	}
	
	
}
