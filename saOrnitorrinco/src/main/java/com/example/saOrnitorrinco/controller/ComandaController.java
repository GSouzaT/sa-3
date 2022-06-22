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

import com.example.saOrnitorrinco.model.Comanda;
import com.example.saOrnitorrinco.model.Produto;
import com.example.saOrnitorrinco.service.ComandaService;

@RestController
@RequestMapping(path = "/comandas")
public class ComandaController {
	
	@Autowired
	private ComandaService comandaService;
	
	@GetMapping
	public ResponseEntity<List<Comanda>> getComanda() {
		return new ResponseEntity<>(comandaService.getComanda(), HttpStatus.OK);
	}
	
	@GetMapping(path = "/{id}")
	public ResponseEntity<Comanda> getComanda(@PathVariable Integer id) {
		return new ResponseEntity<>(comandaService.getComanda(id), HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Void> cadastrarComanda(@RequestBody Comanda comanda) {
		try {
			comandaService.cadastrarComanda();
			return new ResponseEntity<>(HttpStatus.CREATED);
		} catch (IllegalArgumentException e) {
			return new ResponseEntity<>(HttpStatus.UNPROCESSABLE_ENTITY);
		}
	}
	
	@PutMapping(path = "/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Void> inserirProduto(@RequestBody List<Produto> produtos, @PathVariable Integer id) {
		try {
			comandaService.inserirProduto(id, produtos);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (IllegalArgumentException e) {
			return new ResponseEntity<>(HttpStatus.UNPROCESSABLE_ENTITY);
		}
	}
	
}
