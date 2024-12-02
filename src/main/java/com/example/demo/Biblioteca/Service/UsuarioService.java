package com.example.demo.Biblioteca.Service;

import java.util.List;
import java.util.stream.Collectors;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Biblioteca.Entity.Usuario;
import com.example.demo.Biblioteca.Repository.RolRepository;
import com.example.demo.Biblioteca.Repository.UsuarioRepository;

import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
@Service
public class UsuarioService  {
	 @Autowired
	    private UsuarioRepository usuarioRepository;

	    @Autowired
	    private BCryptPasswordEncoder passwordEncoder;

	    public Usuario crearUsuario(Usuario usuario) {
	        usuario.setClave(passwordEncoder.encode(usuario.getClave()));
	        return usuarioRepository.save(usuario);
	    }

	    public Iterable<Usuario> obtenerTodosUsuarios() {
	        return usuarioRepository.findAll();
	    }
}
