package com.app.web.security.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.web.security.enums.RolNombre;
import com.app.web.security.modelo.Rol;

@Repository
public interface RolRepository extends JpaRepository<Rol, Long>{

	Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
