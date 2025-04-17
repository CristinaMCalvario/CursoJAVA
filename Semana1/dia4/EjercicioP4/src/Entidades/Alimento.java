package Entidades;

public class Alimento extends Producto{
	private String fechaVencimiento;
	
	public Alimento() {
		
	}

    public Alimento(String codigo, String nombre, double precio, String fechaVencimiento) {
        super(codigo, nombre, precio);
        this.fechaVencimiento = fechaVencimiento;
    }
    
    

    public String getFechaVencimiento() {
		return fechaVencimiento;
	}

	public void setFechaVencimiento(String fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}

	@Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Fecha de vencimiento: " + fechaVencimiento);
    }

}
