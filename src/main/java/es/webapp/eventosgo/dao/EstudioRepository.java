package es.webapp.eventosgo.dao;

import es.webapp.eventosgo.entity.Estudio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstudioRepository extends JpaRepository<Estudio,Integer> {
}
