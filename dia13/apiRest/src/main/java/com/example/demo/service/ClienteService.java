package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Cliente;

import com.example.demo.repository.ClienteRepository;


import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor //Crea implicitamente un constructor al compilar

public class ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;
	
	
	
	public void save (Cliente cliente) {
		clienteRepository.save(cliente);
	}
	
	
	public List<Cliente> findAll(){
		return clienteRepository.findAll();
	}
	
	
	//El optional es por si existe
	public Optional<Cliente> findById(String DNI) {
		return clienteRepository.findById(DNI);
	}
	
	public void deleteById(String DNI) {
		clienteRepository.deleteById(DNI);
	}
	
}
