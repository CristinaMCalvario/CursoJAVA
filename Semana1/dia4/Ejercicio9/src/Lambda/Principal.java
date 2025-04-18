package Lambda;

import java.util.ArrayList;
import java.util.List;

import Entidad.Alumno;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//instanciar objetos
		
		Alumno a1 = new Alumno(252012, "Martin", "Mendez", "Martinez", 21, "Ing. en Mecatronica", "BUAP");
		Alumno a2 = new Alumno(252015, "Mariana", "Morales", "Mijares", 20, "Medicina", "BUAP");
		Alumno a3 = new Alumno(252013, "Robert", "Apango", "Perez", 18, "Derecho", "BUAP");
		Alumno a4 = new Alumno(252014, "Alonso", "Perez", "Escobar", 22, "Ing. Industrial", "ITP");
		Alumno a5 = new Alumno(252016, "Saúl", "Jiménez", "Cardenas", 24, "Ing. Industrial", "UNAM");
		Alumno a6 = new Alumno(252017, "Carolina", "Hernandez", "Mejía", 22, "Contabilidad", "UNAM");
		
		List<Alumno> alumnos = new ArrayList<Alumno>();
		
		alumnos.add(a1);
		alumnos.add(a2);
		alumnos.add(a3);
		alumnos.add(a4);
		alumnos.add(a5);
		alumnos.add(a6);
		
		/*
		 * Sintaxis lambda
		 * (arg1 , arg2) -> (cuerpo);
		 * 					(tipo1, tipo2, arg2.....) -> (cuerpo);
		 */
		
		alumnos.forEach(
			//expresion lambda
			(alumno) -> {System.out.println("Nombre del alumno: " + alumno.getNombre());}
			
		
		);
		
		
		//detale del alumno
		System.out.println("--Detalle del alumno");
		//
		alumnos.stream().filter(
				arq -> arq.getUniversidad().equalsIgnoreCase("buap")
				).forEach(
						alumno -> System.out.println("Nombre: "+ alumno.getNombre() +" "+ alumno.getaPaterno() +
								" Estudia: " + alumno.getCarrera()+ " en la universidad: " +alumno.getUniversidad())
						);

		//expresion lambda con interface funcional
		ISaludo mensaje = (saludo, despedida) -> saludo + " y " + despedida;
		
		System.out.println("Expresiones lambda con 1 parametro: " +
		mensaje.saludar("Hola con expresiones lambda", "Hasta luego"));
		/***********************************************************************/
		
		//Filtrar los alumnos que tengan una edad mayor a 22 AÑOS 
		System.out.println("\n*alumnos que tengan una edad mayor a 22 AÑOS ");
		alumnos.stream().filter(
				age -> age.getEdad() == 22
				).forEach(
						alumno -> System.out.println("Nombre: " + alumno.getNombre() + " " + alumno.getaPaterno() +
								"\nSU edad es: "+ alumno.getEdad() + "\nUniversidad: " + alumno.getUniversidad())
						);
		
		//Filtrar los alumnos cuyo nombre comienza con la letra "A"
		System.out.println("\n*Filtrar los alumnos cuyo nombre comienza con la letra A");
		alumnos.stream().filter(
				com -> com.getNombre().startsWith("A")
				).forEach(
						alumno -> System.out.println("\nNombre: " + alumno.getNombre() + " " + alumno.getaPaterno() +
								  "\nUniversidad: " + alumno.getUniversidad())
						
						);
		//Ordenar los Alumnos Por su nombre
		
		System.out.println("\n*Ordenar los Alumnos Por su nombre");
		alumnos.stream().sorted(
				(alum1, alum2) -> alum1.getNombre().compareToIgnoreCase(alum2.getNombre())
				).forEach(
						alumno -> System.out.println("\nNombre: " + alumno.getNombre() + " " + alumno.getaPaterno() +
								 "\nUniversidad: " + alumno.getUniversidad())
						);
		
		//Contar los alumnos de la carrera de medicina
		System.out.println("\n*Contar los alumnos de la carrera de medicina");
		long num = alumnos.stream().filter(
				n -> n.getCarrera().equalsIgnoreCase("medicina")
				).count();
		
		System.out.println("\nTotal: " + num);
		
		//Mapear los nombres de los Alumnos a mayusculas
		System.out.println("\n*Mapear los nombres de los Alumnos a mayusculas");
		alumnos.stream().map(
				alum2 -> alum2.getNombre().toUpperCase()
				).forEach(
						nombre -> System.out.println("\nNombre: " + nombre)
						
						);
		
		
		//Calcular el promedio de las edades de todos los alumnos 
		System.out.println("\n*Calcular el promedio de las edades de todos los alumnos");
		double prom = alumnos.stream()
			    .mapToInt(Alumno::getEdad)
			    .average()                     
			    .orElse(0);                    

			System.out.println("\nPromedio total de edad: " + prom);

		
		//Verificar si existe algun Alumno de la carrera de Arquitectura
			System.out.println("\n*existe algun Alumno de la carrera de Arquitectura");
			boolean res = alumnos.stream()
				    .anyMatch(alumno -> alumno.getCarrera().equalsIgnoreCase("Arquitectura"));

				if (res) {
				    System.out.println("Si existen alumnos.");
				} else {
				    System.out.println("No hay alumnos");
				}

			
			
		
		//Filtrar alumnos por Universidad "UNAM" y carerra "Ing.
		System.out.println("\n*Filtrar alumnos por Universidad UNAM y carerra Ing.");
		alumnos.stream().filter(
				a -> a.getUniversidad().equalsIgnoreCase("UNAM") &&
					 a.getCarrera().equalsIgnoreCase("Ing. Industrial")
				).forEach(
						alumno -> System.out.println("Nombre: " + alumno.getNombre() + " " + alumno.getaPaterno() +
								"\nUniversidad: " + alumno.getUniversidad()+ "\nCarrera: " + alumno.getCarrera())
						);
		
		
		
	}

}
