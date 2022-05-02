package com.app.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.app.web.repository.UserRepository;

@EnableMongoRepositories(basePackageClasses = UserRepository.class)
@SpringBootApplication
public class CrudConMongoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudConMongoApplication.class, args);
	}

}
