package com.example.saOrnitorrinco.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.saOrnitorrinco.model.Usuario;
import com.example.saOrnitorrinco.repository.UsuarioRepository;
import com.example.saOrnitorrinco.seg.JWTHelper;


@Service
public class UsuarioService {
	
	@Autowired
	private JWTHelper jwtHelper;
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public String efetuarLogin(Usuario usuario) {
		Usuario usuarioLogado = usuarioRepository.findByNome(usuario.getNome());
		
		if (usuarioLogado == null || !usuario.getSenha().equals(usuarioLogado.getSenha())) {
			throw new IllegalArgumentException("Usuário Inválido");
		}
		
		return jwtHelper.gerarToken(usuarioLogado);
	}

	public void salvarUsuario(Usuario usuario) {
		usuarioRepository.save(usuario);
	}
	
	public List<Usuario> buscarUsuarios() {
		return usuarioRepository.findAll();
	}
	
}