package Principal;

import Entidades.Abogado;
import Entidades.Medico;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//instanciar abogado
		Abogado abogado = new Abogado("Mitzy", "Zamudio", 30, 3, "BUAP", 4, "Fiscal", "Bufete ", 1700);
		System.out.println(abogado);
		abogado.trabajar();
		abogado.cobrar(abogado.getTipo(), abogado.getHonorarios());
		
		
		//medico
		System.out.println("----------------------------");
		Medico medico = new Medico("Frida", "Torres", 26, 9, "UPAPED", 5, "GENERAL", "consultorio IMSS", 70);
		System.out.println(medico);
		medico.trabajar();
		medico.cobrar(medico.getEspecialidad(), medico.getCostoConsulta());
		
		
		
		

	}

}
