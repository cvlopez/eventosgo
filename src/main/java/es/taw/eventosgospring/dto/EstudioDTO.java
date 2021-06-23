package es.taw.eventosgospring.dto;

public class EstudioDTO {
    private String titulo;
    private String resultado;
    private Integer id;
    private UsuarioDTO idAnalista;

    public EstudioDTO() {
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public UsuarioDTO getIdAnalista() {
        return idAnalista;
    }

    public void setIdAnalista(UsuarioDTO idAnalista) {
        this.idAnalista = idAnalista;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

}
