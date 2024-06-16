
package modelos;

import Enums.TipoPrioridad;

public class Expediente {
    private int numeroExpediente;
    private TipoPrioridad prioridad;
    private User user;
    private String documento;
    private TiempoExpediente tiempoExpediente;
    
    
    
    public Expediente(int numeroExpediente, TipoPrioridad prioridad, User user, String documento, TiempoExpediente tiempoExpediente){
        this.numeroExpediente = numeroExpediente;
        this.prioridad = prioridad;
        this.user = user;
        this.documento = documento;
        this.tiempoExpediente = tiempoExpediente;
    }
    
    public void setNumeroExpediente(int numeroExpediente){
        this.numeroExpediente = numeroExpediente;
    }
    public int getNumeroExpediente(){
        return numeroExpediente;
    }
    
    public void setPrioridad(TipoPrioridad prioridad){
        this.prioridad = prioridad;
    }
    public TipoPrioridad getPrioridad(){
        return prioridad;
    }
    public void setUser(User user){
        this.user = user;
    }
    public User getUser(){
        return user;
    }
    
    public void setDocumento(String documento){
        this.documento = documento;
    }
    
    public String getDocumento(){
        return documento;
    }
    
    
    public void setTiempoExpediente(TiempoExpediente tiempoExpediente){
        this.tiempoExpediente = tiempoExpediente;
    }
    
    public TiempoExpediente getTiempoExpediente(){
        return tiempoExpediente;
    }
}
