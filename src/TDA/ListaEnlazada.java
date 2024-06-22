
package TDA;

import modelos.Expediente;

public class ListaEnlazada<T> {
     private Nodo L;

    public ListaEnlazada() {
        this.L = null;
    }

    public boolean estaVacia() {
        if (this.L == null) {
            return true;
        }
        return false;
    }

    public void mostrar() {
        Nodo ptr = this.L;
        while (ptr != null) {
            System.out.print(ptr.getValue() + " -> ");
            ptr = ptr.getNext();
        }
        System.out.println("");
    }

    public void insertar(Expediente expediente) {
        Nodo nuevo = new Nodo(expediente);

        if (estaVacia()) {
            this.L = nuevo;
        } else {
            Nodo ptr = this.L;
            while (ptr.getNext() != null) {
                ptr = ptr.getNext();
            }
            ptr.setNext(nuevo);
        }
    }

    public Expediente buscar(Expediente expediente) {
        Nodo ptr = this.L;
        while (ptr != null && ptr.getValue() != expediente) {
            ptr = ptr.getNext();
        }
        if (ptr == null) {
            return null;
        } else {
            return ptr.getValue();
        }
    }

}
