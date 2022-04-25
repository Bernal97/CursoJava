package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document(value = "Ventas/Productos")
@Data
public class Producto {

	@Id
	private String codigo;
	private String nombreProducto;
	private int cantidad;
	private double precio;
	
	
	public Producto(String codigo, String nombreProducto, int cantidad, double precio) {
		super();
		this.codigo = codigo;
		this.nombreProducto = nombreProducto;
		this.cantidad = cantidad;
		this.precio = precio;
	}
	
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNombreProducto() {
		return nombreProducto;
	}
	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
}
