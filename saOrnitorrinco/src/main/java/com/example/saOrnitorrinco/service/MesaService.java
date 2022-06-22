package com.example.saOrnitorrinco.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.saOrnitorrinco.model.Mesa;
import com.example.saOrnitorrinco.repository.MesaRepository;

@Service
public class MesaService {
	@Autowired
	private MesaRepository mesaRepository;
	
	public void cadastrarMesa() {
		Mesa mesa = new Mesa();
		mesaRepository.save(mesa);
	}
	
	public void deletarMesa(Integer id) {
		
	}

}
