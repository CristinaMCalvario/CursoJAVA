package com.mx.Empleado;

import java.util.HashMap;

public class Implementacion implements IMetodos {
	
	/*
	 * sintaxis del HashMap
	 * HashMap<Clave><Valor> hash = new HashMap<Clave><Valor>();
	 * 
	 * HashMap -> es una libreria de java.util
	 * KeyDataType -> clase contenedora del dato primitivo de la clave
	 * ValueDataType -> El nombre de la clase
	 * nombre -> asignado por el programador
	 * new -> palabra reservada
	 * */

	HashMap<Integer, Empleado> hash = new HashMap<Integer, Empleado>();
	
	
	@Override
	public void guardar(Empleado empleado) {
		// TODO Auto-generated method stub
		hash.put(empleado.getClave(), empleado);
	}

	@Override
	public Empleado buscar(Empleado empleado) {
		// TODO Auto-generated method stub
		
		return hash.get(empleado.getClave());
	}

	@Override
	public void editar(Empleado empleado) {
		// TODO Auto-generated method stub
		hash.replace(empleado.getClave(), empleado);
		
	}

	@Override
	public void eliminar(Empleado empleado) {
		// TODO Auto-generated method stub
		hash.remove(empleado.getClave());
		
	}

	@Override
	public void mostrar() {
		// TODO Auto-generated method stub
		System.out.println(hash);
	}
	//metodo personalizado
	public void contar() {
		System.out.println("El HashMap contiene: " + hash.size() + " empleados");
	}

	
	
}
