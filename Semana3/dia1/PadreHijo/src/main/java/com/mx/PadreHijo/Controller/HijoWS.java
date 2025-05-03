package com.mx.PadreHijo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.PadreHijo.Dominio.*;
import com.mx.PadreHijo.Service.*;

@RestController
@RequestMapping(path = "api/Hijo")
@CrossOrigin
public class HijoWS {

	//url -> http://localhost:8001/api/Hijo
	
	@Autowired
	private HijoServiceImp service;
	
	//http://localhost:8001/api/Hijo/
	@GetMapping(value = "listar")
	public ResponseEntity<?> listar(){
		List<Hijo> hijos = service.listar();
		return ResponseEntity.ok(hijos);
	}
	
	//buscar http://localhost:8001/api/Hijo/buscar
	@PostMapping(value = "buscar")//en esta 
 	public ResponseEntity<?> buscar(@RequestBody Hijo hijo){
		Hijo encontrado = service.buscar(hijo);
		return ResponseEntity.ok(encontrado);
	}
	
	//guardar http://localhost:8001/api/Hijo/guardar
	@PostMapping(value = "guardar")
	public ResponseEntity<?> guardar(@RequestBody  Hijo hijo){
		service.guardar(hijo);
		return ResponseEntity.ok("El hijo "+hijo.getNombre()+" se aguardo");
		
		
	}
	@PutMapping(value = "editar")
	public ResponseEntity<?> editar(@RequestBody Hijo hijo){
		service.editar(hijo);
		return ResponseEntity.ok("el hijo "+ hijo.getNombre()+" se dice correctamente");
		
		
		
	}
	
	@DeleteMapping(value = "eliminar")
	public ResponseEntity<?> eliminar(@RequestBody Hijo hijo){
		service.eliminar(hijo);
		return ResponseEntity.ok("se elimno correctamente");
	}
	
	//buscar por hibbie
	@GetMapping(value = "/buscarPorHobbie/{hobbie}")
	public ResponseEntity<?> buscarPorHobbie(@PathVariable("hobbie") String hobbie){
		List<Hijo> hijos = service.buscarPorHobbie(hobbie);
		if(hijos.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No existen registros con ese hobbie");
			
		}else {
			return ResponseEntity.ok(hijos);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
}
