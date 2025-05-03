package com.mx.ReservasSalas.Dao;

import org.springframework.stereotype.Repository;

import com.mx.ReservasSalas.Dominio.Sala;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
@Repository
public class SalaRepository {
	private final List<Sala> salas = new ArrayList<>();
    private final AtomicInteger counter = new AtomicInteger(1);

    public SalaRepository() {
        // Inicializar con algunas salas
        salas.add(new Sala(counter.getAndIncrement(), "Sala de Reuniones A"));
        salas.add(new Sala(counter.getAndIncrement(), "Sala de Reuniones B"));
        salas.add(new Sala(counter.getAndIncrement(), "Sala de Conferencias"));
    }

    public List<Sala> findAll() {
        return new ArrayList<>(salas);
    }

    public Optional<Sala> findById(Long id) {
        return salas.stream().filter(s -> s.getId()==id).findFirst();
    }

    public boolean existsById(int id) {
        return salas.stream().anyMatch(s -> s.getId()==id);
    }
}
