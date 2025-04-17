package Herencia;

public class Motocicleta extends Vehiculo{
	
	private String tipoManubrio;
	
	
	public Motocicleta() {
		
	}
	
	
	
	
	public Motocicleta(String marca, String modelo, int anio, String tipoManubrio) {
		super(marca, modelo, anio);
		this.tipoManubrio = tipoManubrio;
	}

	


	public String getTipoManubrio() {
		return tipoManubrio;
	}




	public void setTipoManubrio(String tipoManubrio) {
		this.tipoManubrio = tipoManubrio;
	}


	

	@Override
	public String toString() {
		return "Motocicleta [marca=" + marca + ", modelo=" + modelo + ", anio=" + anio + ", tipoManubrio="
				+ tipoManubrio + "]\n";
	}




	public void hacerCaballito() {
		System.out.println("¡Mira ese caballito!");
	}
	

}
