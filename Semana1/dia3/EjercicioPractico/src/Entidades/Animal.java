package Entidades;

public class Animal {
	private int idAnimal;
	private String nombre;
	private String tipo;
	private int numPatas;
	
	public Animal() {
		
	}

	public Animal(int idAnimal, String nombre, String tipo, int numPatas) {
		super();
		this.idAnimal = idAnimal;
		this.nombre = nombre;
		this.tipo = tipo;
		this.numPatas = numPatas;
	}

	public int getIdAnimal() {
		return idAnimal;
	}

	public void setIdAnimal(int idAnimal) {
		this.idAnimal = idAnimal;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getNumPatas() {
		return numPatas;
	}

	public void setNumPatas(int numPatas) {
		this.numPatas = numPatas;
	}

	@Override
	public String toString() {
		return "Animal [idAnimal=" + idAnimal + ", nombre=" + nombre + ", tipo=" + tipo + ", numPatas=" + numPatas
				+ "]\n";
	}
	
	
	
	
	
	
}
