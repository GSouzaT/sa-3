package com.example.saOrnitorrinco.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.saOrnitorrinco.model.Bebida;
import com.example.saOrnitorrinco.model.Prato;

@RestController
@RequestMapping(path = "/produto")
public class ProdutoController {
	
	@Autowired
	private com.example.saOrnitorrinco.service.PratoService pratoService;

	@Autowired
	private com.example.saOrnitorrinco.service.BebidaService bebidaService;
	
	@GetMapping(path = "/prato")
	public ResponseEntity<List<Prato>> getPrato() {
		return new ResponseEntity<>(pratoService.getPrato(), HttpStatus.OK);
	}
	
	@GetMapping(path = "/bebida")
	public ResponseEntity<List<Bebida>> getBebida() {
		return new ResponseEntity<>(bebidaService.getBebida(), HttpStatus.OK);
	}
	
}
