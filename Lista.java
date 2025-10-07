package eva2_2_lista;
public class Lista {
    private Nodo inicio;
    private Nodo fin;
    public Lista() { //LISTA VACIA
        inicio = null;
        fin = null;
    }
    //O(N)
    public void agregar(int valor) {//Agregar un nodo
        //1.Conocer el estado de la lista 
        //2.Si hay nodos movernos al final
        //VERIFICA SI LA LISTA ESTA VACIA
        Nodo nuevo = new Nodo(valor);
        if (inicio == null) {//LISTA VACIA
            inicio = nuevo;
            fin = nuevo;
        } else {
            /*Movernos al nodo final de la lista
            Nodo temp = inicio;
            while (temp.getSiguiente() != null) {
                temp = temp.getSiguiente();
            }
            temp.setSiguiente(nuevo);*/
            fin.setSiguiente(nuevo);
            fin = nuevo;
        }
    }
    //O(N)
    public void imprimir() {
        Nodo temp = inicio;
        while (temp != null) {
            System.out.print(" [ " + temp.getValor() + " ] ");
            temp = temp.getSiguiente();
        }
    }
    public int size() {
        int tama = 0;
        Nodo temp = inicio;
        while (temp != null) {
            tama += 1;
            temp = temp.getSiguiente();
        }
        return tama;
    }
    //O(1)
    public void vaciarLista() {
        inicio = null;
        fin = null;
    }
    //O(N)
public void insertarEn(int valor, int posi) {
//VERIFICAR EL ESTADO DE LA LISTA
//VERIFICAR LA POSICION
// NO PODEMOS INSERTAR NODOS EN UNA LISTA VACIO
if(inicio == null){
    throw new RuntimeException("Lista vacia, no se pueden insertar nodos");
}else {//VERIFICAR LA POSICION
            //CUALES SON LAS POSICIONES INICIAL Y FINAL DE LA LISTA?
            int tama = size();
            if(posi>=0 && posi < tama){
                Nodo nuevo = new Nodo();
                if(posi == 0){
                    nuevo.setSiguiente(inicio);
                    inicio = nuevo;
                }else{
                    Nodo temp = inicio;
                int cont = 0;
                while(cont < (posi-1)){
                    temp = temp.getSiguiente();
                    cont++;
                }
                nuevo.setSiguiente(temp.getSiguiente());
                temp.setSiguiente(nuevo);
            }/*else
                throw new RuntimeException("Posicion incorrecta, no se pueden insertar nodos");
}*/
}
}
}
//O(1)
public static boolean listaVacia(){
    if(inicio == null){
        return true;
    }else{
        return false;
    }
}
//O(N)
public void borrarEn(int posi){
if(inicio == null){
    throw new RuntimeException("Lista vacia, no se pueden borrar nodos");
}else {//VERIFICAR LA POSICION
            //CUALES SON LAS POSICIONES INICIAL Y FINAL DE LA LISTA?
            int tama = size();
            if(posi>=0 && posi < tama){
                if(posi == 0){
                  if(tama ==1){//un solo nodo en la lista
                      vaciarLista();
                  }else{
                      inicio = inicio.getSiguiente();
                  }
                }else{
                    Nodo temp = inicio;
                int cont = 0;
                while(cont < (posi-1)){
                    temp = temp.getSiguiente();
                    cont++;
                }
                Nodo aux = temp.getSiguiente();
                temp.setSiguiente(aux.getSiguiente());
                if(posi == (tama -1)){//verificar que borramos el ultimo nodo
                    fin = temp;
}
            }
            }
}
}
public int buscar(int valor){//buscar el valor en la lista
    Nodo temp = inicio;
    int cont = 0;
        while (temp !=null) {
            temp = temp.getSiguiente();
            if(temp.getValor() != valor){
            cont++;
            }   
        }
        return cont;
}
public int buscarEn(int posi){
   if(inicio == null){
    throw new RuntimeException("Lista vacia, no se pueden borrar nodos");
}else {//VERIFICAR LA POSICION
            //CUALES SON LAS POSICIONES INICIAL Y FINAL DE LA LISTA?
            int tama = size();
            if(posi>=0 && posi < tama){
                if(posi == 0){
                  if(tama ==1){//un solo nodo en la lista
                      vaciarLista();
                  }else{
                      inicio = inicio.getSiguiente();
                  }
                }else{
                    Nodo temp = inicio;
                int cont = 0;
                while(cont < posi){
                    temp = temp.getSiguiente();
                    cont++;
                }
                Nodo aux = temp.getSiguiente();
                temp.setSiguiente(aux.getSiguiente());
                if(posi == (tama -1)){//verificar que borramos el ultimo nodo
                    fin = temp;
} 
}
}
}
}
}

            


