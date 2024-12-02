package com.example.demo.Biblioteca.Dao;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class UsuarioDao {
	  private String usuario;
	    private String clave;
	    private List<Long> roles;
}
