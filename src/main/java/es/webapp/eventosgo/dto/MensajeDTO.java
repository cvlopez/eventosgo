package es.webapp.eventosgo.dto;

import java.util.Date;

public class MensajeDTO {
    private Date fecha;
    private Date hora;
    private String texto;
    private int visto;
    private Integer id;
    private ConversacionDTO idConversacion;
    private UsuarioDTO idUsuario;

    public MensajeDTO() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public ConversacionDTO getIdConversacion() {
        return idConversacion;
    }

    public void setIdConversacion(ConversacionDTO idConversacion) {
        this.idConversacion = idConversacion;
    }

    public UsuarioDTO getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(UsuarioDTO idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public int getVisto() {
        return visto;
    }

    public void setVisto(int visto) {
        this.visto = visto;
    }
}
