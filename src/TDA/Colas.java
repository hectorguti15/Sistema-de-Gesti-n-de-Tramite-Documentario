
package TDA;

import modelos.Expediente;


public class Colas<T> {

    private T[] lista;
    private int front; // posicion del inicio
    private int back;  // posicion del final
    private int MAX_SIZE;

    public Colas(int MAX_SIZE) {
        this.MAX_SIZE = MAX_SIZE;
        this.lista = (T[]) new Object[MAX_SIZE]; 
        front = -1;
        back = -1;
    }
    
    public T[] obtenerLista(){
        return lista;
    }
    
    public boolean estaVacia() {
        return front == -1 && back == -1;
    }

    public boolean estaLlena() {
        return (back + 1) == front || ((front == 0) && (back == MAX_SIZE - 1));
    }

    public void encolar(T item) {
        if (!estaLlena()) {
            if (estaVacia()) {
                front = 0;
                back = 0;
            } else if (back != MAX_SIZE - 1) {
                back++;
            } else {
                back = 0;
            }
            lista[back] = item;
        }
    }

    public T desencolar() {
        if (!estaVacia()) {
            T item = lista[front];
            if (front == back) {
                front = -1;
                back = -1;
            } else if (front != MAX_SIZE - 1) {
                front++;
            } else {
                front = 0;
            }
            return item;
        } else {
            System.out.println("La cola esta vacia");
            return null;
        }
    }

    public void mostrarCola() {
        for (int i = 0; i < MAX_SIZE; i++) {
            System.out.print(" | " + lista[i]);
        }
        System.out.println("");
    }

}
