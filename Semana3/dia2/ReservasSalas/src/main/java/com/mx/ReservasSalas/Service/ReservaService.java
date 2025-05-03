package com.mx.ReservasSalas.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.ReservasSalas.Dominio.Reserva;
import com.mx.ReservasSalas.Exception.DuracionInvalidaException;
import com.mx.ReservasSalas.Exception.FechaPasadaException;
import com.mx.ReservasSalas.Exception.HorarioNoPermitidoException;
import com.mx.ReservasSalas.Exception.ReservaNoEncontradaException;
import com.mx.ReservasSalas.Exception.ReservaSolapadaException;
import com.mx.ReservasSalas.Exception.SalaNoEncontradaException;
import com.mx.ReservasSalas.Dao.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Service
public class ReservaService {
	 @Autowired
	    private ReservaRepository reservaRepository;
	    
	    @Autowired
	    private SalaRepository salaRepository;

	    public Reserva crearReserva(Reserva reserva) {
	        validarReserva(reserva);
	        
	        if (!salaRepository.existsById(reserva.getSalaId())) {
	            throw new SalaNoEncontradaException("La sala especificada no existe");
	        }
	        
	        return reservaRepository.save(reserva);
	    }

	    public void cancelarReserva(int id) {
	        if (!reservaRepository.existsById(id)) {
	            throw new ReservaNoEncontradaException("Reserva no encontrada");
	        }
	        reservaRepository.deleteById(id);
	    }

	    public List<Reserva> listarReservasPorSalaYFecha(Long salaId, LocalDate fecha) {
	        return reservaRepository.findBySalaIdAndFecha(salaId, fecha);
	    }

	    private void validarReserva(Reserva reserva) {
	        // 1. Duración máxima (4 horas)
	        if (reserva.getDuracionHoras() > 4 || reserva.getDuracionHoras() <= 0) {
	            throw new DuracionInvalidaException("La duración debe ser entre 1 y 4 horas");
	        }

	        // 2. Horario permitido (8:00 AM - 8:00 PM)
	        LocalTime horaFin = reserva.getHoraInicio().plusHours(reserva.getDuracionHoras());
	        
	        if (reserva.getHoraInicio().isBefore(LocalTime.of(8, 0))) {
	            throw new HorarioNoPermitidoException("Las reservas no pueden comenzar antes de las 8:00 AM");
	        }
	        
	        if (horaFin.isAfter(LocalTime.of(20, 0))) {
	            throw new HorarioNoPermitidoException("Las reservas no pueden extenderse más allá de las 8:00 PM");
	        }

	        // 3. Fechas no en el pasado
	        if (reserva.getFecha().isBefore(LocalDate.now())) {
	            throw new FechaPasadaException("No se pueden hacer reservas para fechas en el pasado");
	        }

	        // 4. No solapamiento
	        List<Reserva> reservasSolapadas = reservaRepository.findReservasSolapadas(
	                reserva.getSalaId(),
	                reserva.getFecha(),
	                reserva.getHoraInicio(),
	                horaFin);
	        
	        if (!reservasSolapadas.isEmpty()) {
	            throw new ReservaSolapadaException("La sala ya está reservada para el horario especificado");
	        }
	    }
}
