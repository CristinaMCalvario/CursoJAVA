package Entidades;

public class Autobus extends Transporte{
	private String tipoA;
	

	@Override
	public void iniciarRuta() {
		// TODO Auto-generated method stub
		System.out.println("Voy por: " + ruta + " Arranca.");
	}

	public Autobus() {
		
	}

	

	public Autobus(String tipo, String ruta, String velocidad, String capacidad, String tipoA) {
		super(tipo, ruta, velocidad, capacidad);
		this.tipoA = tipoA;
	}

	public String getTipoA() {
		return tipoA;
	}

	public void setTipoA(String tipoA) {
		this.tipoA = tipoA;
	}

	@Override
	public String toString() {
		return "Autobus [tipo=" + tipo + ", ruta=" + ruta + ", velocidad=" + velocidad + ", capacidad=" + capacidad
				+ ", tipoA=" + tipoA + "]";
	}

	

	
	
	
	
	
	
	
}
