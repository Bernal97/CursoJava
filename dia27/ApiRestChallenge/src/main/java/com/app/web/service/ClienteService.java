package com.app.web.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.web.entity.Cliente;
import com.app.web.repository.ClienteRepository;

@Service
public class ClienteService implements IClienteService {

	@Autowired
	private ClienteRepository dbUtility;
	
	@Override
	public List<Cliente> listAll() {

		return dbUtility.findAll();
	}

	@Override
	public Cliente save(Cliente user) {
		return dbUtility.save(user);

	}

	@Override
	public Optional<Cliente> findById(Long id) {
		return dbUtility.findById(id);
	}

	@Override
	public void delete(Long id) {
		dbUtility.deleteById(id);

	}

}
