package com.mx.ReservasSalas.Exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
@ControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler({
        DuracionInvalidaException.class,
        HorarioNoPermitidoException.class,
        FechaPasadaException.class,
        ReservaSolapadaException.class,
        SalaNoEncontradaException.class
	})
	public ResponseEntity<String> handleBadRequestExceptions(RuntimeException ex) {
	    return ResponseEntity.badRequest().body(ex.getMessage());
	}
	
	@ExceptionHandler(ReservaNoEncontradaException.class)
	public ResponseEntity<String> handleNotFoundException(RuntimeException ex) {
	    return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
	}
	
}
