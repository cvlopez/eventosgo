package es.taw.eventosgospring.dto;

public class EventoAforoDTO {
    private int filas;
    private int asientos;
    private Integer id;
    private EventoDTO evento;

    public EventoAforoDTO() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public EventoDTO getEvento() {
        return evento;
    }

    public void setEvento(EventoDTO evento) {
        this.evento = evento;
    }

    public int getFilas() {
        return filas;
    }

    public void setFilas(int filas) {
        this.filas = filas;
    }

    public int getAsientos() {
        return asientos;
    }

    public void setAsientos(int asientos) {
        this.asientos = asientos;
    }
}
