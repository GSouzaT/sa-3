package model;

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
	private int id;
	@OneToMany
	@JoinColumn(name = "produto", referencedColumnName = "id")
	private List<Produto> produtos;
	@ManyToOne
	@JoinColumn(name = "cliente", referencedColumnName = "id")
	private Cliente cliente;
	@ManyToOne
	@JoinColumn(name = "idMesa", referencedColumnName = "id")
	private Mesa mesa;
}
