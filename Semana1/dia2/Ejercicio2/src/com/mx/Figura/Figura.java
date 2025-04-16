package com.mx.Figura;

public class Figura {
	private String nombreF;
	private int lados;
	private int vertices;
	private double area;
	private int perimetro;
	
	public Figura() {
		
	}

	public Figura(String nombreF, int lados, int vertices, double area, int perimetro) {
		super();
		this.nombreF = nombreF;
		this.lados = lados;
		this.vertices = vertices;
		this.area = area;
		this.perimetro = perimetro;
	}

	public String getNombreF() {
		return nombreF;
	}

	public void setNombreF(String nombreF) {
		this.nombreF = nombreF;
	}

	public int getLados() {
		return lados;
	}

	public void setLados(int lados) {
		this.lados = lados;
	}

	public int getVertices() {
		return vertices;
	}

	public void setVertices(int vertices) {
		this.vertices = vertices;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public int getPerimetro() {
		return perimetro;
	}

	public void setPerimetro(int perimetro) {
		this.perimetro = perimetro;
	}

	@Override
	public String toString() {
		return "Figura [nombreF=" + nombreF + ", lados=" + lados + ", vertices=" + vertices + ", area=" + area
				+ ", perimetro=" + perimetro + "]\n";
	}
	
	

}
