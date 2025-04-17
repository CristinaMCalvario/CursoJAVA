package com.mx.Herencia;

public class Hijo extends Padre {

	private String colorOjos;
	private String complexion;
	
	
	public Hijo() {
		
	}


	public Hijo(String nombre, String apellido, int edad, double altura, String nacionalidad, String colorOjos,
			String complexion) {
		super(nombre, apellido, edad, altura, nacionalidad);
		this.colorOjos = colorOjos;
		this.complexion = complexion;
	}


	public String getColorOjos() {
		return colorOjos;
	}


	public void setColorOjos(String colorOjos) {
		this.colorOjos = colorOjos;
	}


	public String getComplexion() {
		return complexion;
	}


	public void setComplexion(String complexion) {
		this.complexion = complexion;
	}


	@Override
	public String toString() {
		return "Hijo [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", altura=" + altura
				+ ", nacionalidad=" + nacionalidad + ", colorOjos=" + colorOjos + ", complexion=" + complexion + "]\n";
	}


	
	
	
	
	
	
}
