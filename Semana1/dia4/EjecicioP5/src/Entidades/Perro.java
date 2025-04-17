package Entidades;

import Principal.Cuidados;

public class Perro extends Mascota implements Cuidados{
	
	

	@Override
	public String hacerSonido() {
		// TODO Auto-generated method stub
		return "Guau guau";
	}
	
	
	public Perro() {
		
	}


	public Perro(String nombre, int edad, String raza, String comidaFavorita) {
		super(nombre, edad, raza, comidaFavorita);
	}





	@Override
	public void vacunar() {
		System.out.println("VACUNADO");
	}

	

	
	
	
	
	

}
