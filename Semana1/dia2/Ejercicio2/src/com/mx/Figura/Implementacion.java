package com.mx.Figura;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Implementacion implements IMetodos {

	List<Figura> listaF = new ArrayList<Figura>();
	
	@Override
	public void guardar(Figura figura) {
		// TODO Auto-generated method stub
		listaF.add(figura);
		
	}

	@Override
	public void editar(int indice, Figura figura) {
		// TODO Auto-generated method stub
		listaF.set(indice, figura);
	}

	@Override
	public void mostrar() {
		// TODO Auto-generated method stub
		System.out.println(listaF);
	}

	@Override
	public void eliminar(int indice) {
		// TODO Auto-generated method stub
		listaF.remove(indice);
	}

	@Override
	public Figura buscar(int indice) {
		// TODO Auto-generated method stub
		return listaF.get(indice);
	}
	
	public List<Figura> buscarNombre(List<Figura> lista, String nombre) {
		// TODO Auto-generated method stub
		return lista.stream()
				.filter(figura -> figura.getNombreF().equalsIgnoreCase(nombre))
				.collect(Collectors.toList());
	}
	
	public List<Figura> buscarlado(List<Figura> lista, int lado) {
		// TODO Auto-generated method stub
		return lista.stream()
				.filter(figura -> figura.getLados() == lado)
				.collect(Collectors.toList());
	}
	
	public List<Figura> buscarVertices(List<Figura> lista, int vertices) {
		// TODO Auto-generated method stub
		return lista.stream()
				.filter(figura -> figura.getVertices() == vertices)
				.collect(Collectors.toList());
	}
	
	public List<Figura> buscarArea(List<Figura> lista, int area) {
		// TODO Auto-generated method stub
		return lista.stream()
				.filter(figura -> figura.getArea() == area)
				.collect(Collectors.toList());
	}
	public List<Figura> buscarPerimetro(List<Figura> lista, int perimetro) {
		// TODO Auto-generated method stub
		return lista.stream()
				.filter(figura -> figura.getPerimetro() == perimetro)
				.collect(Collectors.toList());
	}
	
	public void contar() {
		int cont = listaF.size();
		System.out.println("La lista contiene:  " + cont + " Figuras. ");
	}
	
	
	public void eliminarNombre(List<Figura> lista, String nombre) {
		lista.removeIf(figura -> figura.getNombreF().equalsIgnoreCase(nombre));
	}
	public void eliminarLado(List<Figura> lista, int lados) {
		lista.removeIf(figura -> figura.getLados() == lados);
	}
	
	public void eliminarVert(List<Figura> lista, int vertices) {
		lista.removeIf(figura -> figura.getVertices() == vertices);
	}

	public void eliminarArea(List<Figura> lista, int area) {
		lista.removeIf(figura -> figura.getArea() == area);
	}

	public void eliminarPer(List<Figura> lista, int perimetro) {
		lista.removeIf(figura -> figura.getPerimetro() == perimetro);
	}
}
