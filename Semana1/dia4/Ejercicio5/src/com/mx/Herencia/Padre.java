package com.mx.Herencia;

public class Padre {
	//atributos
	protected String nombre;
	protected String apellido;
	protected int edad;
	protected double altura;
	protected String nacionalidad;
	
	public Padre() {
		
		
	}

	public Padre(String nombre, String apellido, int edad, double altura, String nacionalidad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.altura = altura;
		this.nacionalidad = nacionalidad;
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

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	@Override
	public String toString() {
		return "Padre [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", altura=" + altura
				+ ", nacionalidad=" + nacionalidad + "]\n";
	}
	
	public void trabajar() {
		System.out.println("trabajo desde 8am a 4pm");
	}
	
	

}
