package com.example.saOrnitorrinco.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.saOrnitorrinco.model.Comanda;
import com.example.saOrnitorrinco.model.Produto;
import com.example.saOrnitorrinco.repository.ComandaRepository;

@Service
public class ComandaService {
	@Autowired
	private ComandaRepository comandaRepository;
	
	public void cadastrarComanda() {
		Comanda comanda = new Comanda();
		comandaRepository.save(comanda);
	}
	
	public List<Comanda> getComanda() {
		return comandaRepository.findAll();
	}
	
	public Comanda getComanda(Integer id) {
		return comandaRepository.findById(id).get();
	}
	
	public void inserirProduto(Integer idComanda, List<Produto> produtos) {
		comandaRepository.findById(idComanda).get();
		
	}
	
}