package com.mx.ProfesorCurso.Dominio;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="PROFESOR")
public class Profesor {
	@Id
	@Column
	private Integer idProfesor;
	
	@Column
	private String nombre;
	
	@Column
	private String especialidad;
	
	@Column
	private Integer antiguedad;
	
	@OneToMany(mappedBy = "profesorId", cascade = CascadeType.ALL)
	List<Curso> list = new ArrayList<>();
	
	public Profesor() {
		
	}

	public Profesor(Integer idProfesor, String nombre, String especialidad, Integer antiguedad) {
		super();
		this.idProfesor = idProfesor;
		this.nombre = nombre;
		this.especialidad = especialidad;
		this.antiguedad = antiguedad;
	}
	
	

	public Integer getIdProfesor() {
		return idProfesor;
	}

	public void setIdProfesor(Integer idProfesor) {
		this.idProfesor = idProfesor;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public Integer getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(Integer antiguedad) {
		this.antiguedad = antiguedad;
	}

	@Override
	public String toString() {
		return "Profesor [idProfesor=" + idProfesor + ", nombre=" + nombre + ", especialidad=" + especialidad
				+ ", antiguedad=" + antiguedad + "]";
	}
	
	
	
	
	
}
