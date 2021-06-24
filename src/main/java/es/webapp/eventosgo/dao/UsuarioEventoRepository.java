package es.webapp.eventosgo.dao;

import es.webapp.eventosgo.entity.UsuarioEvento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioEventoRepository extends JpaRepository<UsuarioEvento, Integer> {

}
