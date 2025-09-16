package clase7;

import java.util.Stack;

public class Pila {
    public static void main(String[] args) {

        //creacioin de la pila numeros enteros
        Stack<Integer> Pila = new Stack<>();

        //insertar elementos en la pila
        Pila.push(8);
        Pila.push(4);
        Pila.push(9);
        Pila.push(10);
        Pila.push(6);

        //imprimir la pila
        System.out.println(Pila);

        
    }
}
