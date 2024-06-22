package Servicio;

import TDA.ListaEnlazada;
import modelos.Expediente;
import modelos.Expedientes;

public class ExpedientesServicios {

    public static ListaEnlazada<Expediente> listaExpedientes = new ListaEnlazada<>();
    public static Expedientes expedientes = new Expedientes(listaExpedientes);

    public static void agregarExpediente(Expediente agregarExpediente) {
        expedientes.agregarExpediente(agregarExpediente);
    }
    
    public static void removerExpediente(Expediente agregarExpediente) {
        expedientes.removerExpediente(agregarExpediente);
    }

}
