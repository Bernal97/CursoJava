package com.app.web.service;

import java.util.List;
import java.util.Optional;

import com.app.web.entity.Usuario;

public interface IUsuarioService {

	public List<Usuario> listAll();
	
	public void save(Usuario usuario);
	
	public Optional<Usuario> findById(Long id);
	
	public void delete(Long id);
	/*
	public boolean Auth(Usuario username);
	*/
}
