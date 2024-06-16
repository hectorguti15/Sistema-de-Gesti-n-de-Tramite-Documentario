package modelos;

import TDA.Colas;

public class PersonaDependencia extends Persona {

    private int numeroTrabajador;
    //Sistema maximo de 100 tramites en cola
    private Colas colaExpedientes = new Colas(100);

    public PersonaDependencia(String nombre, String apellido, String correoElectronico, int numeroTrabajador) {
        super(nombre, apellido, correoElectronico);
        this.numeroTrabajador = numeroTrabajador;
    }

    public void setNumeroTrabajador(int numeroTrabajador) {
        this.numeroTrabajador = numeroTrabajador;
    }

    public int getNumeroTrabajador() {
        return numeroTrabajador;
    }
    
    public void registrarIngresoDependencia(){
        
    }
}
