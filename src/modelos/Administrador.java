package modelos;

public class Administrador extends Persona {

    private String numeroTrabajador;
    private PersonaDependencia[] personalDependencia;

    public Administrador(String nombre, String apellido, String correoElectronico, String numeroTrabajador, PersonaDependencia[] personalDependencia) {
        super(nombre, apellido, correoElectronico);
        this.numeroTrabajador = numeroTrabajador;
        this.personalDependencia = personalDependencia;
    }

    public void setNumeroTrabajador(String numeroTrabajador) {
        this.numeroTrabajador = numeroTrabajador;
    }

    public String getNumeroTrabajador() {
        return numeroTrabajador;
    }

    public void setPersonalDependencia(PersonaDependencia[] personalDependencia) {
        this.personalDependencia = personalDependencia;
    }

    public PersonaDependencia[] getPersonalDependencia() {
        
        return personalDependencia;
    }

    public boolean esAdministrador(String correoElectronico, String numeroTrabajador) {
        return this.getCorreoElectronico().equals(correoElectronico) && this.numeroTrabajador.equals(numeroTrabajador);
    }

}
