package clase7;

import java.util.Stack;

public class Pila {
    public static void main(String[] args) {

        //creacionn de la pila numeros enteros
        Stack<Integer> pila = new Stack<>();

        //verificar si la pila esta vacia
        System.out.println(pila.empty());//true

        //insertar elementos en la pila
        pila.push(8);
        pila.push(4);
        pila.push(9);
        pila.push(10);
        pila.push(6);

       

        //imprimir la pila
        System.out.println(pila);

        //Mostrar elemento que esta en el toppe de la pila sin removerlo
        System.out.println("Tope de la pila: " + pila.peek());

        //remover el elemneto que esta en el tope de la pila
        System.out.println("Elemento removido del tope de la pila: " + pila.pop());

        //imprimir la pila
        System.out.println(pila);

        //buscar y mostrar la posicion de un elemento dentro de la pila
        System.out.println(pila.search(10));
        System.out.println(pila.search(9));
        System.out.println(pila.search(4));
        System.out.println(pila.search(8));
        System.out.println(pila.search(50));
        //si al imprimir hay un -1 es que el elemento no se encuentra en la pila

        //verificar si la pila esta vacia
        System.out.println(pila.empty());//False

        //llamar al metodo para validar los parentesis
        
    }
}
