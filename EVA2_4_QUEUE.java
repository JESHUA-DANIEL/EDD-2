package eva2_4_queue;

public class EVA2_4_QUEUE {

    public static void main(String[] args) {
        // TODO code application logic here
        MyQueue cola = new MyQueue();
        cola.push(100);
        cola.push(200);
        cola.push(300);
        cola.push(400);
        System.out.println(cola.peek());
        System.out.println(cola.pop());
        cola.imprimir();
            
    }
    
}
