package com.example.saOrnitorrinco.model;

import javax.persistence.Entity;

@Entity
public class Bebida extends Produto{

	private boolean temAlcool;
	private double teorAlcoolico;
	
	public boolean isTemAlcool() {
		return temAlcool;
	}

	public void setTemAlcool(boolean temAlcool) {
		this.temAlcool = temAlcool;
	}

	public double getTeorAlcoolico() {
		return teorAlcoolico;
	}

	public void setTeorAlcoolico(double teorAlcoolico) {
		this.teorAlcoolico = teorAlcoolico;
	}

	public Bebida () {
		
	}
	
	public Bebida(String nome, double preco, boolean temAlcool, double teorAlcoolico) {
		this.setNome(nome);
		this.setPreco(preco);
		this.temAlcool = temAlcool;
		this.teorAlcoolico = teorAlcoolico;
	}
	
}
