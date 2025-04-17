package Herencia;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Auto auto1 = new Auto("Audi", "autoC", 2015, 4);
		Auto auto2 = new Auto("WMV", "autoA", 2018, 2);
		
		
		Motocicleta m1 = new Motocicleta("LEN", "bill", 2023, "knnow");
		Motocicleta m2 = new Motocicleta("HP", "lol", 2015, "nos");
		
		
		auto1.tocarBocina();
		auto2.tocarBocina();
		
		m1.hacerCaballito();
		m2.hacerCaballito();
		
		auto1.mostrarInformacionM();
		auto2.mostrarInformacionM();
		
		m1.mostrarInformacion();
		m2.mostrarInformacion();

	}

}
