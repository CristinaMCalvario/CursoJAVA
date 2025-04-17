package Entidades;

public class Servicio {
	private int id;
	private String descripcion;
	private double costo;
	private String fecha;
	
	public Servicio() {
		
	}

	public Servicio(int id, String descripcion, double costo, String fecha) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.costo = costo;
		this.fecha = fecha;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getCosto() {
		return costo;
	}

	public void setCosto(double costo) {
		this.costo = costo;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		return "Servicio [id=" + id + ", descripcion=" + descripcion + 
				", costo=" + costo + ", fecha=" + fecha + "]\n";
	}
	
	
	
	
	
	
}
