package com.onlinejamb.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "usuarios")
public class Usuario implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id", length = 11)
	private int id;
	@NotBlank(message = "El campo usuario no puede estar vacio.")
	@Size(min=4, max=50, message = "El nombre de usuario no puede contener menos de 3 caracteres ni mas de 50.")
	@Column(name = "nombre", length = 50)
	private String nombre;
	@Column(name = "email", length = 200)
	private String email;
	//@NotBlank(message = "El campo contraseña no puede estar vacio")
	//@Size(min=4, message = "La contraseña no puede contener menos de 4 caracteres ni mas de 50.")
	@Column(name = "password", length = 250)
	private String password;
	@Column(name = "nombreUsuario", length = 250)
	private String nombreUsuario;
	@Column(name = "apellido", length = 250)
	private String apellido;
	@Column(name = "direccion", length = 250)
	private String direccion;
	@Column(name = "provincia", length = 250)
	private String provincia;
	@Column(name = "localidad", length = 250)
	private String localidad;
	@Column(name = "pais", length = 250)
	private String pais;
	@Column(name = "telefono", length = 250)
	private String telefono;
	@Column(name = "rol")
	@Enumerated(EnumType.STRING)
	private Roles rol;
	
	public Usuario(String nombre) {
		this.nombre = nombre;
	}
	public Usuario(String nombre, String password) {
		this.nombre = nombre;
		this.password = password;
	}
	public Usuario(String nombre, String email, String password) {
		this.nombre = nombre;
		this.email = email;
		this.password = password;
	}
	
	public Usuario(String nombre, String email, String password, String nombreUsuario, String apellido, String direccion, String provincia, String localidad, String pais, String telefono, Roles rol) {
		this.nombre = nombre;
		this.email = email;
		this.password = password;
		this.nombreUsuario = nombreUsuario;
		this.apellido = apellido;
		this.direccion = direccion;
		this.provincia = provincia;
		this.localidad = localidad;
		this.pais = pais;
		this.telefono = telefono;
		this.rol = rol;
	}
	
	public Usuario(int id, String nombreUsuario, String apellido, String telefono, String direccion, String pais, String provincia, String localidad) {
		this.id = id;
		this.nombreUsuario = nombreUsuario;
		this.apellido = apellido;
		this.telefono = telefono;
		this.direccion = direccion;
		this.pais = pais;
		this.provincia = provincia;
		this.localidad = localidad;
	}
}
