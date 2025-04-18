package ConstantesYEstaticos;

public class Principal {
	//Miembro Estatico: metodos oo atributos que se asocian a una clase en lugar de una instancia
	//miembro constante: son variables que durante la ejecucion no cambian
	
	//miembro estatico: variable que se asocia a una clase
	public static String frase1 = "Miembro Estatico";
	
	//constante o variable final que se asocia a una clase
	public final String frase2 = "Variable final constante";
	
	//constante estatica: no cambia despues de la inicializacion
	public static final String frase3 = "Variable final estatica";

	public static void main(String[] args) {
		// acceso a mis miembros estaticos directamente desde mi clase
		System.out.println(frase1);
		System.out.println(frase3);
		
		//ejemplo el area de un circulo
		float radio = 5;
		double area = calcularAreaCirculo(radio);
		System.out.println("El area del circulo con radio: " + radio + " es: " + area);
		
		

	}
	
	public static double calcularAreaCirculo(float radio) {
		return Math.PI * (radio * radio);
	}

}
