package com.mx.Automovil.Dao;

import org.springframework.stereotype.Repository;

import com.mx.Automovil.Dominio.Automovil;

import org.springframework.data.repository.CrudRepository;


@Repository //
public interface IAutomovilDao extends CrudRepository<Automovil,Integer>{
	public Automovil findByMarca(String marca);
}
