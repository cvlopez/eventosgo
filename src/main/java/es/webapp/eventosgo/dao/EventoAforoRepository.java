package es.webapp.eventosgo.dao;

import es.webapp.eventosgo.entity.EventoAforo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventoAforoRepository extends JpaRepository<EventoAforo,Integer> {
}
