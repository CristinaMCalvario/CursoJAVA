package com.mx.Persona.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.Persona.Dao.IPersonaDao;
import com.mx.Persona.Dominio.Persona;

@Service

public class PersonaServiceImp implements IPersonaService{
	
	@Autowired
	private IPersonaDao dao;

	@Override
	public void guardar(Persona persona) {
		// TODO Auto-generated method stub
		dao.save(persona);
		
	}

	@Override
	public void editar(Persona persona) {
		// TODO Auto-generated method stub
		dao.save(persona);
		
	}

	@Override
	public void eliminar(Persona persona) {
		// TODO Auto-generated method stub
		dao.delete(persona);
		
	}

	@Override
	public Persona buscar(Persona persona) {
		// TODO Auto-generated method stub
		return dao.findById(persona.getIdPersona()).orElse(null);
	}

	@Override
	public List<Persona> listar() {
		// TODO Auto-generated method stub
		return (List<Persona>) dao.findAll();
	}

}
