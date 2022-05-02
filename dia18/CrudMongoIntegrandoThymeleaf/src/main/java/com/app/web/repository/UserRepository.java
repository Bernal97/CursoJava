package com.app.web.repository;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.app.web.model.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

	List<User> findByWin(boolean win);
	List<User> findByFirstName(String firstName);
	
}
