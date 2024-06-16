package modelos;

import java.time.LocalDateTime;

public class TiempoExpediente {

    private LocalDateTime fechaInicio;
    private LocalDateTime fechaFinal;
    
    public TiempoExpediente(){
        this.fechaInicio = LocalDateTime.MIN.minusDays(0);
        this.fechaFinal = LocalDateTime.MIN.minusDays(0);
    }
    
    public TiempoExpediente(LocalDateTime fechaInicio, LocalDateTime fechaFinal){
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
    }
    
    public void setFechaInicial(LocalDateTime fechaInicio){
        this.fechaInicio = fechaInicio;
    }
    
    public void setFechaFinal(LocalDateTime fechaFinal){
        this.fechaFinal = fechaFinal;
    }
    
    public LocalDateTime getFechaInicial(){
        return fechaInicio;
    }
    
    public LocalDateTime getFechaFinal(){
        return fechaFinal;
    }
}
