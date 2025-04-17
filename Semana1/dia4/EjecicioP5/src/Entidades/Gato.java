package Entidades;

import Principal.Cuidados;

public class Gato extends Mascota implements Cuidados{
	
	

	@Override
	public String hacerSonido() {
		// TODO Auto-generated method stub
		return "Miau";
	}
	
	

	public Gato() {
		
	}

	

	public Gato(String nombre, int edad, String raza, String comidaFavorita) {
		super(nombre, edad, raza, comidaFavorita);
	}



	@Override
	public void vacunar() {
		// TODO Auto-generated method stub
		System.out.println("VACUNADO");
	}


	
	
	
	
	
}
