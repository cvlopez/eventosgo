package es.taw.eventosgospring.dto;

import javax.xml.bind.annotation.XmlTransient;
import java.util.List;

public class UsuarioDTO {
    private List<EventoDTO> eventoCollection;
    private String contrasena;
    private String nombre;
    private String correo;
    private int rol;
    private Integer id;
    private List<ConversacionDTO> conversacionList;
    private List<ConversacionDTO> conversacionList1;
    private UsuarioEventoDTO usuarioEvento;
    private List<EstudioDTO> estudioList;
    private List<EventoDTO> eventoList;
    private List<MensajeDTO> mensajeList;

    public UsuarioDTO() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @XmlTransient
    public List<ConversacionDTO> getConversacionList() {
        return conversacionList;
    }

    public void setConversacionList(List<ConversacionDTO> conversacionList) {
        this.conversacionList = conversacionList;
    }

    @XmlTransient
    public List<ConversacionDTO> getConversacionList1() {
        return conversacionList1;
    }

    public void setConversacionList1(List<ConversacionDTO> conversacionList1) {
        this.conversacionList1 = conversacionList1;
    }

    public UsuarioEventoDTO getUsuarioEvento() {
        return usuarioEvento;
    }

    public void setUsuarioEvento(UsuarioEventoDTO usuarioEvento) {
        this.usuarioEvento = usuarioEvento;
    }

    @XmlTransient
    public List<EstudioDTO> getEstudioList() {
        return estudioList;
    }

    public void setEstudioList(List<EstudioDTO> estudioList) {
        this.estudioList = estudioList;
    }

    @XmlTransient
    public List<EventoDTO> getEventoList() {
        return eventoList;
    }

    public void setEventoList(List<EventoDTO> eventoList) {
        this.eventoList = eventoList;
    }

    @XmlTransient
    public List<MensajeDTO> getMensajeList() {
        return mensajeList;
    }

    public void setMensajeList(List<MensajeDTO> mensajeList) {
        this.mensajeList = mensajeList;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getRol() {
        return rol;
    }

    public void setRol(int rol) {
        this.rol = rol;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setEventoCollection(List<EventoDTO> eventoCollection) {
        this.eventoCollection = eventoCollection;
    }
}
