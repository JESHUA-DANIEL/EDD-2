package eva2_2_lista;
public class Nodo {
    private int valor;
   private Nodo siguiente;
   private Nodo previo;
    public Nodo(){
        siguiente = null;
        previo = null;
    }
    public Nodo(int valor){
        this.valor = valor;
        this.siguiente = null;
        this.previo = null;   
    }
    public Nodo(int valor, Nodo siguiente) {
        this.siguiente = siguiente;
    }
    public int getValor() {
        return valor;
    }
    public void setValor(int valor) {
        this.valor = valor;
    }
    public Nodo getSiguiente() {
        return siguiente;
    }
    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    public Nodo getPrevio() {
        return previo;
    }
    public void setPrevio(Nodo previo) {
        this.previo = previo;
    }  
}
