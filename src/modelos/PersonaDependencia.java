package modelos;

public class PersonaDependencia extends Persona {

    private int numeroTrabajador;

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
}
