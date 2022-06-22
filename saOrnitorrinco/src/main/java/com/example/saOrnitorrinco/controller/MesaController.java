package com.example.saOrnitorrinco.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.saOrnitorrinco.repository.MesaRepository;

@RestController
@RequestMapping("/mesas")
public class MesaController {
	@Autowired
	private MesaRepository mesaRepository;
	
	
}
