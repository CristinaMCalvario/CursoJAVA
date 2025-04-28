package com.mx.Automovil.Service;

import com.mx.Automovil.Dominio.Automovil;
import java.util.List;

public interface IAutomovilService {
	
	public void guardar(Automovil automovil);
	
	public void editar(Automovil automovil);
	
	public void eliminar(Automovil automovil);
	
	public Automovil buscar(Automovil automovil);
	public List<Automovil> listar();

}
