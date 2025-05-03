package com.mx.ProfesorCurso.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mx.ProfesorCurso.Dominio.Curso;
import com.mx.ProfesorCurso.Dominio.Profesor;

@Repository
public interface IProfesorDao extends JpaRepository<Profesor, Integer> {

	
	
	
	@Query(value= "SELECT * FROM PROFESOR P WHERE UPPER(P.ESPECIALIDAD) = UPPER(:especialidad)",
			nativeQuery = true)
	public List<Profesor> findByEspecialidad(String especialidad);
	
}
