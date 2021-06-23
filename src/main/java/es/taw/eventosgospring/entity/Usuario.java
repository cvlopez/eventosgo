package es.taw.eventosgospring.entity;

import es.taw.eventosgospring.dto.UsuarioDTO;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Usuario {
    private Integer id;
    private String correo;
    private String contrasena;
    private String nombre;
    private Integer rol;
    private Collection<Conversacion> conversacionsById;
    private Collection<Conversacion> conversacionsById_0;
    private Collection<Estudio> estudiosById;
    private Collection<Evento> eventosById;
    private Collection<Mensaje> mensajesById;
    private UsuarioEvento usuarioEventoById;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "CORREO", nullable = false, length = 50)
    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Basic
    @Column(name = "CONTRASENA", nullable = false, length = 30)
    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    @Basic
    @Column(name = "NOMBRE", nullable = false, length = 50)
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Basic
    @Column(name = "ROL", nullable = false)
    public Integer getRol() {
        return rol;
    }

    public void setRol(Integer rol) {
        this.rol = rol;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(id, usuario.id) && Objects.equals(correo, usuario.correo) && Objects.equals(contrasena, usuario.contrasena) && Objects.equals(nombre, usuario.nombre) && Objects.equals(rol, usuario.rol);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, correo, contrasena, nombre, rol);
    }

    @OneToMany(mappedBy = "usuarioByIdTeleoperador")
    public Collection<Conversacion> getConversacionsById() {
        return conversacionsById;
    }

    public void setConversacionsById(Collection<Conversacion> conversacionsById) {
        this.conversacionsById = conversacionsById;
    }

    @OneToMany(mappedBy = "usuarioByIdUsuario")
    public Collection<Conversacion> getConversacionsById_0() {
        return conversacionsById_0;
    }

    public void setConversacionsById_0(Collection<Conversacion> conversacionsById_0) {
        this.conversacionsById_0 = conversacionsById_0;
    }

    @OneToMany(mappedBy = "usuarioByIdAnalista")
    public Collection<Estudio> getEstudiosById() {
        return estudiosById;
    }

    public void setEstudiosById(Collection<Estudio> estudiosById) {
        this.estudiosById = estudiosById;
    }

    @OneToMany(mappedBy = "usuarioByIdCreador")
    public Collection<Evento> getEventosById() {
        return eventosById;
    }

    public void setEventosById(Collection<Evento> eventosById) {
        this.eventosById = eventosById;
    }

    @OneToMany(mappedBy = "usuarioByIdUsuario")
    public Collection<Mensaje> getMensajesById() {
        return mensajesById;
    }

    public void setMensajesById(Collection<Mensaje> mensajesById) {
        this.mensajesById = mensajesById;
    }

    @OneToOne(mappedBy = "usuarioById")
    public UsuarioEvento getUsuarioEventoById() {
        return usuarioEventoById;
    }

    public void setUsuarioEventoById(UsuarioEvento usuarioEventoById) {
        this.usuarioEventoById = usuarioEventoById;
    }

    @Transient
    public UsuarioDTO getDTO(){
        UsuarioDTO dto = new UsuarioDTO();
        dto.setCorreo(correo);
        dto.setContrasena(contrasena);
        dto.setRol(rol);
        return dto;
    }
}
