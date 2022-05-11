package com.app.web.service;

import java.util.List;
import java.util.Optional;

import com.app.web.entity.Cliente;

public interface IClienteService {
	public List<Cliente> listAll();
	
	public Cliente save(Cliente user);
	
	public Optional<Cliente> findById(Long id);
	
	public void delete(Long id);
}
