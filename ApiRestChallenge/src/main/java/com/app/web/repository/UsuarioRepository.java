package com.app.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.web.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

}
