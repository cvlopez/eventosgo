package es.taw.eventosgospring.dto;

import javax.xml.bind.annotation.XmlTransient;
import java.util.Date;
import java.util.List;

public class EventoDTO {
    private String titulo;
    private String descripcion;
    private Date fechaEvento;
    private Date fechaFinReservas;
    private double coste;
    private int maximoEntradasUsuario;
    private int aforo;
    private Integer id;
    private List<EventoEtiquetaDTO> eventoEtiquetaList;
    private EventoAforoDTO eventoAforo;
    private List<EntradaDTO> entradaList;
    private UsuarioDTO idCreador;

    public EventoDTO() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getFechaEvento() {
        return fechaEvento;
    }

    public void setFechaEvento(Date fechaEvento) {
        this.fechaEvento = fechaEvento;
    }

    public Date getFechaFinReservas() {
        return fechaFinReservas;
    }

    public void setFechaFinReservas(Date fechaFinReservas) {
        this.fechaFinReservas = fechaFinReservas;
    }


    public int getMaximoEntradasUsuario() {
        return maximoEntradasUsuario;
    }

    public void setMaximoEntradasUsuario(int maximoEntradasUsuario) {
        this.maximoEntradasUsuario = maximoEntradasUsuario;
    }


    @XmlTransient
    public List<EventoEtiquetaDTO> getEventoEtiquetaList() {
        return eventoEtiquetaList;
    }

    public void setEventoEtiquetaList(List<EventoEtiquetaDTO> eventoEtiquetaList) {
        this.eventoEtiquetaList = eventoEtiquetaList;
    }

    public EventoAforoDTO getEventoAforo() {
        return eventoAforo;
    }

    public void setEventoAforo(EventoAforoDTO eventoAforo) {
        this.eventoAforo = eventoAforo;
    }

    @XmlTransient
    public List<EntradaDTO> getEntradaList() {
        return entradaList;
    }

    public void setEntradaList(List<EntradaDTO> entradaList) {
        this.entradaList = entradaList;
    }

    public UsuarioDTO getIdCreador() {
        return idCreador;
    }

    public void setIdCreador(UsuarioDTO idCreador) {
        this.idCreador = idCreador;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getCoste() {
        return coste;
    }

    public void setCoste(double coste) {
        this.coste = coste;
    }

    public int getAforo() {
        return aforo;
    }

    public void setAforo(int aforo) {
        this.aforo = aforo;
    }
}
