package com.mx.Materia;

public class Materia {

	private String id;
	private double calificacion;
	
	public Materia() {
		
	}

	public Materia(String id, double calificacion) {
		super();
		this.id = id;
		this.calificacion = calificacion;
	}

	public Materia(String id) {
		// TODO Auto-generated constructor stub
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(double calificacion) {
		this.calificacion = calificacion;
	}

	@Override
	public String toString() {
		return "Materia [id=" + id + ", calificacion=" + calificacion + "]\n";
	}
	
	
	
}
