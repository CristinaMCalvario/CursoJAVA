package Principal;

import java.util.InputMismatchException;
import java.util.Scanner;

import Entidades.Gato;
import Entidades.Mascota;
import Entidades.MascotaService;
import Entidades.Perro;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Perro perro1 = new Perro("Firulais",15,"Pastor","Croquetas");
		
		Gato gato1 =  new Gato("Neni", 5, "Montes","Pollo");
		//gato1.vacunar();
		
		
		Perro perro= null;
		Gato gato = null;
		String nombre, raza, tipo,comida;
		int edad;
		MascotaService servicio = new MascotaService();
		
		
		servicio.guardarMascota(perro1);
		servicio.guardarMascota(gato1);
		
		//servicio.d();
		
		Scanner scanner = new Scanner(System.in);
        int menuP = 0;

        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1.- Agregar mascota");
            System.out.println("2.- Mostrar mascotas");
            System.out.println("3.- Editar mascota");
            System.out.println("4.- Eliminar mascota");
            System.out.println("5.- Mostrar a mascotas vacunadas");
            System.out.println("6.- Salir");
            System.out.print("****Elige una opcion del menu****");
            menuP = Integer.parseInt(scanner.nextLine());
            
            try {

            switch (menuP) {
                case 1:
                	System.out.println("1.- Agregar mascota");
                    System.out.print("¿Qué tipo de mascota? (Perro/Gato): ");
                    tipo = scanner.nextLine();
                    System.out.print("Ingrese nombre: ");
                    nombre = scanner.nextLine();
                    System.out.print("Ingrese edad: ");
                    edad = Integer.parseInt(scanner.nextLine());
                    System.out.print("Ingrese raza: ");
                    raza = scanner.nextLine();
                    System.out.print("Ingrese comida favorita: ");
                    comida = scanner.nextLine();

                    if (tipo.equalsIgnoreCase("Perro")) {
                    	perro = new Perro(nombre, edad, raza,comida);
                        servicio.guardarMascota(perro);
                    } else if (tipo.equalsIgnoreCase("Gato")) {
                    	gato = new Gato(nombre, edad, raza,comida);
                        servicio.guardarMascota(gato);
                    } else {
                        System.out.println("Tipo de mascota no válido.");
                    }
                    break;

                case 2:
                	System.out.println("2.- Mostrar mascotas");
                    servicio.listarMascotas();
                    break;

                case 3:
                	System.out.println("3.- Editar mascota");
                    System.out.print("Indique el nombre a buscar: ");
                    nombre =scanner.nextLine();
                    servicio.editarMascota(nombre);
                    break;

                case 4:
                	System.out.println("4.- Eliminar mascota");
                    System.out.print("Indique el nombre a eliminar: ");
                    nombre = scanner.nextLine();
                    servicio.eliminarMascota(nombre);
                    break;
                case 5:
                	System.out.println("5.- Mostrar a mascotas vacunadas");
                	servicio.d();
                    break;
                case 6:
                    System.out.println("****Vuelva Pronto****");
                    break;

                default:
                    System.out.println("Indice fuera de rango");
            }
            
            }catch(InputMismatchException e) {
				System.out.println("Entrada invalida. por favor ingresa un numero");
				
			}
			catch (Exception e) {
				// TODO: handle exception
				System.out.println("Ocurrio un error inesperado" + e.getMessage());
				
			}

        } while (menuP != 6);
       

	}

}
