package modelos;

import TDA.ListaEnlazada;
import TDA.Nodo;

public class Expedientes {

    private ListaEnlazada<Expediente> expedientes;

    public Expedientes(ListaEnlazada<Expediente> expedientes) {
        this.expedientes = expedientes;
    }

    public void agregarExpediente(Expediente expedienteAgregar) {
        this.expedientes.insertar(expedienteAgregar);
        this.expedientes.mostrar();
        ordenarExpedientesPorPrioridad();
    }

    public void removerExpediente(Expediente expedienteEliminar) {
        this.expedientes.eliminar(expedienteEliminar);
        ordenarExpedientesPorPrioridad();
    }
    
  
    private void ordenarExpedientesPorPrioridad() {
        
        if (expedientes.estaVacia()) {
 
            return;
        }
        Nodo<Expediente> ptr = expedientes.obtenerPrimero();

        while (ptr != null && ptr.getNext() != null) {
    
            if (ptr.getValue().getPrioridad() > ptr.getNext().getValue().getPrioridad()) {
                Expediente temp = ptr.getValue();
                ptr.setValue(ptr.getNext().getValue());
                ptr.getNext().setValue(temp);
            }
            ptr = ptr.getNext();
        }
    }
}
