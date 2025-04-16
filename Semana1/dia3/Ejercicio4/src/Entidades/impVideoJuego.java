package Entidades;

import Implementacion.ImplementacionGenerica;

public class impVideoJuego extends ImplementacionGenerica {
	public void contar() {
		System.out.println("Estan registrados: " + hash.size() + " videojuegos");
		
	}
}
