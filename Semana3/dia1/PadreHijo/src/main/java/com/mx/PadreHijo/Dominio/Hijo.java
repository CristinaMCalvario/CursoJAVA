package com.mx.PadreHijo.Dominio;

import org.hibernate.annotations.ManyToAny;

import com.mx.PadreHijo.Dominio.Padre;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table
public class Hijo {
	
	@Id
	@Column
	private Integer idHijo;
	
	@Column
	private String nombre;
	
	@Column
	private String apellido;
	
	@Column
	
	private int edad;
	
	@Column
	private String hobbie;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "PADRE_ID")
	private Padre padreId;
	
	public Hijo() {
		
	}
	

	public Hijo(Integer idHijo, String nombre, String apellido, int edad, String hobbie, Padre padreId) {
		super();
		this.idHijo = idHijo;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.hobbie = hobbie;
		this.padreId = padreId;
	}


	public Integer getIdHijo() {
		return idHijo;
	}

	public void setIdHijo(Integer idHijo) {
		this.idHijo = idHijo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getHobbie() {
		return hobbie;
	}

	public void setHobbie(String hobbie) {
		this.hobbie = hobbie;
	}

	public Padre getPadreId() {
		return padreId;
	}

	public void setPadreId(Padre padreId) {
		this.padreId = padreId;
	}
	
}
