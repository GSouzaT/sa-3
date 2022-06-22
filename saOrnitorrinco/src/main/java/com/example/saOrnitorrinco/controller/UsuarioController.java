package com.example.saOrnitorrinco.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.saOrnitorrinco.model.Usuario;
import com.example.saOrnitorrinco.service.UsuarioService;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioService;
	
	@PostMapping("/login")
	public ResponseEntity<String> efetuarLogin(@RequestBody Usuario usuario) {
		return new ResponseEntity<>(usuarioService.efetuarLogin(usuario), HttpStatus.OK);
	}

	@PostMapping
	public ResponseEntity<Void> salvarUsuario(@RequestBody Usuario usuario) {
		usuarioService.salvarUsuario(usuario);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	
	@GetMapping
	public ResponseEntity<List<Usuario>> buscarUsuarios() {
		return new ResponseEntity<>(usuarioService.buscarUsuarios(), HttpStatus.OK);
	}
	
}
