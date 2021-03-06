package com.mvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;

@EnableAutoConfiguration
@OpenAPIDefinition
@EnableWebMvc
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class SpringMvc1Application {
	
	
	public static void main(String[] args) {
		SpringApplication.run(SpringMvc1Application.class, args);
	}

}
