package com.mx.PadreHijo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.PadreHijo.Dominio.*;
import com.mx.PadreHijo.Service.*;

@RestController
@RequestMapping(path = "api/Padre")
@CrossOrigin
public class PadreWS {
	
	//url http://localhost:8001/api/Padre
	
	@Autowired
	private PadreServiceImp service;
	
	//listar -> http://localhost:8001/api/Padre/listar
	@GetMapping(value = "listar")
	public ResponseEntity<?> listar(){
		List<Padre> padre = service.listar();
		if(padre.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NO_CONTENT).body("No hay registros disponibles");
			
		}else {
			return ResponseEntity.ok(padre);
		}
		
	}
	
	//guardar->http://localhost:8001/api/Padre/guadar
	@PostMapping(value = "guardar")
	public ResponseEntity<?> guardar(@RequestBody Padre padre){
		service.guardar(padre);
		return ResponseEntity.ok("El padre: "+  padre.getNombre() + " se guardo correctamente"); 
	}
	
	@PostMapping(value = "buscar")
	ResponseEntity<Padre> buscar(@RequestBody Padre padre){
		Padre encontrado =  service.buscar(padre);
		return ResponseEntity.ok(encontrado);
	}
	
	@PutMapping(value = "editar")
	public ResponseEntity<String> editar(@RequestBody Padre padre){
		service.editar(padre);
		return ResponseEntity.ok("el padre: " + padre.getNombre() + " se editoo bien");
	}
	
	@DeleteMapping(value = "eliminar")
	ResponseEntity<String> eliminar(@RequestBody Padre padre){
		service.eliminar(padre);
		return ResponseEntity.ok("el registroo se elimino con exitoo");
	}
	
	@GetMapping(value="buscarPorNombre")
	public ResponseEntity<?> buscarPorNombre(@RequestBody String nombre){
		Padre encontrado = service.buscarPornombre(nombre);
		if(encontrado == null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("El padre: "+nombre+" no fue encontrado");
			
		}else {
			return ResponseEntity.ok("Padre encontrado"+encontrado);
		}
	}
	
	
	
	
	
	
	
}
