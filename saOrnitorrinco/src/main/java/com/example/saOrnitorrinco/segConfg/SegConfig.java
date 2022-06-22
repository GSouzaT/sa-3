package com.example.saOrnitorrinco.segConfg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.example.saOrnitorrinco.seg.AutenticacaoFilter;


@EnableWebSecurity
public class SegConfig{
	
	@Autowired
	private AutenticacaoFilter autenticacaoFilter; 

	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		http.csrf().disable().authorizeRequests()
		.anyRequest().permitAll();
	
	http.addFilterBefore(autenticacaoFilter, UsernamePasswordAuthenticationFilter.class);
	
		return http.build();
	}
}
