package com.mx.Persona.Dao;

import org.springframework.data.repository.CrudRepository;

import com.mx.Persona.Dominio.Persona;

public interface IPersonaDao extends CrudRepository<Persona,Integer>{

	public Persona findByNombre(String nombre);
	
}
