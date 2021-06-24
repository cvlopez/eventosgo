package es.webapp.eventosgo.dao;

import es.webapp.eventosgo.entity.Mensaje;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MensajeRepository extends JpaRepository<Mensaje,Integer> {
}
