package model;

import javax.persistence.Entity;

@Entity
public class Prato extends Produto{

	private String descricao;

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public Prato() {
		
	}
	
	public Prato(String nome, double preco, String descricao) {
		this.setNome(nome);
		this.setPreco(preco);
		this.descricao = descricao;
	}
	
}
