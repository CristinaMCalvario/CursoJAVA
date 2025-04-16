package com.mx.Figura;

import com.mx.celular.Celular;

public interface IMetodos {

	public void guardar(Figura figura);
	public void editar(int indice, Figura figura);
	public void mostrar();
	public void eliminar(int indice);
	public Figura buscar(int indice);
	
}
