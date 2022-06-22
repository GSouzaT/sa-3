package com.example.saOrnitorrinco.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Comanda {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@OneToMany
	@JoinColumn(name = "bebida", referencedColumnName = "id")
	private List<Bebida> bebidas;
	@OneToMany
	@JoinColumn(name = "prato", referencedColumnName = "id")
	private List<Prato> pratos;
	@ManyToOne
	@JoinColumn(name = "cliente", referencedColumnName = "id")
	private Cliente cliente;
	@ManyToOne
	@JoinColumn(name = "idMesa", referencedColumnName = "id")
	private Mesa mesa;
		
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public List<Bebida> getBebidas() {
		return bebidas;
	}

	public void setBebidas(List<Bebida> bebidas) {
		this.bebidas = bebidas;
	}

	public List<Prato> getPratos() {
		return pratos;
	}

	public void setPratos(List<Prato> pratos) {
		this.pratos = pratos;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Mesa getMesa() {
		return mesa;
	}

	public void setMesa(Mesa mesa) {
		this.mesa = mesa;
	}

	public Comanda () {
		
	}
	
	public Comanda(List<Bebida> bebidas, List<Prato> pratos, Cliente cliente, Mesa mesa) {
		this.setBebidas(bebidas);
		this.setPratos(pratos);
		this.setCliente(cliente);
		this.setMesa(mesa);
	}
	
}
