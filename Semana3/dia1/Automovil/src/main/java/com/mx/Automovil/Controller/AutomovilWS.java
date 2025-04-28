package com.mx.Automovil.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.Automovil.Dominio.Automovil;
import com.mx.Automovil.Service.AutomovilServiceImp;

@RestController //nos permite manipular el restcontroller y utilizar el protocolo http
@RequestMapping(path="api/Automovil")
@CrossOrigin //
public class AutomovilWS {

	
	//
	@Autowired
	private AutomovilServiceImp service;
	
	/*
	 * url = PROTOCOLO://HOST:PUERTO:PATH
	 * 
	 * url=http://localhost:8080/api/automovil
	 * 
	 * listar->http://localhost:8080/api/automovil/listar
	 * 
	 * @GetMapping(value = "listar")
	 * public List<
	 * */
	@GetMapping(value = "listar")
	public List<Automovil> listar(){
		return service.listar();
	}
	
	
	//http://localhost:8080/api/Automovil/buscar
	@PostMapping(value= "buscar")
	public Automovil buscar(@RequestBody Automovil automovil) {
		return service.buscar(automovil);
	}
	
	
	//http://localhost:8080/api/Automovil/guardar
	@PostMapping(value = "guardar")
	public void guardar(@RequestBody Automovil automovil) {
		service.guardar(automovil);
	}
	
	
	//http://localhost:8080/api/Automovil/editar
	@PostMapping(value = "editar")
	public void editar(@RequestBody Automovil automovil) {
		service.editar(automovil);
	}
	
	
	//http://localhost:8080/api/Automovil/eliminar
	@DeleteMapping(value = "eliminar")
	public void eliminar(@RequestBody Automovil automovil) {
		service.eliminar(automovil);
	}
}
