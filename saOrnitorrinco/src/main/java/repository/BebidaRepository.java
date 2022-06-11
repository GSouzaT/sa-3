package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Bebida;

public interface BebidaRepository extends JpaRepository<Bebida, Integer>{
	
	
}
