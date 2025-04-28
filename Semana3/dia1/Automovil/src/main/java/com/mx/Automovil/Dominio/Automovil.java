package com.mx.Automovil.Dominio;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity //indica que mi clase sera una unidad en una base de datos
@Table(name = "AUTOMOVIL")
public class Automovil {
	@Id//mapear con la busqueda del id en la tabla
	@Column(name="ID_AUTOMOVIL",columnDefinition = "NUMBER")
	private int idAutomovil;
	
	@Column(name = "MARCA", columnDefinition="NVARCHAR2(100)")
	private String marca;
	
	@Column(name = "SUBMARCA", columnDefinition="NVARCHAR2(100)")
	private String submarca;
	
	@Column(name = "MODELO", columnDefinition="NUMBER")
	private int modelo;
	
	@Column(name = "COLOR", columnDefinition="NVARCHAR2(100)")
	private String color;
	
	@Column(name = "PRECIO", columnDefinition="NUMBER")
	private int precio;
	
	public Automovil() {
		
	}

	public Automovil(int idAutomovil, String marca, String submarca, int modelo, String color, int precio) {
		super();
		this.idAutomovil = idAutomovil;
		this.marca = marca;
		this.submarca = submarca;
		this.modelo = modelo;
		this.color = color;
		this.precio = precio;
	}

	public int getIdAutomovil() {
		return idAutomovil;
	}

	public void setIdAutomovil(int idAutomovil) {
		this.idAutomovil = idAutomovil;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getSubmarca() {
		return submarca;
	}

	public void setSubmarca(String submarca) {
		this.submarca = submarca;
	}

	public int getModelo() {
		return modelo;
	}

	public void setModelo(int modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Automovil [idAutomovil=" + idAutomovil + ", marca=" + marca + ", submarca=" + submarca + ", modelo="
				+ modelo + ", color=" + color + ", precio=" + precio + "]\n";
	}
	
	
	
	
	
}
