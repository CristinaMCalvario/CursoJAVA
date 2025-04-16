package com.mx.Alumno;

import java.util.HashMap;

public class Implementacion implements IMetodos {

	HashMap<Integer, Alumno> hash = new HashMap<Integer,Alumno>();
	
	
	@Override
	public void guardar(Alumno alumno) {
		// TODO Auto-generated method stub
		hash.put(alumno.getId(), alumno);
	}

	@Override
	public Alumno buscar(Alumno alumno) {
		// TODO Auto-generated method stub
		return hash.get(alumno.getId());
	}

	@Override
	public void editar(Alumno alumno) {
		// TODO Auto-generated method stub
		hash.replace(alumno.getId(), alumno);
	}

	@Override
	public void eliminar(Alumno alumno) {
		// TODO Auto-generated method stub
		hash.remove(alumno.getId());
	}

	@Override
	public void mostrar() {
		// TODO Auto-generated method stub
		System.out.println(hash);
		
	}
	
	public void contar() {
		System.out.println("El HashMap contiene: " + hash.size() + " alumnos");
	}
	
}
