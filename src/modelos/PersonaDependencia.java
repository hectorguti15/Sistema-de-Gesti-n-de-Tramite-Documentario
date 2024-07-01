package modelos;

import Enums.TipoDependencia;

public class PersonaDependencia extends Persona {

    private String numeroTrabajador;
    private TipoDependencia tipoDepenedencia;

    public PersonaDependencia(String nombre, String apellido, String correoElectronico, String numeroTrabajador, TipoDependencia tipoDependencia) {
        super(nombre, apellido, correoElectronico);
        this.numeroTrabajador = numeroTrabajador;
        this.tipoDepenedencia = tipoDependencia;
    }

    public PersonaDependencia() {
        super("", "", "");
        throw new UnsupportedOperationException("No inicializado.");
    }

 
    public void setNumeroTrabajador(String numeroTrabajador) {
        this.numeroTrabajador = numeroTrabajador;
    }

    public String getNumeroTrabajador() {
        return numeroTrabajador;
    }

    public TipoDependencia getTipoDepenedencia() {
        return tipoDepenedencia;
    }

    public void setTipoDepenedencia(TipoDependencia tipoDepenedencia) {
        this.tipoDepenedencia = tipoDepenedencia;
    }

}
