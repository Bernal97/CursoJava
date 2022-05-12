package com.app.web.security.service;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.core.userdetails.*;
import org.springframework.stereotype.Service;

import com.app.web.security.modelo.Usuario;
import com.app.web.security.modelo.UsuarioMain;

@Service
public class UserDetailsServiceImpl implements UserDetailsService{

	 	@Autowired
	    UsuarioService usuarioService;

	    public UserDetails loadUserByUsername(String nombreUsuario) throws UsernameNotFoundException {
	        Usuario usuario = usuarioService.getByUsuario(nombreUsuario).get();
	        return UsuarioMain.build(usuario);
	    }

		
}
