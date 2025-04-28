package com.mx.Persona.Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.AbstractBindingResult;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.Persona.Dominio.Persona;
import com.mx.Persona.Service.PersonaServiceImp;

import jakarta.validation.Valid;

@RestController
@RequestMapping(path = "api/Persona")
@CrossOrigin


public class PersonaWS {
	
	@Autowired
	private PersonaServiceImp service;
	
	//http://localhost:8080/api/Persona/listar
	@GetMapping(value = "listar")
	public ResponseEntity<?> listar(){
		try {
			List<Persona> personaList = service.listar();
			 if (personaList.isEmpty()) {
		            return ResponseEntity.status(HttpStatus.NO_CONTENT)
		                    .body("No se encontraron Personas por mostrar");
		        }
		        return ResponseEntity.ok(personaList);
		} catch (Exception e) {
			// TODO: handle exception
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
	                .body("Error al mostrar: " + e.getMessage());
		}
		
	}
	
	//http://localhost:8080/api/Persona/buscar
	@PostMapping(value= "buscar")
	public ResponseEntity<?> buscar(@Valid @RequestBody Persona persona,BindingResult result) {
		if (result.hasErrors()) {
	        Map<String, String> errores = new HashMap<>();
	        result.getFieldErrors().forEach(err -> {
	            errores.put(err.getField(), err.getDefaultMessage());
	        });
	        return ResponseEntity.badRequest().body(errores);
	    }
	try {
		Persona personaE = service.buscar(persona);
		if (personaE == null ) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND)
	                .body("No se pueden mostrar las personas");
		}
		return ResponseEntity.ok(personaE);
	}catch(Exception e) {
		 return ResponseEntity.status(HttpStatus.BAD_REQUEST)
	                .body("Error al mostrar: " + e.getMessage());
	}
	
			//return service.buscar(persona);
			
		}
	
	//http://localhost:8080/api/Persona/guardar
	@PostMapping(value = "guardar")
	public ResponseEntity<?> guardar(@Valid @RequestBody Persona persona,AbstractBindingResult result) {
		 if (result.hasErrors()) {
		        Map<String, String> errores = new HashMap<>();
		        result.getFieldErrors().forEach(err -> {
		            errores.put(err.getField(), err.getDefaultMessage());
		        });
		        return ResponseEntity.badRequest().body(errores);
		    }
		try {
			service.guardar(persona);
			return ResponseEntity.status(HttpStatus.CREATED)
	                .body("Persona se aguardo correctamente");
		}catch(Exception e) {
			 return ResponseEntity.status(HttpStatus.BAD_REQUEST)
		                .body("Error al guardar: " + e.getMessage());
		}
		
	}
	
	//http://localhost:8080/api/Persona/editar
	@PostMapping(value = "editar")
	public ResponseEntity<?> editar(@Valid @RequestBody Persona persona,AbstractBindingResult result) {
		 if (result.hasErrors()) {
		        Map<String, String> errores = new HashMap<>();
		        result.getFieldErrors().forEach(err -> {
		            errores.put(err.getField(), err.getDefaultMessage());
		        });
		        return ResponseEntity.badRequest().body(errores);
		    }
		try {
			service.editar(persona);
			return ResponseEntity.status(HttpStatus.OK)
	                .body("Persona se actualizo correctamente");
		}catch(Exception e) {
			 return ResponseEntity.status(HttpStatus.BAD_REQUEST)
		                .body("Error al actualizar: " + e.getMessage());
		}
		
	}
	
	//http://localhost:8080/api/Persona/eliminar
	@DeleteMapping(value = "eliminar")
	public ResponseEntity<?> eliminar(@Valid @RequestBody Persona persona,AbstractBindingResult result) {
		if (result.hasErrors()) {
	        Map<String, String> errores = new HashMap<>();
	        result.getFieldErrors().forEach(err -> {
	            errores.put(err.getField(), err.getDefaultMessage());
	        });
	        return ResponseEntity.badRequest().body(errores);
	    }
	try {
		service.eliminar(persona);
		return ResponseEntity.status(HttpStatus.OK)
                .body("Persona se Elimino correctamente");
	}catch(Exception e) {
		 return ResponseEntity.status(HttpStatus.BAD_REQUEST)
	                .body("Error al eliminar: " + e.getMessage());
	}
		
	}
	
	

}
