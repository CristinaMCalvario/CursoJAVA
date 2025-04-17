package Entidades;

public class Automovil {
	
	protected String marca;
	protected String subMarca;
	protected String modelo;
	
	//metodo personalizado
	public String mostrarDatos() {
		return "Vehiculo\n "+ "marca: "+ this.marca + "\nSubmarca: " +this.subMarca+
				"\nModelo: " + this.modelo;
		
	}
	
	public Automovil() {
		
	}

	public Automovil(String marca, String subMarca, String modelo) {
		super();
		this.marca = marca;
		this.subMarca = subMarca;
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getSubMarca() {
		return subMarca;
	}

	public void setSubMarca(String subMarca) {
		this.subMarca = subMarca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return "Automovil [marca=" + marca + ", subMarca=" + subMarca + ", modelo=" + modelo + "]\n";
		
	}
	
	
	

}
