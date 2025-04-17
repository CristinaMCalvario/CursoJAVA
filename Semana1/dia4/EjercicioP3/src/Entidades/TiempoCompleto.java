package Entidades;

public class TiempoCompleto extends Empleado{
	private int salario;

	@Override
	public double calcularSalario() {
		// TODO Auto-generated method stub
		return salario;
		
	}
	
	public TiempoCompleto() {
		
	}

	public TiempoCompleto(String nombre, String empleo, int salario) {
		super(nombre, empleo);
		this.salario = salario;
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "TiempoCompleto [nombre=" + nombre + ", empleo=" + empleo + ", salario=" + salario + "]\n";
	}

	
	
	

}
