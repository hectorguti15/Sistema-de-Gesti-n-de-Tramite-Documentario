package Servicio;

import modelos.Administrador;
import modelos.PersonaDependencia;

public class AdministradorServicio {

    public static Administrador administrador;

    static {
        administrador = new Administrador("Mario", "Lopez", "mlopez@gmail.com", "EDF173KZ", new PersonaDependencia[]{});
    }
}
