package es.webapp.eventosgo.dao;

import es.webapp.eventosgo.entity.Conversacion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConversacionRepository extends JpaRepository<Conversacion, Integer> {
}
