package es.taw.eventosgospring.dao;

import es.taw.eventosgospring.entity.Estudio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstudioRepository extends JpaRepository<Estudio,Integer> {
}
