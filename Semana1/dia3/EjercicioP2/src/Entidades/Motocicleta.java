package Entidades;

import java.util.List;

public class Motocicleta {
	private int id;
	private String marca;
	private String modelo;
	private String anio;
	private List<Servicio> HistorialServicios;
	
	public Motocicleta() {
		
	}

	public Motocicleta(int id, String marca, String modelo, String anio, List<Servicio> historialServicios) {
		super();
		this.id = id;
		this.marca = marca;
		this.modelo = modelo;
		this.anio = anio;
		HistorialServicios = historialServicios;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getAnio() {
		return anio;
	}

	public void setAnio(String anio) {
		this.anio = anio;
	}

	public List<Servicio> getHistorialServicios() {
		return HistorialServicios;
	}

	public void setHistorialServicios(List<Servicio> historialServicios) {
		HistorialServicios = historialServicios;
	}

	@Override
	public String toString() {
		return "Motocicleta [id=" + id + ", marca=" + marca + ", modelo=" + modelo + ", anio=" + anio
				+ ", HistorialServicios=" + HistorialServicios + "]\n";
	}
	
	
	
}
