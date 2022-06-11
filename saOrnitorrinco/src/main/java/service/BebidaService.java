package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import model.Bebida;
import repository.BebidaRepository;


@Service
public class BebidaService {
	@Autowired
	private BebidaRepository bebidaRepository;
	
	public void cadastrarBebida(String nome, double preco, boolean temAlcool, double teorAlcoolico) {
		Bebida bebida = new Bebida(nome, preco, temAlcool, teorAlcoolico);
		bebidaRepository.save(bebida);
	}
	
	public void deletarBebida(Integer id) {
		
	}
	
	public List<Bebida> getBebida() {
		return bebidaRepository.findAll();
	}
	
	public Bebida getBebida(Integer id) {
		return bebidaRepository.findById(id).get();
	}
	
}
