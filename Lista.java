package eva2_2_lista;
public class Lista {
    private Nodo inicio, fin;
    public Lista(){
        inicio = null;     
        fin = null;
    } 
    public int size(){
    int tama = 0; // Se inicializa en 0
    /*Nodo temp = inicio;
    while(temp != null){
        tama +=1; 
        temp = temp.getSiguiente();
    }*/
        return tama;
    }
     public void agregar(int valor){ //agregar un nodo
        Nodo nuevo = new Nodo(valor);
        //1. Conocer el estado de la lista.
        //2. Si hay nodos, omvernos al final.
        //Verificar si la lista esta vacia:
        if(inicio == null ){ //Lista Vacia
            inicio = nuevo;
            fin = nuevo;
        }else{ //hay un millon de nodos.
               //movernos al nodo final de la lista.
            /*Nodo temp = inicio;
            while(temp.getSiguiente() != null){
                temp = temp.getSiguiente();
            }
            temp.setSiguiente(nuevo); //agregando el nodo al final*/
            fin.setSiguiente(nuevo);
            nuevo.setPrevio(fin);
            fin = nuevo;
        }
    }    
      public void imprimir(){
        Nodo temp = inicio;
        while(temp != null){
            System.out.print("[" + temp.getValor() + "]");
            temp = temp.getSiguiente();
        }
        System.out.println("");
    }
      public void imprimirInv(){
          Nodo temp = fin;
          while(temp!= null){
              System.out.println("[" + temp.getValor() + "]");
               temp = temp.getPrevio(); 
          }
      }
      public void insertarEn(int valor, int posi){
        //veritifcar el estado de la lista.
        //verificar la posicion
        //no podemos insertar nodos en una lista vacia
        if (inicio == null) {
        throw new RuntimeException("Lista vacía, no se pueden insertar nodos");
    } else {
        int tama = size(); 
        if (posi >= 0 && posi <= tama) { 
            Nodo nuevo = new Nodo(valor);
            if (posi == 0) {
                nuevo.setSiguiente(inicio);
                inicio.setPrevio(nuevo);
                inicio = nuevo;
            } else {
                // Mover temp al punto anterior
                Nodo temp = inicio; 
                for (int i = 0; i < posi -1; i++) {
                    temp = temp.getSiguiente();
                }
                nuevo.setSiguiente(temp);
                nuevo.setPrevio(temp.getPrevio());
                temp.getPrevio().setSiguiente(nuevo);
                temp.setPrevio(nuevo);
            }
        } else {  
            throw new RuntimeException("Posición incorrecta, no se pueden insertar nodos");
        }
        }
    }
       public void vaciarLista(){
        inicio = null;
        fin = null;
    }
       public boolean listaVacia(){
        if(inicio == null)
            return true;
        else
            return false;
    }
        public void borrarEn(int posi) {
            if (inicio == null) {
            throw new RuntimeException("Lista vacía, no hay nodos para borrar");
    }
            int tama = size();
            if (posi >= 0 && posi < tama) {
                if (posi == 0) {
                    if (tama == 1) {
                        vaciarLista();
            } else {
                inicio = inicio.getSiguiente();
                if (inicio != null) {
                    inicio.setPrevio(null); 
                }
            }
        } else {
            Nodo temp = inicio;
            for (int i = 0; i < posi - 1; i++) {
                temp = temp.getSiguiente();
            }
            Nodo nodoABorrar = temp.getSiguiente(); 
            temp.setSiguiente(nodoABorrar.getSiguiente());
            
            if (nodoABorrar.getSiguiente() != null) { 
                nodoABorrar.getSiguiente().setPrevio(temp);
            } 
            if (posi == (tama - 1)) {
                fin = temp;
            }  
        }
    } else {
        throw new RuntimeException("Posición incorrecta, no existe el nodo a borrar");
    }
}
        public int buscar(int valor ){
            int posicion = 0;
            Nodo temp = inicio;
    
            while (temp != null) {
            if (temp.getValor() == valor) {
            return posicion; 
        }
        
        temp = temp.getSiguiente();
        posicion++;
    }
        return -1;
}   
        public int buscarEn(int posi) {
    if (inicio == null) {
        throw new RuntimeException("Lista vacía, no hay nodos para buscar");
    }  
    int tama = size();   
    if (posi >= 0 && posi < tama) {       
        if (posi == 0) {
            return inicio.getValor();
        }        
        else {
            Nodo temp = inicio;           
            for (int i = 0; i < posi; i++) {
                temp = temp.getSiguiente();
            } 
            return temp.getValor();
        }       
    } else {
        throw new RuntimeException("Posición incorrecta, no existe el nodo en ese índice");
    }
}
    }
