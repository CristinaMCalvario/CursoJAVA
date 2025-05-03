package com.mx.ProfesorCurso.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.mx.ProfesorCurso.Dao.IProfesorDao;
import com.mx.ProfesorCurso.Dominio.Curso;
import com.mx.ProfesorCurso.Dominio.Profesor;

@Service//
public class ProfesorServiceImp implements IProfesorService {
	
	@Autowired
	private IProfesorDao dao;

	@Override
	public void guardar(Profesor profesor) {
		// TODO Auto-generated method stub
		dao.save(profesor);
		
	}

	@Override
	public void editar(Profesor profesor) {
		// TODO Auto-generated method stub
		dao.save(profesor);
		
	}

	@Override
	public void eliminar(Profesor profesor) {
		// TODO Auto-generated method stub
		dao.delete(profesor);
		
	}

	@Override
	public Profesor buscar(Profesor profesor) {
		// TODO Auto-generated method stub
		return dao.findById(profesor.getIdProfesor()).orElse(null);
	}

	@Override
	public List<Profesor> listar() {
		// TODO Auto-generated method stub
		return dao.findAll(Sort.by(Sort.Direction.ASC,"idProfesor"));
	}
	
	
	
	public List<Profesor> buscarPorEspecialidad(String especialidad){
		return dao.findByEspecialidad(especialidad);
	}
	
	

}
