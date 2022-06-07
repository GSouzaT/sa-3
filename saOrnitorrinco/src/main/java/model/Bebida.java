package model;

import javax.persistence.Entity;

@Entity
public class Bebida extends Produto{

	private boolean temAlcool;
	private double teorAlcoolico;
	
}
