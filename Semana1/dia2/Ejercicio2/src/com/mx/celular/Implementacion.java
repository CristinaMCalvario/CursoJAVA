package com.mx.celular;

import java.util.List;
import java.util.ArrayList;

public class Implementacion implements IMetodos {
// esta clase es la implementacion de mi interface y ocupamos la palabra reservada implemnt
	
	//declarar lista
	
	List<Celular> lista = new ArrayList<Celular>();
	
	
	
	@Override
	public void guardar(Celular celular) {
		lista.add(celular);
	}

	@Override
	public void editar(int indice, Celular celular) {
		// TODO Auto-generated method stub
		lista.set(indice, celular);
	}

	@Override
	public void mostrar() {
		// TODO Auto-generated method stub
		System.out.println(lista);
	}

	@Override
	public void eliminar(int indice) {
		// TODO Auto-generated method stub
		lista.remove(indice);
	}

	@Override
	public Celular buscar(int indice) {
		// TODO Auto-generated method stub
		return lista.get(indice);
	}
	
	public void contar() {
		int cont = lista.size();
		System.out.println("La lista contiene:  " + cont + " celulares ");
	}
	

}
