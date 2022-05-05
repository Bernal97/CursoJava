package com.app.web.entity;

import java.io.Serializable;

import javax.persistence.*;


import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Getter
@Entity
@Table (name = "persona")
public class Persona implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long id;
	
	@Column(name = "nombre")
	public String nombre;
	@Column(name = "apellido")
	public String apellido;
	@Column(name="email")
	public String email;
	@Column(name = "dni")
	public Long dni;
	@Column(name = "telefono")
	public Long telefono;
	
	
	
	
	
	public Persona() {
		super();
	}
	public Persona(String nombre, String apellido, Long dNI, Long telefono) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dNI;
		this.telefono = telefono;
	}
	
	
	
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getDni() {
		return dni;
	}
	public void setDni(Long dni) {
		this.dni = dni;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Long getTelefono() {
		return telefono;
	}
	public void setTelefono(Long telefono) {
		this.telefono = telefono;
	}
	
	
}
