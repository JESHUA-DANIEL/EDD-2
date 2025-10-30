package eva2_9_collections;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.TreeSet;
public class EVA2_9_COLLECTIONS {
    public static void main(String[] args) {
        // int double boolean char
        // Integer Double Boolean Char
        LinkedList<String> miLista = new LinkedList<String>(); 
        miLista.add("hola");
        miLista.add("");
        miLista.add("mundo");
        miLista.add("");
        miLista.add("cruel");
        System.out.println(miLista);
        System.out.println(miLista.size());
        miLista.remove(0);
        System.out.println(miLista);
        System.out.println(miLista.size());
        //ARRAYLIST
        ArrayList<Integer> miArrayList = new ArrayList<Integer>();
        miArrayList.add(100);
        miArrayList.add(200);
        miArrayList.add(300);
        miArrayList.add(400);
        miArrayList.add(500);
        System.out.println(miArrayList);
        miArrayList.remove(0);
        System.out.println(miArrayList.size());
        //CONJUNTOS
          TreeSet<Integer> miConjunto = new TreeSet<Integer>();
          miConjunto.add(100);
          miConjunto.add(200);
          miConjunto.add(300);
          miConjunto.add(400);
          miConjunto.add(500);
          System.out.println(miConjunto);
        System.out.println(miConjunto.size());
    }
}