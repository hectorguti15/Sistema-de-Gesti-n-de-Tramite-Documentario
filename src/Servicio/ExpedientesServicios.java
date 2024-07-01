package Servicio;

import Enums.TipoDependencia;
import TDA.ListaEnlazada;
import TDA.Nodo;
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

    public static Expediente[] getExpedientes() {
        System.out.println("GET EXPEDIENTES");
        Expediente[] expedientesObtenidos = new Expediente[listaExpedientes.getLength()];
        System.out.println("GET EXPEDIENTES LEGNTH " + listaExpedientes.getLength());
        Nodo ptr = listaExpedientes.obtenerPrimero();
        for (int i = 0; i < listaExpedientes.getLength(); i++) {
            expedientesObtenidos[i] = (Expediente) ptr.getValue();
            ptr = ptr.getNext();
        }
        return expedientesObtenidos;
    }

    public static Expediente[] getExpedientesArea(TipoDependencia tipDependencia) {
        int count = 0;
        Nodo ptr = listaExpedientes.obtenerPrimero();
        while (ptr != null) {
            Expediente expediente = (Expediente) ptr.getValue();
            if (expediente.getTipoDependencia() == tipDependencia) {
                count++;
            }
            ptr = ptr.getNext();
        }
        Expediente[] expedientesAsignar = new Expediente[count];
        int index = 0;
        ptr = listaExpedientes.obtenerPrimero();
        while (ptr != null) {
            Expediente expediente = (Expediente) ptr.getValue();
            if (expediente.getTipoDependencia() == tipDependencia) {
                expedientesAsignar[index] = expediente;
                index++;
            }
            ptr = ptr.getNext();
        }

        return expedientesAsignar;
    }

}
