
package modelos;

public class Expediente {
    private int identificador;
    private int prioridad;
    private User user;
    private String documento;
    private TiempoExpediente tiempoExpediente;
    
    
    
    public Expediente(int identificador, int prioridad, User user, String documento, TiempoExpediente tiempoExpediente){
        this.identificador = identificador;
        this.prioridad = prioridad;
        this.user = user;
        this.documento = documento;
        this.tiempoExpediente = tiempoExpediente;
    }
}
