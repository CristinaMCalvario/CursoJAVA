package Entidades;

public abstract class Transporte {
	protected String tipo;
	protected String ruta;
	protected String velocidad;
	protected String capacidad;
	
	//metodo abstracto
	public abstract void iniciarRuta();
	
	public Transporte() {
		
	}

	
	
	

	public Transporte(String tipo, String ruta, String velocidad, String capacidad) {
		super();
		this.tipo = tipo;
		this.ruta = ruta;
		this.velocidad = velocidad;
		this.capacidad = capacidad;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(String velocidad) {
		this.velocidad = velocidad;
	}

	public String getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(String capacidad) {
		this.capacidad = capacidad;
	}
	
	

	public String getRuta() {
		return ruta;
	}

	public void setRuta(String ruta) {
		this.ruta = ruta;
	}

	@Override
	public String toString() {
		return "Transporte [tipo=" + tipo + ", ruta=" + ruta + ", velocidad=" + velocidad + ", capacidad=" + capacidad
				+ "]\n";
	}

	
	
	
	
	

}
