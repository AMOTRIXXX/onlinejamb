package com.onlinejamb.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "productos")
public class Producto {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id", length = 11)
	private int id;
	@Column(name = "nombre", length = 50)
	private String nombre;
	@Column(name = "descripcion", length = 250)
	private String descripcion;
	@Column(name = "precio")
	private double precio;
	@Column(name = "cantidad", length = 11)
	private int cantidad;
}
