package modelos;

import TDA.Colas;

public class PersonaDependencia extends Persona {

    private String numeroTrabajador;
    

    public PersonaDependencia(String nombre, String apellido, String correoElectronico, String numeroTrabajador) {
        super(nombre, apellido, correoElectronico);
        this.numeroTrabajador = numeroTrabajador;
    }

    public void setNumeroTrabajador(String numeroTrabajador) {
        this.numeroTrabajador = numeroTrabajador;
    }

    public String getNumeroTrabajador() {
        return numeroTrabajador;
    }
    
    public void registrarIngresoDependencia(){
        
    }
}
