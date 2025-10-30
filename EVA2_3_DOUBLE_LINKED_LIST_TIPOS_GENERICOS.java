package eva2_3_double_linked_list_tipos_genericos;
public class EVA2_3_DOUBLE_LINKED_LIST_TIPOS_GENERICOS {
    public static void main(String[] args) {
        Lista<String> lista = new Lista<>();
        lista.agregar("A");
        lista.agregar("B");
        lista.agregar("C");
        lista.imprimir(); // [A][B][C]
        lista.insertarEn("X", 1);
        lista.imprimir(); // [A][X][B][C]
        lista.borrarEn(2);
        lista.imprimir(); // [A][X][C]
        System.out.println("Elemento en pos 1: " + lista.buscarEn(1)); // X
        System.out.println("Posición de 'C': " + lista.buscar("C")); // 2
    }   
}