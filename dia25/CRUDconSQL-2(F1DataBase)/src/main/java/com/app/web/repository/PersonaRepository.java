package com.app.web.repository;

/*
import java.util.List;

import org.springframework.data.jpa.repository.Query;
*/
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.web.entity.Persona;

@Repository
public interface PersonaRepository extends CrudRepository<Persona, Long> {

	/*
	@Query("Select * From corredores Where victorias = 1")
	List<Persona> findByVictorias();
	*/
}
