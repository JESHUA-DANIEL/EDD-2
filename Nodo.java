package eva2_3_double_linked_list_tipos_genericos;
public class Nodo<T> {
     private T valor;
    private Nodo<T> siguiente;
    private Nodo<T> previo;
    public Nodo(T valor) {
        this.valor = valor;
        this.siguiente = null;
        this.previo = null;
    }
    public T getValor() {
        return valor;
    }
    public void setValor(T valor) {
        this.valor = valor;
    }
    public Nodo<T> getSiguiente() {
        return siguiente;
    }
    public void setSiguiente(Nodo<T> siguiente) {
        this.siguiente = siguiente;
    }
    public Nodo<T> getPrevio() {
        return previo;
    }
    public void setPrevio(Nodo<T> previo) {
        this.previo = previo;
    }
}
