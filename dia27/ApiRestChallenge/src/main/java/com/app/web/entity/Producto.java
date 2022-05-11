package com.app.web.entity;

import javax.persistence.*;



@Entity
@Table(name = "producto")
public class Producto {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_producto;
	
	
	@Column(name = "codigo_prod")
	private Long codigo_prod;
	
	@Column(name = "nombre_prod")
	private String nombre_prod;
	
	@Column(name = "stock_prod")
	private Long stock_prod;
	
	
	
	
	public Producto() {
		
	}
	

	public Producto(Long codigo_prod, String nombre_prod, Long stock_prod) {
		super();
		this.codigo_prod = codigo_prod;
		this.nombre_prod = nombre_prod;
		this.stock_prod = stock_prod;
	}

	public Long getCodigo_prod() {
		return codigo_prod;
	}

	public void setCodigo_prod(Long codigo_prod) {
		this.codigo_prod = codigo_prod;
	}

	public String getNombre_prod() {
		return nombre_prod;
	}

	public void setNombre_prod(String nombre_prod) {
		this.nombre_prod = nombre_prod;
	}

	public Long getStock_prod() {
		return stock_prod;
	}

	public void setStock_prod(Long stock_prod) {
		this.stock_prod = stock_prod;
	}
	
	
	
}
