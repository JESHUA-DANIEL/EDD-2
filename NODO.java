package eva2_10_arbol_binario;
public class NODO {
  private int valor;
   private NODO izquierda;
   private NODO derecha;   
    public NODO(){
        izquierda = null;
        derecha = null;
    }
    public NODO(int valor){
        this.valor = valor;
        this.derecha = null;
        this.izquierda = null;
        
    }
    public NODO(int valor, NODO derecha) {
        this.derecha = derecha;
    }
    public int getValor() {
        return valor;
    }
    public void setValor(int valor) {
        this.valor = valor;
    }
    public NODO getDerecha() {
        return derecha;
    }
    public void setDerecha(NODO derecha) {
        this.derecha = derecha;
    }
    public NODO getIzquierda() {
        return izquierda;
    }
    public void setIzquierda(NODO izquierda) {
        this.izquierda = izquierda;
    }
}  