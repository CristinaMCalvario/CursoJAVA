package com.mx.Alumno;

public interface IMetodos {
	
	public void guardar(Alumno alumno);
	
	public Alumno buscar(Alumno alumno);
	
	public void editar(Alumno alumno);
	
	public void eliminar(Alumno alumno);
	
	public void mostrar();
}
