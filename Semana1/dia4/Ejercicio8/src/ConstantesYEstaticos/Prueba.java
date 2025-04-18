package ConstantesYEstaticos;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//intanciar Principal
		Principal obj1 = new Principal();
		Principal obj2 = new Principal();
		
		//acceder a los miembros
		System.out.println("obj1: " + obj1.frase2);//miembro de instancia
		System.out.println("obj2: " + Principal.frase3);//miembro atravez de una clase
		
		System.out.println("obj: " + Principal.frase1);//
		
		
		
		

	}

}
