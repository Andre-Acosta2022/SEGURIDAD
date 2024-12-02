package com.example.demo.Biblioteca.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Biblioteca.Entity.Rol;
import com.example.demo.Biblioteca.Service.RolService;

@RestController
@RequestMapping("/api/roles")
public class RolController {

	 @Autowired
	    private RolService rolService;

	    @PostMapping
	    public ResponseEntity<Rol> crearRol(@RequestBody Rol rol) {
	        Rol nuevoRol = rolService.crearRol(rol);
	        return ResponseEntity.ok(nuevoRol);
	    }

	    @GetMapping("/{id}")
	    public ResponseEntity<Rol> obtenerRol(@PathVariable Long id) {
	        Rol rol = rolService.obtenerRol(id);
	        return ResponseEntity.ok(rol);
	    }
}
