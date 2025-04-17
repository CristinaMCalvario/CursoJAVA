package Herencia;

public class Auto extends Vehiculo{
	private int numeroPuertas;
	
	public Auto() {
		
	}

	public Auto(String marca, String modelo, int anio, int numeroPuertas) {
		super(marca, modelo, anio);
		this.numeroPuertas = numeroPuertas;
	}
	
	
	
	
	
	public int getNumeroPuertas() {
		return numeroPuertas;
	}

	public void setNumeroPuertas(int numeroPuertas) {
		this.numeroPuertas = numeroPuertas;
	}

	@Override
	public String toString() {
		return "Auto [marca=" + marca + ", modelo=" + modelo + ", anio=" + anio + ", numeroPuertas=" + numeroPuertas
				+ "]\n";
	}

	public void tocarBocina() {
		System.out.println("¡Beep beep!");
	}
	
	public void mostrarInformacionM() {
		super.mostrarInformacion();
        System.out.println("Numero de puertas: " + numeroPuertas);
       
    }
	
	
	
}
