package com.mx.ProfesorCurso.Service;

import java.util.List;

import com.mx.ProfesorCurso.Dominio.Curso;

public interface ICursoService {
	public void guardar(Curso curso);
	
	public void editar(Curso curso);
	
	public void eliminar(Curso curso);
	
	public Curso buscar(Curso curso);
	
	public List<Curso> listar();

}
