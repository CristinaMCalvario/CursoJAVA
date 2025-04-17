package Principal;

import java.util.ArrayList;
import java.util.List;

import Entidades.Empleado;
import Entidades.MedioTiempo;
import Entidades.TiempoCompleto;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TiempoCompleto tc1 = new TiempoCompleto("Alana","Profesora",15000);
		TiempoCompleto tc2 = new TiempoCompleto("Robert","Ingeniero",30000);
		
		MedioTiempo mt1 = new MedioTiempo("Alex", "Mariachi", 6, 100);
		MedioTiempo mt2 = new MedioTiempo("Uziel", "profesora de ingles", 10, 90);
		
		List<Empleado> lista = new ArrayList<>();
		
		lista.add(mt2);
		lista.add(mt1);
		lista.add(tc2);
		lista.add(tc1);
		
		double nominaTotal = 0;
		 for (Empleado e : lista) {
	            double salario = e.calcularSalario();
	            System.out.println(e.getNombre() + " gana: $" + salario);
	            nominaTotal += salario;
	        }

	        System.out.println("\nNómina total: $" + nominaTotal);
		

	}

}
