package com.mx.ProfesorCurso.Dominio;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table
public class Curso {

	@Id
	@Column
	private Integer idCurso;
	
	@Column
	private String nombre;
	
	@Column 
	private String nivel;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "PROFESOR_ID")
	private Profesor profesorId;
	
	
	public Curso() {
		
	}


	public Curso(Integer idCurso, String nombre, String nivel, Profesor profesorId) {
		super();
		this.idCurso = idCurso;
		this.nombre = nombre;
		this.nivel = nivel;
		this.profesorId = profesorId;
	}


	public Integer getIdCurso() {
		return idCurso;
	}


	public void setIdCurso(Integer idCurso) {
		this.idCurso = idCurso;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getNivel() {
		return nivel;
	}


	public void setNivel(String nivel) {
		this.nivel = nivel;
	}


	public Profesor getProfesorId() {
		return profesorId;
	}


	public void setProfesorId(Profesor profesorId) {
		this.profesorId = profesorId;
	}


	@Override
	public String toString() {
		return "Curso [idCurso=" + idCurso + ", nombre=" + nombre + ", nivel=" + nivel + ", profesorId=" + profesorId
				+ "]";
	}
	
	
	
	
	
	
	
	
	
	
}
