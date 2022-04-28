package com.mvc.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mvc.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{

	User findById(int id);
	
	
}
