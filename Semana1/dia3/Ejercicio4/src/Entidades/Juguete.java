package Entidades;

public class Juguete {
	private int sku; //clave
	private String nombre;
	private String edades;
	private double precio;
	private String fabricante;
	private String tipo;
	private String color;
	
	public Juguete() {
		
	}

	public int getSku() {
		return sku;
	}

	public void setSku(int sku) {
		this.sku = sku;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEdades() {
		return edades;
	}

	public void setEdades(String edades) {
		this.edades = edades;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Juguete [sku=" + sku + ", nombre=" + nombre + ", edades=" + edades + ", precio=" + precio
				+ ", fabricante=" + fabricante + ", tipo=" + tipo + ", color=" + color + "]\n";
	}
	
	
	
	

}
