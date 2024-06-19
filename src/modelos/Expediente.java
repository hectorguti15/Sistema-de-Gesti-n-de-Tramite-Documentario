package modelos;

import Enums.TipoPrioridad;
import java.io.File;

public class Expediente {

    private int numeroExpediente;
    private TipoPrioridad prioridad;
    private User user;
    private String asunto;
    private File documentoReferencia;
    private TiempoExpediente tiempoExpediente;

    public Expediente(int numeroExpediente, TipoPrioridad prioridad, String asunto, User user, File documentoReferencia, TiempoExpediente tiempoExpediente) {
        this.numeroExpediente = numeroExpediente;
        this.prioridad = prioridad;
        this.user = user;
        this.asunto = asunto;
        this.documentoReferencia = documentoReferencia;
        this.tiempoExpediente = tiempoExpediente;
    }

    public void setNumeroExpediente(int numeroExpediente) {
        this.numeroExpediente = numeroExpediente;
    }

    public int getNumeroExpediente() {
        return numeroExpediente;
    }

    public void setPrioridad(TipoPrioridad prioridad) {
        this.prioridad = prioridad;
    }

    public TipoPrioridad getPrioridad() {
        return prioridad;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setDocumento(File documentoReferencia) {
        this.documentoReferencia = documentoReferencia;
    }

    public File getDocumento() {
        return documentoReferencia;
    }

    public void setTiempoExpediente(TiempoExpediente tiempoExpediente) {
        this.tiempoExpediente = tiempoExpediente;
    }

    public TiempoExpediente getTiempoExpediente() {
        return tiempoExpediente;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getAsunto() {
        return asunto;
    }
}
