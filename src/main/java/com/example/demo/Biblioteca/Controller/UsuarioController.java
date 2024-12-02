package com.example.demo.Biblioteca.Controller;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Biblioteca.Dao.UsuarioDao;
import com.example.demo.Biblioteca.Entity.Rol;
import com.example.demo.Biblioteca.Entity.Usuario;
import com.example.demo.Biblioteca.Repository.RolRepository;
import com.example.demo.Biblioteca.Service.UsuarioService;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {
	
	  @Autowired
	    private UsuarioService usuarioService;

	    @PostMapping
	    public ResponseEntity<Usuario> crearUsuario(@RequestBody Usuario usuario) {
	        Usuario nuevoUsuario = usuarioService.crearUsuario(usuario);
	        return ResponseEntity.ok(nuevoUsuario);
	    }

	    @GetMapping
	    public ResponseEntity<Iterable<Usuario>> obtenerTodosUsuarios() {
	        Iterable<Usuario> usuarios = usuarioService.obtenerTodosUsuarios();
	        return ResponseEntity.ok(usuarios);
	    }
    }
