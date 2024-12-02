package com.example.demo.Biblioteca.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Biblioteca.Entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

	  Usuario findByUsuario(String usuario);
}
