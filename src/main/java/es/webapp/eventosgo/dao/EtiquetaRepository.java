package es.webapp.eventosgo.dao;

import es.webapp.eventosgo.entity.Etiqueta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtiquetaRepository extends JpaRepository<Etiqueta,Integer> {
}
