package Entidades;

public class Metro extends Transporte {
	private int numUnidad;
	
	

	@Override
	public void iniciarRuta() {
		// TODO Auto-generated method stub
		System.out.println("Voy a " + ruta);
		
	}
	public Metro() {
		
	}
	
	
	
	public Metro(String tipo, String ruta, String velocidad, String capacidad, int numUnidad) {
		super(tipo, ruta, velocidad, capacidad);
		this.numUnidad = numUnidad;
	}
	public int getNumUnidad() {
		return numUnidad;
	}
	public void setNumUnidad(int numUnidad) {
		this.numUnidad = numUnidad;
	}
	@Override
	public String toString() {
		return "Metro [tipo=" + tipo + ", ruta=" + ruta + ", velocidad=" + velocidad + ", capacidad=" + capacidad
				+ ", numUnidad=" + numUnidad + "]\n";
	}
	
	
	
	
	
	
	

}
