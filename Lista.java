package eva2_2_lista_tipos_genericos;
public class Lista<T> {
    private Nodo<T> inicio;
    private Nodo<T> fin;
    public Lista() {
        inicio = null;
        fin = null;
    }
    // O(1)
    public boolean listaVacia() {
        return inicio == null;
    }
    // O(1)
    public void vaciarLista() {
        inicio = null;
        fin = null;
    }
    // O(N)
    public int size() {
        int tama = 0;
        Nodo<T> temp = inicio;
        while (temp != null) {
            tama++;
            temp = temp.getSiguiente();
        }
        return tama;
    }
    // O(1)
    public void agregar(T valor) {
        Nodo<T> nuevo = new Nodo<>(valor);
        if (listaVacia()) {
            inicio = nuevo;
            fin = nuevo;
        } else {
            fin.setSiguiente(nuevo);
            fin = nuevo;
        }
    }
    // O(N)
    public void imprimir() {
        Nodo<T> temp = inicio;
        while (temp != null) {
            System.out.print(" [ " + temp.getValor() + " ] ");
            temp = temp.getSiguiente();
        }
        System.out.println();
    }
    // O(N^2)
    public void imprimirInverso() {
        int longitud = size();
        for (int i = longitud - 1; i >= 0; i--) {
            Nodo<T> temp = inicio;
            for (int j = 0; j < i; j++) {
                temp = temp.getSiguiente();
            }
            System.out.print(" [ " + temp.getValor() + " ] ");
        }
        System.out.println();
    }
    // O(N)
    public void insertarEn(T valor, int posi) {
        int tama = size();
        if (posi < 0 || posi > tama) {
            throw new RuntimeException("Posición incorrecta, no se puede insertar el nodo.");
        }
        Nodo<T> nuevo = new Nodo<>(valor);
        if (posi == 0) {
            nuevo.setSiguiente(inicio);
            inicio = nuevo;
            if (fin == null) fin = nuevo; // lista estaba vacía
        } else if (posi == tama) {
            fin.setSiguiente(nuevo);
            fin = nuevo;
        } else {
            Nodo<T> temp = inicio;
            for (int i = 0; i < posi - 1; i++) {
                temp = temp.getSiguiente();
            }
            nuevo.setSiguiente(temp.getSiguiente());
            temp.setSiguiente(nuevo);
        }
    }
    // O(N)
    public void borrarEn(int posi) {
        if (listaVacia()) {
            throw new RuntimeException("Lista vacía, no se pueden borrar nodos.");
        }
        int tama = size();
        if (posi < 0 || posi >= tama) {
            throw new RuntimeException("Posición incorrecta, no se puede borrar el nodo.");
        }
        if (posi == 0) {
            if (inicio == fin) {
                vaciarLista();
            } else {
                inicio = inicio.getSiguiente();
            }
        } else {
            Nodo<T> temp = inicio;
            for (int i = 0; i < posi - 1; i++) {
                temp = temp.getSiguiente();
            }
            Nodo<T> aux = temp.getSiguiente();
            temp.setSiguiente(aux.getSiguiente());
            if (posi == tama - 1) {
                fin = temp;
            }
        }
    }
    // O(N)
    public int buscar(T valor) {
        if (listaVacia()) {
            throw new RuntimeException("La lista está vacía, no se puede buscar.");
        }
        Nodo<T> temp = inicio;
        int cont = 0;
        while (temp != null) {
            if (temp.getValor().equals(valor)) {
                return cont;
            }
            temp = temp.getSiguiente();
            cont++;
        }
        return -1; // no encontrado
    }
    // O(N)
    public T buscarEn(int posi) {
        if (listaVacia()) {
            throw new RuntimeException("Lista vacía, no hay nodos para buscar.");
        }
        int tama = size();
        if (posi < 0 || posi >= tama) {
            throw new RuntimeException("Posición incorrecta, no existe el nodo en ese índice.");
        }
        Nodo<T> temp = inicio;
        for (int i = 0; i < posi; i++) {
            temp = temp.getSiguiente();
        }
        return temp.getValor();
    }
}