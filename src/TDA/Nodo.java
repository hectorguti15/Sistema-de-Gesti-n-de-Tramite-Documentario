
package TDA;

import modelos.Expediente;


public class Nodo {

    private Expediente value;
    private Nodo next;

    public Nodo(Expediente value) {
        this.value = value;
        this.next = null;
    }

    public Expediente getValue() {
        return value;
    }

    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }
}
