package service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import model.Usuario;
import repository.UsuarioRepository;
import seg.JWTHelper;


@Service
public class UsuarioService {
	
	@Autowired
	private JWTHelper jwtHelper;
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public String efetuarLogin(Usuario usuario) {
		Usuario usuarioLogado = usuarioRepository.findByNome(usuario.getNome());
		
		if (usuarioLogado == null || 
			!new BCryptPasswordEncoder()
				.matches(usuario.getSenha(), usuarioLogado.getSenha())) {
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