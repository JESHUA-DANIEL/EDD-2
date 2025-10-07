package eva2_2_lista;
public class EVA2_2_LISTA {
    public static void main(String[] args) {
        long ini, fin, tiempo;
       // int [] arreglo = new int[1000000];
       Lista miLista=new Lista();
       miLista.agregar(100);
       miLista.agregar(200);
       miLista.agregar(300);
       miLista.agregar(400);
       miLista.agregar(500);
       miLista.buscar(400);
       miLista.imprimir();
       System.out.println("Cantidad de nodos: " + miLista.size());
       miLista.vaciarLista();
       miLista.imprimir();
       System.out.println("Cantidad de nodos: " + miLista.size());
       miLista.agregar(1);
       miLista.agregar(2);
       miLista.agregar(3);
       miLista.imprimir();
       System.out.println("Cantidad de nodos: " + miLista.size());
       miLista.insertarEn(9999, 0);
       miLista.borrarEn(2);
       miLista.imprimir();
       System.out.println("Cantidad de nodos: " + miLista.size());
        
        /*ini = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
           arreglo[i] = (int)(Math.random()*1000);
        }
        fin = System.nanoTime();
        tiempo = fin - ini;
        System.out.print(" Tiempo del arreglo: " + tiempo);
        
        ini = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            miLista.agregar((int) (int)(Math.random()*1000));
        }
        fin = System.nanoTime();
        tiempo = fin - ini;
        System.out.print(" tiempo del arreglo: "+tiempo);**/
    }

}
