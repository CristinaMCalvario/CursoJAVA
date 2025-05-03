package com.mx.ProfesorCurso.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.mx.ProfesorCurso.Dao.ICursoDao;
import com.mx.ProfesorCurso.Dominio.Curso;
import com.mx.ProfesorCurso.Dominio.Profesor;

@Service
public class CursoServiceImp implements ICursoService{

	@Autowired
	private ICursoDao dao;

	@Override
	public void guardar(Curso curso) {
		// TODO Auto-generated method stub
		dao.save(curso);
		
	}

	@Override
	public void editar(Curso curso) {
		// TODO Auto-generated method stub
		dao.save(curso);
	}

	@Override
	public void eliminar(Curso curso) {
		// TODO Auto-generated method stub
		dao.delete(curso);
	}

	@Override
	public Curso buscar(Curso curso) {
		// TODO Auto-generated method stub
		return dao.findById(curso.getIdCurso()).orElse(null);
	}

	@Override
	public List<Curso> listar() {
		// TODO Auto-generated method stub
		return dao.findAll(Sort.by(Sort.Direction.ASC,"idCurso"));
	}
	
	public Curso buscarPorNombre(String nombre) {
		return dao.findByNombreIgnoringCaseContaining(nombre);
	}
	
}
