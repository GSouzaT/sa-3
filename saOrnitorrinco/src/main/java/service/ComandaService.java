package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.Comanda;
import model.Produto;
import repository.ComandaRepository;

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