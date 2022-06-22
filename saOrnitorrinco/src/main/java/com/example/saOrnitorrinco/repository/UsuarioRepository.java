package com.example.saOrnitorrinco.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.saOrnitorrinco.model.Usuario;


public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{

	Usuario findByNome(String nome);
}
