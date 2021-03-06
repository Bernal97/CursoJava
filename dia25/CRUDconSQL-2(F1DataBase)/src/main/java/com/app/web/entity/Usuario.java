package com.app.web.entity;

import javax.persistence.*;

@Entity
public class Usuario {

	@Id
	private Long id;
	
	@Column(unique = true)
	private String username;
	
	private String password;
	
	
	
	public Usuario(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	public Usuario() {
		
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
}
