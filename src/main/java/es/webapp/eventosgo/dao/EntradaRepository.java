package es.webapp.eventosgo.dao;

import es.webapp.eventosgo.entity.Entrada;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EntradaRepository extends JpaRepository<Entrada, Integer> {
}
