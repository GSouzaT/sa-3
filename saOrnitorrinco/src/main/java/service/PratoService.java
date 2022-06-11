package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.Prato;
import repository.PratoRepository;

@Service
public class PratoService {
	@Autowired
	private PratoRepository pratoRepository;
	
	public void cadastrarPrato(String nome, double preco, String descricao) {
		Prato prato = new Prato(nome, preco, descricao);
		pratoRepository.save(prato);
	}
	
	public void deletarPrato(Integer id) {
		
	}
	
	public List<Prato> getPrato() {
		return pratoRepository.findAll();
	}
	
	public Prato getPrato(Integer id) {
		return pratoRepository.findById(id).get();
	}
	
}
