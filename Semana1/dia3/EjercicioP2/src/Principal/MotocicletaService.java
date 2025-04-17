package Principal;

import Entidades.Motocicleta;
import Entidades.Servicio;

public interface MotocicletaService {
	
	public void crearMotocicleta(Motocicleta m);
	public Motocicleta buscar(int id);
	public void actualizar(int id, Motocicleta nuevaInfo);
	public void eliminarMotocicleta(int id);
	public void agregarServicio(int id, Servicio s);
	public void verHistorialServicios(int id)
	

}
