package eva2_10_arbol_binario;
public class Arbol {
    private NODO raiz;
    private int cont;
    public Arbol(){
        cont=0;
        raiz=null;
    }
    public void agreegar(int valor){
        if(raiz == null){//VERIFICAR SI EL ARBOL ESTA VACIO
            NODO nuevo = new NODO(valor);
            raiz = nuevo;
            cont++;
        }else{
            agregarRecursivo(valor, raiz);
        }
    }
    private void agregarRecursivo(int valor, NODO actual){
        NODO nuevo = new NODO(valor);
        // VERIFICAR A QUE LADO DEL NODO VA
        if(valor < actual.getValor()){//va a la izquierda
            if(actual.getIzquierda() == null){
                actual.setIzquierda(nuevo);//agreamos el nodo
            }else{//esta ocupado
                agregarRecursivo(valor, actual.getIzquierda());
                cont++;
            }
        }else if(valor > actual.getValor()){// va a la derecha
             if(actual.getDerecha() == null){
                actual.setDerecha(nuevo);//agreamos el nodo
            }else{//esta ocupado
                agregarRecursivo(valor, actual.getDerecha());
                cont++;
            }
        }else{//es igual al nodo actual
            //no hago nada
        }
    }
    public int size (){
        return cont;
    }
    public void imprimirPreOrder (){
        imprimirPreOrderRec(raiz);
    }
    private void imprimirPreOrderRec(NODO actual){
        if(actual != null){
        System.out.print("["+actual.getValor()+"]");//visitar el nodo
        imprimirPreOrderRec(actual.getIzquierda());//lado izquierdo
        imprimirPreOrderRec(actual.getDerecha());// lado derecho
        }
    }
    public void imprimirPosOrder (){
        imprimirPosOrderRec(raiz);
    }
    private void imprimirPosOrderRec(NODO actual){
        if(actual != null){
        imprimirPosOrderRec(actual.getIzquierda());//lado izquierdo
        imprimirPosOrderRec(actual.getDerecha());// lado derecho
        System.out.print("["+actual.getValor()+"]");//visitar el nodo
        }
    }
    public void imprimirInOrder (){
        imprimirInOrderRec(raiz);
    }
     private void imprimirInOrderRec(NODO actual){
        if(actual != null){
        imprimirInOrderRec(actual.getIzquierda());//lado izquierdo
        System.out.print("["+actual.getValor()+"]");//visitar el nodo
        imprimirInOrderRec(actual.getDerecha());// lado derecho
        }
     }
}
