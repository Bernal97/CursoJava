package com.app.web.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.web.entity.Usuario;
import com.app.web.repository.UsuarioRepository;

@Service
public class UsuarioService implements IUsuarioService {

	@Autowired
	private UsuarioRepository dbUtility;
	
	@Override
	public List<Usuario> listAll() {

		return dbUtility.findAll();
	}

	@Override
	public Usuario save(Usuario user) {
		return dbUtility.save(user);

	}

	@Override
	public Optional<Usuario> findById(Long id) {
		// TODO Auto-generated method stub
		return dbUtility.findById(id);
	}

	@Override
	public void delete(Long id) {
		dbUtility.deleteById(id);

	}

}
