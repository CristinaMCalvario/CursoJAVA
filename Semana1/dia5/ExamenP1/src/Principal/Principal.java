package Principal;

import java.util.Arrays;

import Entidades.Serie;
import Entidades.VideoJuego;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Serie[] arraySerie = new Serie[5];
		VideoJuego[] arrayVJ = new VideoJuego[5];
		
		//instanciar Serie
		Serie s1 = new Serie("Merlina", "Alfred Gough, Miles Millar");
		Serie s2 = new Serie("Bridgerton",3,"Historia","Julia Quinn, Chris Van Dusen");
		Serie s3 = new Serie();
		Serie s4 = new Serie("Emily en Paris", 4, "Drama", "Darren Star");
		Serie s5 = new Serie("The Good Doctor", 5,"Drama","Freddie Highmore, Shawn Williamson");
		
		//instanciar VideoJuego
		VideoJuego vj1 = new VideoJuego("Minecraft", 2, "accion-aventura", "Mojang Xbox");
		VideoJuego vj2 = new VideoJuego("Mario Kart", 1, "Carreras", "Nintendo");
		VideoJuego vj3 = new VideoJuego("Tetris", 12);
		VideoJuego vj4 = new VideoJuego();
		VideoJuego vj5 = new VideoJuego("GTA V", 20);
		
		//agregar objetos al array de Serie
		arraySerie[0] = s1;
		arraySerie[1] = s2;
		arraySerie[2] = s3;
		arraySerie[3] = s4;
		arraySerie[4] = s5;
		
		//agregar objetos al array de VideoJuegos
		arrayVJ[0] = vj1;
		arrayVJ[1] = vj2;
		arrayVJ[2] = vj3;
		arrayVJ[3] = vj4;
		arrayVJ[4] = vj5;
		
		//mostrar arrays
		System.out.println("Series");
		System.out.println(Arrays.toString(arraySerie));
		
		System.out.println("VideoJuegos");
		System.out.println(Arrays.toString(arrayVJ));
		
		//entregar
		s2.entregar();
		s4.entregar();
		s1.entregar();
		System.out.println("\nSeries despues de entregar algunas");
		System.out.println(Arrays.toString(arraySerie));
		
		vj5.entregar();
		vj3.entregar();
		System.out.println("\nVideoJuegos despues de entregar algunas");
		System.out.println(Arrays.toString(arrayVJ));
		
		//Cuenta cuantos Series y Videojuegos hay entregados
		int totalS = 0, totalV = 0;
		
		for(Serie s : arraySerie) {
			if(s.isEntregado()) {
				totalS++;
				s.devolver();
			}
		}
		System.out.println("Total de series entregados: " + totalS);
		
		for(VideoJuego v : arrayVJ) {
			if(v.isEntregado()) {
				totalV++;
				v.devolver();
			}
		}
		System.out.println("Total de videojuegos entregados: " + totalV);
		
		
		//indica el Videojuego tiene más horas estimadas y la serie con más temporadas
		
	    Serie noTem = arraySerie[0];	    
	    for (int i = 1; i < arraySerie.length; i++) {
            if (arraySerie[i].compareTo(noTem) > 0) {
                noTem = arraySerie[i];
            }
        }
	    System.out.println("\nSerie que tiene mas temporadas:\n" + noTem);
	    
	    
	    VideoJuego noHoras = arrayVJ[0];
	    for (int i = 1; i < arrayVJ.length; i++) {
	        if (arrayVJ[i].compareTo(noHoras) > 0) {
	           noHoras = arrayVJ[i];
	        }
	    }
	    System.out.println("\nVideojuego que tiene mas horas estimadas:\n" + noHoras );

	    
		
		
		
		
		

	}

}
