package Entidades;

public class MedioTiempo extends Empleado{
	private int horasTrabajadas;
	private int horasPagadas;
	@Override
	public double calcularSalario() {
		// TODO Auto-generated method stub
		return horasTrabajadas * horasPagadas;
	}
	
	public MedioTiempo() {
		
	}

	public MedioTiempo(String nombre, String empleo, int horasTrabajadas, int horasPagadas) {
		super(nombre, empleo);
		this.horasTrabajadas = horasTrabajadas;
		this.horasPagadas = horasPagadas;
	}

	public int getHorasTrabajadas() {
		return horasTrabajadas;
	}

	public void setHorasTrabajadas(int horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}

	public int getHorasPagadas() {
		return horasPagadas;
	}

	public void setHorasPagadas(int horasPagadas) {
		this.horasPagadas = horasPagadas;
	}

	@Override
	public String toString() {
		return "MedioTiempo [nombre=" + nombre + ", empleo=" + empleo + ", horasTrabajadas=" + horasTrabajadas
				+ ", horasPagadas=" + horasPagadas + "]";
	}
	
	
	
	
	
}
