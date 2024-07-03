package modelos;

import Enums.TipoDependencia;
import Enums.TipoEstado;
import Enums.TipoExpediente;
import TDA.Colas;
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
    private Colas areas;

    public Expediente(String numeroExpediente, int prioridad, TipoExpediente tipoExpediente, TipoDependencia dependencia, String asunto, User user, File documentoReferencia, TiempoExpediente tiempoExpediente) {
        this.numeroExpediente = numeroExpediente;
        this.prioridad = prioridad;
        this.tipoExpediente = tipoExpediente;
        this.tipoDependencia = dependencia;
        this.estado = TipoEstado.ESPERA;
        this.user = user;
        this.asunto = asunto;
        this.areas = new Colas<TipoDependencia>(2);
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

    public Colas getAreas() {
        return areas;
    }

    public void setAreas(Colas areas) {
        this.areas = areas;
    }
    
}
