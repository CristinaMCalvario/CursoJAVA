package com.mx.ReservasSalas.Dao;

import org.springframework.stereotype.Repository;

import com.mx.ReservasSalas.Dominio.Reserva;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class ReservaRepository {
	 private final List<Reserva> reservas = new ArrayList<>();
	    private final AtomicInteger counter = new AtomicInteger(1);

	    public List<Reserva> findAll() {
	        return new ArrayList<>(reservas);
	    }

	    public Reserva save(Reserva reserva) {
	        if (reserva.getId() == 0) {
	            reserva.setId(counter.getAndIncrement());
	            reservas.add(reserva);
	            return reserva;
	        } 
	        return null;
	    }

	    public void deleteById(int id) {
	        reservas.removeIf(r -> r.getId() == id);
	    }

	    public List<Reserva> findBySalaIdAndFecha(Long salaId, LocalDate fecha) {
	        return reservas.stream()
	                .filter(r -> r.getSalaId()==salaId && r.getFecha().equals(fecha))
	                .toList();
	    }

	    public boolean existsById(int id) {
	        return reservas.stream().anyMatch(r -> r.getId() ==id);
	    }

	    public List<Reserva> findReservasSolapadas(int salaId, LocalDate fecha, LocalTime horaInicio, LocalTime horaFin) {
	        return reservas.stream()
	                .filter(r -> r.getSalaId() == salaId && r.getFecha().equals(fecha))
	                .filter(r -> {
	                    LocalTime rHoraFin = r.getHoraInicio().plusHours(r.getDuracionHoras());
	                    return (r.getHoraInicio().isBefore(horaFin) && rHoraFin.isAfter(horaInicio));
	                })
	                .toList();
	    }
}
