package Principal;

import Entidades.Alimento;
import Entidades.Electronico;
import Entidades.Metodos;

public class Principal {

	public static void main(String[] args) {
		Alimento a1 = new Alimento("456", "manzana", 35.50, "20-02-2025");
		Alimento a2 = new Alimento("457", "lata atun", 40.99, "30-10-2026");
		
		Electronico e1 = new Electronico("501", "Laptop", 25000, 12);
		Electronico e2 = new Electronico("502", "impresora", 6000, 6);
		
		Metodos metodos =new Metodos();
		
		metodos.agregarProducto(a1);
		metodos.agregarProducto(a2);
		metodos.agregarProducto(e1);
		metodos.agregarProducto(e2);
		
		//a1.mostrarInformacion();
		metodos.mostrar();
		
		metodos.eliminarProducto(a2.getCodigo());
		
		metodos.mostrar();
		
		metodos.buscarProducto(e2.getCodigo());
		
		metodos.buscarProducto(a2.getCodigo());
		
		
		
		
	}

}
