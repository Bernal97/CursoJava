package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Cliente;
import com.example.demo.model.Persona;
import com.example.demo.service.ClienteService;
import com.example.demo.service.PersonaService;

import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;

@SuppressWarnings("unused")
@RestController
@RequestMapping("/api/v1")

@RequiredArgsConstructor
public class ClienteController {

	
	@Autowired
	private  ClienteService clienteService;
	
	@PostMapping("/clientes")
	public void save(@RequestBody Cliente cliente) {
		clienteService.save(new Cliente (cliente.getDNI(), cliente.getNombre(), cliente.getApellido(), cliente.getEmail(), cliente.getTelefono()));
	}
	
	
	@GetMapping("/clientes")
	public List<Cliente> findAll(){
		return clienteService.findAll();
	}
	
	@GetMapping("/clientes/{id}")
	public Cliente findById(@PathVariable String id) {
		return clienteService.findById(id).get();
	}
	
	
	@DeleteMapping("/clientes/{id}")
	public void deleteById(@PathVariable String id) {
		clienteService.deleteById(id);
	}
	
	@PutMapping("/clientes")
	public void update(@RequestBody Cliente cliente) {
		clienteService.save(cliente);
	}
}
