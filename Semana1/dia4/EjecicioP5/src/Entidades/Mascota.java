package Entidades;

public abstract class Mascota {
	protected String nombre;
	protected int edad;
	protected String raza;
	protected String comidaFavorita;
	
	public abstract String hacerSonido();

	public Mascota() {
		
	}	
	
	public Mascota(String nombre, int edad, String raza, String comidaFavorita) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.raza = raza;
		this.comidaFavorita = comidaFavorita;
	}
	
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	
	
	
	public String getComidaFavorita() {
		return comidaFavorita;
	}

	public void setComidaFavorita(String comidaFavorita) {
		this.comidaFavorita = comidaFavorita;
	}

	
	@Override
	public String toString() {
		return "Mascota [nombre=" + nombre + ", edad=" + edad + ", raza=" + raza + ", comidaFavorita=" + comidaFavorita
				+ "]\n";
	}

	public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Raza: " + raza);
        System.out.println("Comida Favorita: " + comidaFavorita);
        String a = hacerSonido();
        System.out.println("sonido: " + a);
        System.out.println("\n");
    }

}
