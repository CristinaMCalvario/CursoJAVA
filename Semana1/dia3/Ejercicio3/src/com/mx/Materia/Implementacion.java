package com.mx.Materia;

import java.util.HashMap;

public class Implementacion implements IMetodos {
	
	HashMap<String,Materia> hash = new HashMap<String,Materia>();
	

	@Override
	public void guardarM(Materia materia) {
		// TODO Auto-generated method stub
		
		hash.put(materia.getId(), materia);
	}

	@Override
	public void editarM(Materia materia) {
		// TODO Auto-generated method stub
		hash.replace(materia.getId(), materia);
	}

	@Override
	public void eliminarM(Materia materia) {
		// TODO Auto-generated method stub
		hash.remove(materia.getId());
	}

	@Override
	public void mostrarM() {
		// TODO Auto-generated method stub
		System.out.println(hash);
	}
	
	public void contarM() {
		System.out.println("El HashMap contiene: " + hash.size() + " materia");
	}
	
	
	
}
