package es.webapp.eventosgo.dto;

public class EntradaAforoDTO {
    private int fila;
    private int asiento;
    private Integer id;
    private EntradaDTO entrada;

    public EntradaAforoDTO() {
    }

    public EntradaAforoDTO(Integer id) {
        this.id = id;
    }

    public EntradaAforoDTO(Integer id, int fila, int asiento) {
        this.id = id;
        this.fila = fila;
        this.asiento = asiento;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public EntradaDTO getEntrada() {
        return entrada;
    }

    public void setEntrada(EntradaDTO entrada) {
        this.entrada = entrada;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getAsiento() {
        return asiento;
    }

    public void setAsiento(int asiento) {
        this.asiento = asiento;
    }
}
