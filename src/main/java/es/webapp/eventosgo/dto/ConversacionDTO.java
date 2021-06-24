package es.webapp.eventosgo.dto;

import java.util.List;

public class ConversacionDTO {
    private String asunto;
    private Integer id;
    private UsuarioDTO idUsuario;
    private UsuarioDTO idTeleoperador;
    private List<MensajeDTO> mensajeList;

    public String getAsunto() {
        return asunto;
    }

    public Integer getId() {
        return id;
    }

    public UsuarioDTO getIdUsuario() {
        return idUsuario;
    }

    public UsuarioDTO getIdTeleoperador() {
        return idTeleoperador;
    }

    public List<MensajeDTO> getMensajeList() {
        return mensajeList;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setIdUsuario(UsuarioDTO idUsuario) {
        this.idUsuario = idUsuario;
    }

    public void setIdTeleoperador(UsuarioDTO idTeleoperador) {
        this.idTeleoperador = idTeleoperador;
    }

    public void setMensajeList(List<MensajeDTO> mensajeList) {
        this.mensajeList = mensajeList;
    }
}
