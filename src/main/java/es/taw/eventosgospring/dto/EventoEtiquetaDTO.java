package es.taw.eventosgospring.dto;

public class EventoEtiquetaDTO {
    private Integer id;
    private EtiquetaDTO idEtiqueta;
    private EventoDTO idEvento;

    public EventoEtiquetaDTO() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public EtiquetaDTO getIdEtiqueta() {
        return idEtiqueta;
    }

    public void setIdEtiqueta(EtiquetaDTO idEtiqueta) {
        this.idEtiqueta = idEtiqueta;
    }

    public EventoDTO getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(EventoDTO idEvento) {
        this.idEvento = idEvento;
    }
}
