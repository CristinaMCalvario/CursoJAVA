package com.mx.ReservasSalas.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.mx.ReservasSalas.Dominio.Reserva;
import com.mx.ReservasSalas.Service.ReservaService;

import java.time.LocalDate;
import java.util.List;


@RestController
@RequestMapping("/api")
public class ReservaController {
	@Autowired
    private ReservaService reservaService;

    @PostMapping("/reservas")
    public ResponseEntity<Reserva> crearReserva(@RequestBody Reserva reserva) {
        Reserva nuevaReserva = reservaService.crearReserva(reserva);
        return ResponseEntity.ok(nuevaReserva);
    }

    @DeleteMapping("/reservas/{id}")
    public ResponseEntity<String> cancelarReserva(@PathVariable int id) {
        reservaService.cancelarReserva(id);
        return ResponseEntity.ok("Reserva cancelada exitosamente.");
    }

    @GetMapping("/salas/{id}/reservas")
    public ResponseEntity<List<Reserva>> listarReservasPorSalaYFecha(
            @PathVariable Long id,
            @RequestParam LocalDate fecha) {
        List<Reserva> reservas = reservaService.listarReservasPorSalaYFecha(id, fecha);
        return ResponseEntity.ok(reservas);
    }
}
