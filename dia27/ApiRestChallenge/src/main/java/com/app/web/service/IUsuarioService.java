package com.app.web.service;

import java.util.List;
import java.util.Optional;

import com.app.web.entity.Usuario;

public interface IUsuarioService {

	public List<Usuario> listAll();
	
	public Usuario save(Usuario user);
	
	public Optional<Usuario> findById(Long id);
	
	public void delete(Long id);
}
