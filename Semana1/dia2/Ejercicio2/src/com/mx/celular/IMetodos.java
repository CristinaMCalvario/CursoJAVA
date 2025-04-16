package com.mx.celular;

public interface IMetodos {
	public void guardar(Celular celular);
	public void editar(int indice, Celular celular);
	public void mostrar();
	public void eliminar(int indice);
	public Celular buscar(int indice);
	
	
	

}
