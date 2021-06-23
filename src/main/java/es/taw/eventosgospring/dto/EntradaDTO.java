package es.taw.eventosgospring.dto;

public class EntradaDTO {
    private Integer id;
    private EntradaAforoDTO entradaAforo;
    private EventoDTO idEvento;
    private UsuarioEventoDTO idUsuario;

    public EntradaDTO() {
    }

    public EntradaDTO(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public EntradaAforoDTO getEntradaAforo() {
        return entradaAforo;
    }

    public void setEntradaAforo(EntradaAforoDTO entradaAforo) {
        this.entradaAforo = entradaAforo;
    }

    public EventoDTO getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(EventoDTO idEvento) {
        this.idEvento = idEvento;
    }

    public UsuarioEventoDTO getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(UsuarioEventoDTO idUsuario) {
        this.idUsuario = idUsuario;
    }
}
