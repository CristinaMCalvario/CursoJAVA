package com.mx.ReservasSalas.Exception;

public class ReservaNoEncontradaException extends RuntimeException{
	public ReservaNoEncontradaException() {
        super("Reserva no encontrada");
    }

    public ReservaNoEncontradaException(String message) {
        super(message);
    }

    public ReservaNoEncontradaException(Long id) {
        super("Reserva no encontrada con ID: " + id);
    }
}
