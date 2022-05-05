package com.app.web.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.web.entity.Persona;

@Repository
public interface PersonaRepository extends CrudRepository<Persona, Long> {

}
