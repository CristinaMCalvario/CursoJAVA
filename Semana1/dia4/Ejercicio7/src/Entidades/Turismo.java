package Entidades;

public class Turismo extends Automovil{
	
	private int numAsientos;
	
	@Override
	public String mostrarDatos() {
		return "Turismo:\n "+ "marca: "+ this.marca + "\nSubmarca: " +this.subMarca+
				"\nModelo: " + this.modelo + "\nNUmero de Asientos" + this.numAsientos;
		
	}
	
	public Turismo() {
		
	}

	public Turismo(String marca, String subMarca, String modelo, int numAsientos) {
		super(marca, subMarca, modelo);
		this.numAsientos = numAsientos;
	}

	public int getNumAsientos() {
		return numAsientos;
	}

	public void setNumAsientos(int numAsientos) {
		this.numAsientos = numAsientos;
	}

	@Override
	public String toString() {
		return "Turismo [marca=" + marca + ", subMarca=" + subMarca + ", modelo=" + modelo + ", numAsientos="
				+ numAsientos + "]\n";
	}
	
	
	
	
	

}
