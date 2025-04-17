package Entidades;

public abstract class Empleado {
	protected String nombre;
	protected String empleo;
	
	public abstract double calcularSalario();
	
	public Empleado() {
		
	}

	public Empleado(String nombre, String empleo) {
		super();
		this.nombre = nombre;
		this.empleo = empleo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmpleo() {
		return empleo;
	}

	public void setEmpleo(String empleo) {
		this.empleo = empleo;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", empleo=" + empleo + "]";
	}
	
	

}
