package com.mx.ReservasSalas.Dominio;

import java.time.LocalDate;
import java.time.LocalTime;

public class Reserva {

	private int id;
    private int salaId;
    private String usuario;
    private LocalDate fecha;
    private LocalTime horaInicio;
    private int duracionHoras;

    public Reserva() {}

    public Reserva(int id, int salaId, String usuario, LocalDate fecha, LocalTime horaInicio, int duracionHoras) {
        this.id = id;
        this.salaId = salaId;
        this.usuario = usuario;
        this.fecha = fecha;
        this.horaInicio = horaInicio;
        this.duracionHoras = duracionHoras;
    }

    // Getters y Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public int getSalaId() { return salaId; }
    public void setSalaId(int salaId) { this.salaId = salaId; }
    public String getUsuario() { return usuario; }
    public void setUsuario(String usuario) { this.usuario = usuario; }
    public LocalDate getFecha() { return fecha; }
    public void setFecha(LocalDate fecha) { this.fecha = fecha; }
    public LocalTime getHoraInicio() { return horaInicio; }
    public void setHoraInicio(LocalTime horaInicio) { this.horaInicio = horaInicio; }
    public int getDuracionHoras() { return duracionHoras; }
    public void setDuracionHoras(int duracionHoras) { this.duracionHoras = duracionHoras; }
	
	
	
}
