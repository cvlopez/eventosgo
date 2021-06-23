package es.taw.eventosgospring.dto;

import javax.xml.bind.annotation.XmlTransient;
import java.util.List;

public class EtiquetaDTO {
    private String nombre;
    private Integer id;
    private List<EventoEtiquetaDTO> eventoEtiquetaList;

    public EtiquetaDTO() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @XmlTransient
    public List<EventoEtiquetaDTO> getEventoEtiquetaList() {
        return eventoEtiquetaList;
    }

    public void setEventoEtiquetaList(List<EventoEtiquetaDTO> eventoEtiquetaList) {
        this.eventoEtiquetaList = eventoEtiquetaList;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
