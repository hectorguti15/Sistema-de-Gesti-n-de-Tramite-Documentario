package modelos;

import Enums.TipoIdentificacion;
import TDA.Colas;

public class User extends Persona {

    //Si es trabajador ingresara su código ulima, sino su dni, y si es institución su RUC
    private TipoIdentificacion tipoIdentificacion;
    private String numeroIdentificacion;
    private Colas expedientes;
    

    public User(String nombre, String apellido, String correoElectronico, TipoIdentificacion tipoIdentificacion, String numeroIdentificacion) {
        super(nombre, apellido, correoElectronico);
        this.tipoIdentificacion = tipoIdentificacion;
        this.numeroIdentificacion = numeroIdentificacion;
        this.expedientes = new Colas<Expediente>(1);

    }

    public void setTipoIdentificacion(TipoIdentificacion tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    public TipoIdentificacion getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public void setNumeroIdentificacion(String numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public String getNumeroIdentificacion() {
        return numeroIdentificacion;

    }
    public void agregarExpediente(Expediente expediente){
        this.expedientes.encolar(expediente);
    }
    public Colas getExpedientes(){
        return expedientes;
    }

}
