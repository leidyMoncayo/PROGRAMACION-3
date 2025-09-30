package tareaVector;

import java.util.Vector;
import java.util.Arrays;    

public class vector {
    public static void main(String[] args) {
        // Crear un vector de enteros
        Vector <Integer> v = new Vector<>();

        // Verificar si el vector está vacío
        System.out.println(v.isEmpty());//true

        // Agregar elementos al vector
        v.add(10);
        v.add(20);
        v.add(30);
        v.add(40);
        v.add(50);

        // Imprimir el vector
        System.out.println("Vector: " + v);

         // add(index, element): agrega elemento en posición específica
        v.add(1, 3);

        // Obtener el tamaño del vector
        System.out.println("Tamaño del vector: " + v.size());

        // capacity(): muestra la capacidad actual del vector
        System.out.println("Capacidad: " + v.capacity());

         // firstElement(): obtiene el primer elemento
        System.out.println("firstElement(): " + v.firstElement());

        // obtiene el elemento en la posición indicada
        System.out.println("Elemento en la posición 2: " + v.get(2));

         // contains(element): verifica si el vector contiene el elemento
        System.out.println("¿Contiene 50?: " + v.contains(50));

        // indexOf(element, fromIndex): busca el elemento desde una posición específica
        System.out.println("indexOf(2, 1): " + v.indexOf(2, 1));

        // Modificar un elemento por índice
        v.set(2, 99);
        System.out.println("Vector después de modificar la posición 2: " + v);

        // Eliminar un elemento por índice
        v.remove(1);
        System.out.println("Vector después de eliminar la posición 1: " + v);

        // Buscar la posición de un elemento
        System.out.println("Posición del elemento 99: " + v.indexOf(99));
        System.out.println("Posición del elemento 100: " + v.indexOf(100)); // -1 si no existe

        // eliminar todos los elementos del vector
        v.clear();
        System.out.println("Vector después de limpiar: " + v);
        System.out.println("¿Vector vacío?: " + v.isEmpty());

         // insertElementAt: inserta elemento en posición específica
        v.insertElementAt(9, 1);
        System.out.println("insertElementAt: " + v);

         // copyInto(array): copia los elementos del vector en un arreglo dado
        Integer[] arr = new Integer[v.size()];
        v.copyInto(arr);
        System.out.println("copyInto: " + Arrays.toString(arr));

        // elementAt(index): obtiene el elemento en la posición indicada
        System.out.println("elementAt(1): " + v.elementAt(1));

        // ensureCapacity(minCapacity): asegura que la capacidad mínima sea la indicada
        v.ensureCapacity(20);
        System.out.println("Capacidad tras ensureCapacity: " + v.capacity());

         // clone(): crea una copia del vector
        v.addAll(Arrays.asList(1,2,3));
        Vector<Integer> v2 = (Vector<Integer>) v.clone();
        System.out.println("Clonado: " + v2);

        // equals(Object): compara si dos vectores son iguales
        System.out.println("¿v igual a v2?: " + v.equals(v2));


    }
}

