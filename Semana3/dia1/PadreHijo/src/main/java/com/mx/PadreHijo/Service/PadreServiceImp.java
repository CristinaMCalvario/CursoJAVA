package com.mx.PadreHijo.Service;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.mx.PadreHijo.Dao.*;
import com.mx.PadreHijo.Dominio.*;

@Service
public class PadreServiceImp implements IPadreService{

	@Autowired
	private IPadreDao dao;
	
	@Override
	public void guardar(Padre padre) {
		// TODO Auto-generated method stub
		dao.save(padre);
		
	}

	@Override
	public void editar(Padre padre) {
		// TODO Auto-generated method stub
		dao.save(padre);
		
	}

	@Override
	public void eliminar(Padre padre) {
		// TODO Auto-generated method stub
		dao.delete(padre);
		
	}

	@Override
	public Padre buscar(Padre padre) {
		// TODO Auto-generated method stub
		return dao.findById(padre.getIdPadre()).orElse(null);
	}

	@Override
	public List<Padre> listar() {
		// TODO Auto-generated method stub
		return dao.findAll(Sort.by(Sort.Direction.ASC, "idPadre"));
	}
	
	public 	Padre buscarPornombre(String nombre) {
		return dao.findByNombreIgnoringCaseContaining(nombre);
	}
	
	

}
