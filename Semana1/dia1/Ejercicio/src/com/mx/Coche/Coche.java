package com.mx.Coche;

public class Coche {
	//Declaracion de atributos
	private String marca;
	private String subMarca;
	private int modelo;
	private String color;
	private double precio;
	
	//constructor por defecto
	public Coche() {
		
	}
	
	//Constructor paramatrizado : inicializar el objeto con valores especificos(atributos)
	public Coche(String marca, String subMarca, int modelo, String color, double precio) {
		this.marca = marca;
		this.subMarca = subMarca;
		this.modelo = modelo;
		this.color = color;
		this.precio = precio;
	}
	
	//metodos GET Y SET
	//GET regresa el valo del atributo
	//SET moodifica el valor del atributocon las validaciones
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getSubMarca() {
		return subMarca;
	}
	
	public void setSubMarca(String subMarca) {
		this.subMarca = subMarca;
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
	
	public double getPrecio() {
		return precio;
	}
	
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	// metodo toString declaracion en las funciones, sirve para cualquier objeto en cadena
	//se utiliza para 
	
	public String toString() {
		return "Coche[" + 
					"marca = " + marca + 
					" subMarca = " + subMarca + 
					" modelo = " + modelo + 
					" color = " + color + 
					" precio = " + precio + "]\n";
	
	}
	
	
	
}//clase
