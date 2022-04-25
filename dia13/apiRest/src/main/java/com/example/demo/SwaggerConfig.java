package com.example.demo;

import java.util.Collections;

import org.springframework.context.annotation.Bean;


import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;


public class SwaggerConfig {

	@Bean
	public Docket apiDocket() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("PersonaController"))
				.paths(PathSelectors.any())
				.build()
				.apiInfo(getApiInfo());
	}
	private ApiInfo getApiInfo() {
		return new ApiInfo(
				"Order Service API",
				"Order Service API Description",
				"1.0",
				"http://ejemplo.com/terms",
				new Contact("Ejemplo", "https://ejemplo.com", "apis@ejemplo.com"),
				"LICENSE",
				"LICENSE URL",
				Collections.emptyList()
				);
	}
	
	
}
