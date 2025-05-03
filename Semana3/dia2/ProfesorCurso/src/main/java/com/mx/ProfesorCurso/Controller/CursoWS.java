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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mx.ProfesorCurso.Dominio.Curso;
import com.mx.ProfesorCurso.Dominio.Profesor;
import com.mx.ProfesorCurso.Service.CursoServiceImp;

@RestController
@RequestMapping(path = "api/Curso")
@CrossOrigin
public class CursoWS {

	@Autowired
	private CursoServiceImp service;
	
	//http://localhost:8001/api/Curso
	
	@GetMapping(value = "listar")
	public ResponseEntity<?> listar(){
		List<Curso> cursos =  service.listar();
		
		return ResponseEntity.ok(cursos);
		
	}
	
	
	@PostMapping(value = "buscar")
	public ResponseEntity<?> buscar(@RequestBody Curso curso)
	{
		Curso encontrado = service.buscar(curso);
		return ResponseEntity.ok(encontrado);
	}
	@PostMapping(value = "guardar")
	public ResponseEntity<?> guardar(@RequestBody Curso curso) {
		service.guardar(curso);
		return ResponseEntity.ok("El curso " + curso + " se guardo bien" );
	}
	
	@PutMapping(value = "editar")
	public ResponseEntity<?> editar(@RequestBody Curso curso)
	{
		service.editar(curso);
		return ResponseEntity.ok("El curso " + curso.getNombre() + " se edito bien" );
	}
	
	@DeleteMapping(value = "eliminar")
	public ResponseEntity<?> eliminar(@RequestBody Curso curso)
	{
		service.eliminar(curso);
		return ResponseEntity.ok("El registro se elimino");
	}
	
	
	
	
	
	
	
	
	@GetMapping(value = "buscarPorNombre")
	public ResponseEntity<?> buscarPorNombre(@RequestParam String nombre){
		Curso encontrado = service.buscarPorNombre(nombre);
		if (encontrado == null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND)
								.body("El curso " + nombre + " no fue encotrado");
			
		}else {
			return ResponseEntity.ok("Profesor encontrado" + encontrado);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
