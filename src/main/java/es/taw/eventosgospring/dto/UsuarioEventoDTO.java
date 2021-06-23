package es.taw.eventosgospring.dto;

import javax.xml.bind.annotation.XmlTransient;
import java.util.Date;
import java.util.List;

public class UsuarioEventoDTO {
    private String apellidos;
    private String domicilio;
    private String ciudad;
    private Date fechaNacimiento;
    private int sexo;
    private Integer id;
    private List<EntradaDTO> entradaList;
    private UsuarioDTO usuario;

    public UsuarioEventoDTO() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @XmlTransient
    public List<EntradaDTO> getEntradaList() {
        return entradaList;
    }

    public void setEntradaList(List<EntradaDTO> entradaList) {
        this.entradaList = entradaList;
    }

    public UsuarioDTO getUsuario() {
        return usuario;
    }

    public void setUsuario(UsuarioDTO usuario) {
        this.usuario = usuario;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getSexo() {
        return sexo;
    }

    public void setSexo(int sexo) {
        this.sexo = sexo;
    }
}
