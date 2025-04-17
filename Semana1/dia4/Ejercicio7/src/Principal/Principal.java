package Principal;

import Entidades.Automovil;
import Entidades.Deportivo;
import Entidades.PickUp;
import Entidades.Turismo;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Automovil[]ves =new Automovil[4];
		
		ves[0] = new Automovil("Honda", "Civic", "2002");
		ves[1] = new Deportivo("Ford", "GT", "2003",8);
		ves[2] = new Turismo("Mercedez-Benz", "Spinter", "2025",15);
		ves[3] = new PickUp("Toyota", "tahoma", "2020",30);
		
		for(Automovil auto : ves) {
			System.out.println(auto.mostrarDatos());
			System.out.println(auto);
		}
		

	}

}
