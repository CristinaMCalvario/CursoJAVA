package Entidades;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Principal.Cuidados;

public class MascotaService {
	
	protected List<Mascota> lista = new ArrayList<>();
	
	public void guardarMascota(Mascota mascota) {
		lista.add(mascota);
	}
	
	public void editarMascota(String nombre) {
		Scanner scanner = new Scanner(System.in);
        for (Mascota m : lista) {
            if (m.getNombre().equalsIgnoreCase(nombre)) {
                System.out.print("Nuevo nombre: ");
                m.setNombre(scanner.nextLine());
                System.out.print("Nueva edad: ");
                m.setEdad(Integer.parseInt(scanner.nextLine()));
                System.out.print("Nueva raza: ");
                m.setRaza(scanner.nextLine());
                System.out.print("Comida Favorita: ");
                m.setComidaFavorita(scanner.nextLine());
                System.out.println("Mascota actualizada.");
                return;
            }
        }
        System.out.println("Mascota no encontrada.");
	}
	
	public void eliminarMascota(String nombre) {
		for (Mascota m : lista) {
            if (m.getNombre().equalsIgnoreCase(nombre)) {
                lista.remove(m);
                System.out.println("Mascota eliminada.");
                return;
            }
        }
        System.out.println("Mascota no encontrada.");
		
	}
	
	public void listarMascotas() {
        if (lista.isEmpty()) {
            System.out.println("No hay mascotas registradas.");
        } else {
            for (Mascota m : lista) {
                m.mostrarInformacion();
                
            }
        }
    }
	
	public void d() {
		for (Mascota m : lista) {
		    if (m instanceof Cuidados) {
		        Cuidados c = (Cuidados) m;
		        System.out.println("Aplicando cuidados a: " + m.getNombre());
		        c.vacunar(); // <-- método de la interfaz
		    }
		}


	}
	

}
