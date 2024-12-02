package com.example.demo.Biblioteca.Service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Biblioteca.Entity.Rol;
import com.example.demo.Biblioteca.Repository.RolRepository;
@Service
public class RolService   {
	  @Autowired
	    private RolRepository rolRepository;

	    public Rol crearRol(Rol rol) {
	        return rolRepository.save(rol);
	    }

	    public Rol obtenerRol(Long id) {
	        return rolRepository.findById(id).orElse(null);
	    }
}
