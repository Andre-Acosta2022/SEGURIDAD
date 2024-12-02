package com.example.demo.Biblioteca.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Biblioteca.Entity.Rol;

public interface RolRepository extends JpaRepository<Rol, Long> {
	 Rol findByNombre(String nombre);
}
