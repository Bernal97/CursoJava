package com.app.web.security.util;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;


import com.app.web.security.enums.RolNombre;
import com.app.web.security.modelo.Rol;
import com.app.web.security.service.RolService;

public class CreateRol implements CommandLineRunner {


    @Autowired
    RolService rolService;

    @Override
    public void run(String... args) throws Exception {
        Rol rolAdmin = new Rol(RolNombre.ROLE_ADMIN);
        Rol rolUser = new Rol(RolNombre.ROLE_USER);
        rolService.save(rolAdmin);
        rolService.save(rolUser);
    }
}
