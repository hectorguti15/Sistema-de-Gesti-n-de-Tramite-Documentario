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

    public T[] obtenerLista() {
        return lista;
    }

    public int getMAX_SIZE() {
        return MAX_SIZE;
    }

    public void setMaxSize(int MAX_SIZE) {
        this.MAX_SIZE = MAX_SIZE;
    }

    public boolean estaVacia() {
        return front == -1 && back == -1;
    }

    public boolean estaLlena() {
        return (back + 1) == front || ((front == 0) && (back == MAX_SIZE - 1));
    }

    public void encolar(T item) {
        System.out.println("MAXSIZE" + this.MAX_SIZE);
        if (!estaLlena()) {
            System.out.println("1");
            if (estaVacia()) {
                front = 0;
                back = 0;
            } else if (back != MAX_SIZE - 1) {
                back++;
            } else {
                back = 0;
            }
            System.out.println("2");
            lista[back] = item;
            System.out.println("3");
        }
    }

    public T desencolar() {
        if (estaVacia()) {
            System.out.println("La cola está vacía");
            return null;
        }
        System.out.println("Desencolaaaaaar 131313");
        T item = lista[front];
        lista[front] = null; // Elimina el elemento

        if (front == back) {
            // La cola se vacía completamente
            front = -1;
            back = -1;
        } else if (front != MAX_SIZE - 1) {
            front++;
        } else {
            front = 0;
        }

        // Filtrar la cola para eliminar valores nulos y mantener el orden
        filtrarCola();

        return item;
    }

    public void expandirCapacidad() {
        int nuevoTamaño = MAX_SIZE * 2;
        T[] nuevaLista = (T[]) new Object[nuevoTamaño];
        for (int i = 0; i < MAX_SIZE; i++) {
            nuevaLista[i] = lista[(front + i) % MAX_SIZE];
        }
        this.lista = nuevaLista;
        this.MAX_SIZE = nuevoTamaño;

    }

    public void mostrarCola() {
        for (int i = 0; i < MAX_SIZE; i++) {
            System.out.print(" | " + lista[i]);
        }
        System.out.println("");
    }

    public T obtenerPrimero() {
        return this.lista[0];
    }

    public int getLength() {
        if (estaVacia()) {
            return 0;
        }

        int count = 0;
        int index = front;

        while (true) {
            if (lista[index] != null) {
                count++;
            }
            if (index == back) {
                break;
            }
            index = (index + 1) % MAX_SIZE;
        }

        return count;
    }

    private void filtrarCola() {
        if (estaVacia()) {
            return;
        }

        T[] nuevaLista = (T[]) new Object[MAX_SIZE];
        int index = 0;
        int i = front;

        while (true) {
            if (lista[i] != null) {
                nuevaLista[index++] = lista[i];
            }
            if (i == back) {
                break;
            }
            i = (i + 1) % MAX_SIZE;
        }

        front = 0;
        back = index - 1;
        lista = nuevaLista;
    }

}
