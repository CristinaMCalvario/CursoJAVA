package com.mx.Automovil.Service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.Automovil.Dao.IAutomovilDao;
import com.mx.Automovil.Dominio.Automovil;

@Service //indica que esta clase provee un coonjunto de funcionalidades que pueden ser utilizadas en otra calse

public class AutomovilServiceImp implements IAutomovilService{
	
	//inyecccion del crudRepository
	@Autowired //indica la inyeccion de una dependencia para permitir que la aplicacion sea escalable
	private IAutomovilDao dao;

	@Override
	public void guardar(Automovil automovil) {
		// TODO Auto-generated method stub
		dao.save(automovil);
		
	}

	@Override
	public void editar(Automovil automovil) {
		// TODO Auto-generated method stub
		dao.save(automovil);
		
	}

	@Override
	public void eliminar(Automovil automovil) {
		// TODO Auto-generated method stub
		dao.delete(automovil);
		
	}

	@Override
	public Automovil buscar(Automovil automovil) {
		// TODO Auto-generated method stub
		return dao.findById(automovil.getIdAutomovil()).orElse(null);
	}

	@Override
	public List<Automovil> listar() {
		// TODO Auto-generated method stub
		return (List<Automovil>) dao.findAll();
	}

}
