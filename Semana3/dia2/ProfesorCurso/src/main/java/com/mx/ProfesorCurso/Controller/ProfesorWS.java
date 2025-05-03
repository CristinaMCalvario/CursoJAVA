package com.mx.ProfesorCurso.Controller;

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

import com.mx.ProfesorCurso.Dominio.Curso;
import com.mx.ProfesorCurso.Dominio.Profesor;
import com.mx.ProfesorCurso.Service.ProfesorServiceImp;

@RestController
@RequestMapping(path = "api/Profesor")
@CrossOrigin
public class ProfesorWS {

	@Autowired
	private ProfesorServiceImp service;
	
	
	//url =  http://localhost:8001/api/Profesor
	
	//listar http://localhost:8001/api/Profesor/listar
	
	@GetMapping(value = "listar")
	public ResponseEntity<?> listar(){
		List<Profesor> profesor = service.listar();
		if (profesor.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NO_CONTENT)
								.body("NO hay registros");
			
		}else {
			return ResponseEntity.ok(profesor);
		}
	}


	
	@PostMapping(value = "buscar")
	public ResponseEntity<?> buscar(@RequestBody Profesor profesor)
	{
		Profesor encontrado = service.buscar(profesor);
		return ResponseEntity.ok(encontrado);
	}
	
	@PostMapping(value = "guardar")
	public ResponseEntity<?> guardar(@RequestBody Profesor profesor) {
		service.guardar(profesor);
		return ResponseEntity.ok("El profesor " + profesor + " se guardo bien" );
	}
	
	@PutMapping(value = "editar")
	public ResponseEntity<?> editar(@RequestBody Profesor profesor)
	{
		service.editar(profesor);
		return ResponseEntity.ok("El profesor " + profesor.getNombre() + " se edito bien" );
	}
	
	@DeleteMapping(value = "eliminar")
	public ResponseEntity<?> eliminar(@RequestBody Profesor profesor)
	{
		service.eliminar(profesor);
		return ResponseEntity.ok("El registro se elimino");
	}
	
	
	
	
	@GetMapping("/{especialidad}")
	public ResponseEntity<?> buscarPorEspecialidad(@PathVariable("especialidad") String especialidad){
		List<Profesor>  cursos = service.buscarPorEspecialidad(especialidad);
		if (cursos.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND)
								.body("No existen registros ");
			
		}else {
			return ResponseEntity.ok(cursos);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
