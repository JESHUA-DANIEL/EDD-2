package eva2_3_double_linked_list_tipos_genericos;
public class Lista<T> {
    private Nodo<T> inicio, fin;
    public Lista() {
        inicio = null;
        fin = null;
    }
    public boolean listaVacia() {
        return inicio == null;
    }
    public void vaciarLista() {
        inicio = null;
        fin = null;
    }
    public int size() {
        int tama = 0;
        Nodo<T> temp = inicio;
        while (temp != null) {
            tama++;
            temp = temp.getSiguiente();
        }
        return tama;
    }
    public void agregar(T valor) {
        Nodo<T> nuevo = new Nodo<>(valor);
        if (inicio == null) {
            inicio = nuevo;
            fin = nuevo;
        } else {
            fin.setSiguiente(nuevo);
            nuevo.setPrevio(fin);
            fin = nuevo;
        }
    }
    public void imprimir() {
        Nodo<T> temp = inicio;
        while (temp != null) {
            System.out.print("[" + temp.getValor() + "]");
            temp = temp.getSiguiente();
        }
        System.out.println("");
    }
    public void imprimirInv() {
        Nodo<T> temp = fin;
        while (temp != null) {
            System.out.print("[" + temp.getValor() + "]");
            temp = temp.getPrevio();
        }
        System.out.println("");
    }
    public void insertarEn(T valor, int posi) {
        int tama = size();

        if (posi < 0 || posi > tama) {
            throw new RuntimeException("Posición incorrecta, no se pueden insertar nodos");
        }
        Nodo<T> nuevo = new Nodo<>(valor);
        if (posi == 0) {
            if (inicio == null) {
                inicio = fin = nuevo;
            } else {
                nuevo.setSiguiente(inicio);
                inicio.setPrevio(nuevo);
                inicio = nuevo;
            }
            return;
        }
        if (posi == tama) {
            fin.setSiguiente(nuevo);
            nuevo.setPrevio(fin);
            fin = nuevo;
            return;
        }
        Nodo<T> temp = inicio;
        for (int i = 0; i < posi; i++) {
            temp = temp.getSiguiente();
        }
        nuevo.setPrevio(temp.getPrevio());
        nuevo.setSiguiente(temp);
        temp.getPrevio().setSiguiente(nuevo);
        temp.setPrevio(nuevo);
    }
    public void borrarEn(int posi) {
        int tama = size();
        if (listaVacia()) {
            throw new RuntimeException("Lista vacía, no hay nodos para borrar");
        }
        if (posi < 0 || posi >= tama) {
            throw new RuntimeException("Posición incorrecta, no existe el nodo a borrar");
        }
        if (posi == 0) {
            if (inicio == fin) { // solo un elemento
                vaciarLista();
            } else {
                inicio = inicio.getSiguiente();
                inicio.setPrevio(null);
            }
            return;
        }
        if (posi == tama - 1) {
            fin = fin.getPrevio();
            fin.setSiguiente(null);
            return;
        }
        Nodo<T> temp = inicio;
        for (int i = 0; i < posi; i++) {
            temp = temp.getSiguiente();
        }
        temp.getPrevio().setSiguiente(temp.getSiguiente());
        temp.getSiguiente().setPrevio(temp.getPrevio());
    }
    public int buscar(T valor) {
        int posicion = 0;
        Nodo<T> temp = inicio;
        while (temp != null) {
            if (temp.getValor().equals(valor)) {
                return posicion;
            }
            temp = temp.getSiguiente();
            posicion++;
        }
        return -1;
    }
    public T buscarEn(int posi) {
        int tama = size();
        if (listaVacia()) {
            throw new RuntimeException("Lista vacía, no hay nodos para buscar");
        }
        if (posi < 0 || posi >= tama) {
            throw new RuntimeException("Posición incorrecta, no existe el nodo en ese índice");
        }

        Nodo<T> temp = inicio;
        for (int i = 0; i < posi; i++) {
            temp = temp.getSiguiente();
        }
        return temp.getValor();
    }
}