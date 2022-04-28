package com.mvc.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mvc.model.User;
import com.mvc.repository.UserRepository;


@Service
public class UserService {

	private UserRepository userRepository;
	
	
	
	public void save (User persona) {
		userRepository.save(persona);
	}
	
	
	public List<User> findAll(){
		return (List<User>) userRepository.findAll();
	}
	
	
	//El optional es por si existe
	public User findById(int id) {
		return userRepository.findById(id);
	}
	
	public void deleteById(Long id) {
		userRepository.deleteById(id);
	}
}
