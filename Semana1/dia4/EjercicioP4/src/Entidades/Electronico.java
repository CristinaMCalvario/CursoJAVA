package Entidades;

public class Electronico extends Producto {
	private int garantiaMeses;
	
	public Electronico() {
		
	}

    public Electronico(String codigo, String nombre, double precio, int garantiaMeses) {
        super(codigo, nombre, precio);
        this.garantiaMeses = garantiaMeses;
    }
    
    

    public int getGarantiaMeses() {
		return garantiaMeses;
	}

	public void setGarantiaMeses(int garantiaMeses) {
		this.garantiaMeses = garantiaMeses;
	}

	@Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Garantía: " + garantiaMeses + " meses");
    }
	
	
}
