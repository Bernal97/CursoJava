package com.app.web;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/*
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
*/
@Configuration
public class SpringSecurityConfig /*extends WebSecurityConfigurerAdapter */{
/*
	@Bean
	public PasswordEncoder cifradoPassword () {	
		return new BCryptPasswordEncoder();
	}
	
	@Override
    protected void configure(final AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().	
        withUser("admin").
        password(cifradoPassword().encode("adminPass")).roles("ADMIN");
    }

	
	
    @Override
    protected void configure(final HttpSecurity http) throws Exception {
    	http
        .csrf().disable()
        .authorizeRequests()
        .antMatchers("/admin/**").hasRole("ADMIN");
        
    }
	

	*/
}
