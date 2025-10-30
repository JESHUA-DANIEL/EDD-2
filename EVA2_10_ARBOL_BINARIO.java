package eva2_10_arbol_binario;
public class EVA2_10_ARBOL_BINARIO {
    public static void main(String[] args) {
     Arbol arbol = new Arbol();
     arbol.agreegar(13);
     arbol.agreegar(10);
     arbol.agreegar(18);
     arbol.agreegar(2);
     arbol.agreegar(11);
     arbol.agreegar(17);
     arbol.agreegar(20);
     arbol.agreegar(16);
     System.out.println("cantidad de nodos"+arbol.size());
     arbol.imprimirPreOrder();
     System.out.println("");
     arbol.imprimirPosOrder();
     System.out.println("");
     arbol.imprimirInOrder();
    }    
}
