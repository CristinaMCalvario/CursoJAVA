package Principal;

import java.util.ArrayList;
import java.util.List;

import Entidades.Autobus;
import Entidades.Metro;
import Entidades.Transporte;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<Transporte> lista = new ArrayList<>();

		
		
		//instanciar
		Autobus autobus1 = new Autobus("Autbus", "CAPU", "10km", "50 pasajeros", "Autobus tiristico");
		
		Metro metro1 = new Metro("metro","CAPU - VALSEQUILLO","150 pasajeros","40KM",420);

		lista.add(metro1);
		lista.add(autobus1);
		
		for (Transporte t : lista) {
            t.iniciarRuta();
        }
		
		
	}

}
