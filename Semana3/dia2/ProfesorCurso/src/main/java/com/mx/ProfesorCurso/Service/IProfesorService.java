package com.mx.ProfesorCurso.Service;

import java.util.List;

import com.mx.ProfesorCurso.Dominio.Profesor;

public interface IProfesorService {
	
	public void guardar(Profesor profesor);
	
	public void editar(Profesor profesor);
	
	public void eliminar(Profesor profesor);
	
	public Profesor buscar(Profesor profesor);
	
	public List<Profesor> listar();
	
}
