package com.mx.Herencia;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hijo hijo1 = new Hijo("Ale", "Garfias", 23, 1.50, "Francesa", "Azul", "delgada");
		
		System.out.println(hijo1);
		
		hijo1.setNombre("Jacq");
		hijo1.setEdad(25);
		
		System.out.println(hijo1);
		
		hijo1.trabajar();

	}

}
