package com.example.demo.Biblioteca.Entity;


import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import lombok.Setter;
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name="usuario")
public class Usuario {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name="id_usuario")
	private Long id_usuario;
	
	@Column(name="usuario")
private String usuario;
	
	@Column(name="clave")
private String clave;


	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
	@JoinTable(
			name="usuario_rol",
			joinColumns = @JoinColumn(name="id_usuario", referencedColumnName = "id_usuario"),
			inverseJoinColumns = @JoinColumn(name="id_rol", referencedColumnName = "id_rol")
			)
	private Set<Rol> rol;
}
