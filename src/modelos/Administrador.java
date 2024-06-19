
package modelos;

public class Administrador extends Persona{
    private int numeroTrabajador;
    private PersonaDependencia[] personalDependencia; 
    
    public Administrador(String nombre, String apellido, String correoElectronico,int numeroTrabajador, PersonaDependencia[] personalDependencia){
        super(nombre, apellido, correoElectronico);
        this.numeroTrabajador = numeroTrabajador;
        this.personalDependencia = personalDependencia;
    }
    
    public void setNumeroTrabajador(int numeroTrabajador){
        this.numeroTrabajador = numeroTrabajador;
    }
    
    public int getNumeroTrabajador(){
        return numeroTrabajador;
    }
    
    public void setPersonalDependencia(PersonaDependencia[] personalDependencia){
        this.personalDependencia = personalDependencia; 
    }
    
    public PersonaDependencia[] getPersonalDependencia(){
        return personalDependencia;
    }

}
