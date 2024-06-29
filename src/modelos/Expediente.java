package modelos;

import Enums.TipoDependencia;
import Enums.TipoEstado;
import Enums.TipoExpediente;
import java.io.File;

public class Expediente {

    private String numeroExpediente;
    private int prioridad;
    private TipoExpediente tipoExpediente;
    private TipoDependencia tipoDependencia;
    private TipoEstado estado;
    private User user;
    private String asunto;
    private File documentoReferencia;
    private TiempoExpediente tiempoExpediente;

    public Expediente(String numeroExpediente, int prioridad, TipoExpediente tipoExpediente, String asunto, User user, File documentoReferencia, TiempoExpediente tiempoExpediente) {
        this.numeroExpediente = numeroExpediente;
        this.prioridad = prioridad;
        this.tipoExpediente = tipoExpediente;
        this.tipoDependencia = TipoDependencia.POR_ASIGNAR;
        this.estado = TipoEstado.ESPERA;
        this.user = user;
        this.asunto = asunto;
        this.documentoReferencia = documentoReferencia;
        this.tiempoExpediente = tiempoExpediente;
    }

    public Expediente() {
        throw new UnsupportedOperationException("No inicializado");
    }

    public void setNumeroExpediente(String numeroExpediente) {
        this.numeroExpediente = numeroExpediente;
    }

    public String getNumeroExpediente() {
        return numeroExpediente;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
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

    public TipoExpediente getTipoExpediente() {
        return tipoExpediente;
    }

    public void setTipoExpediente(TipoExpediente tipoExpediente) {
        this.tipoExpediente = tipoExpediente;
    }

    public File getDocumentoReferencia() {
        return documentoReferencia;
    }

    public void setDocumentoReferencia(File documentoReferencia) {
        this.documentoReferencia = documentoReferencia;
    }

    public TipoDependencia getTipoDependencia() {
        return tipoDependencia;
    }

    public void setTipoDependencia(TipoDependencia tipoDependencia) {
        this.tipoDependencia = tipoDependencia;
    }

    public TipoEstado getEstado() {
        return estado;
    }

    public void setEstado(TipoEstado estado) {
        this.estado = estado;
    }
}
