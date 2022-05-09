package com.app.web.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
/*import org.springframework.security.crypto.password.PasswordEncoder;*/
import org.springframework.stereotype.Service;

import com.app.web.entity.Usuario;
import com.app.web.repository.UsuarioRepository;


@Service
public class UsuarioServiceImpl implements IUsuarioService {

	
	@Autowired
	private UsuarioRepository dbUtility;
	
	/*
	@Autowired
	private PasswordEncoder cifrado;
	*/
	@Override
	public List<Usuario> listAll() {
		return dbUtility.findAll();
	}

	@Override
	public void save(Usuario usuario) {
	/*	String passwordHashed = cifrado.encode(usuario.getPassword());
		usuario.setPassword(passwordHashed); */
		dbUtility.save(usuario);
		
	}

	
	
	@Override
	public Optional<Usuario> findById(Long id) {

		return dbUtility.findById(id);
	}

	@Override
	public void delete(Long id) {
		dbUtility.deleteById(id);

	}
/*
	@Override
	public boolean Auth(Usuario username) {
		Optional<Usuario> usuario = dbUtility.findByUsername(username.getUsername());
		
		if(usuario.isEmpty()) {
			return false;
		}
		
		boolean resultado = cifrado.matches(username.getPassword(), usuario.get().getPassword());
		
		return resultado;
	}
*/
	
	
	
}
