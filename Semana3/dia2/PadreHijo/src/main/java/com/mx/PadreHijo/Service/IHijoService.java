package com.mx.PadreHijo.Service;

import java.util.List;

import com.mx.PadreHijo.Dominio.*;



public interface IHijoService {
	public void guardar(Hijo hijo);
	public void editar(Hijo hijo);
	public void eliminar(Hijo hijo);
	public Hijo buscar(Hijo hijo);
	
	public List<Hijo> listar();
}
