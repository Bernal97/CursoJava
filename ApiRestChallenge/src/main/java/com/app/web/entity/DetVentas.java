package com.app.web.entity;

import javax.persistence.*;

@Entity
public class DetVentas {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_detalle;
	
	@ManyToOne
	@JoinColumn(name = "nroFactura", nullable = false)
	private Ventas una_venta;
	
	@ManyToOne
	@JoinColumn(name = "producto", nullable = false)
	private Producto un_prod;
	
	@Column(name = "cantidad_producto")
	private Long cantidadProd;

	
	
	
	
	public DetVentas() {
		
	}
	
	
	public DetVentas(Ventas una_venta, Producto un_prod, Long cantidadProd) {
		super();
		this.una_venta = una_venta;
		this.un_prod = un_prod;
		this.cantidadProd = cantidadProd;
	}

	public Ventas getUna_venta() {
		return una_venta;
	}

	public void setUna_venta(Ventas una_venta) {
		this.una_venta = una_venta;
	}

	public Producto getUn_prod() {
		return un_prod;
	}

	public void setUn_prod(Producto un_prod) {
		this.un_prod = un_prod;
	}

	public Long getCantidadProd() {
		return cantidadProd;
	}

	public void setCantidadProd(Long cantidadProd) {
		this.cantidadProd = cantidadProd;
	}
	
	
	
	
	
}
