package Entidades;

public class Fruta {
	private String nombre; //clave
	private String color;
	private double precio;
	private double peso;
	private String temporada;
	
	public Fruta() {
		
	}

	public Fruta(String nombre, String color, double precio, double peso, String temporada) {
		super();
		this.nombre = nombre;
		this.color = color;
		this.precio = precio;
		this.peso = peso;
		this.temporada = temporada;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getTemporada() {
		return temporada;
	}

	public void setTemporada(String temporada) {
		this.temporada = temporada;
	}

	@Override
	public String toString() {
		return "Fruta [nombre=" + nombre + ", color=" + color + ", precio=" + precio + ", peso=" + peso + ", temporada="
				+ temporada + "]\n";
	}
	
	
	
	
	
	

}
