package parcial2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ExamenColaMapa {

    static class ColaCircularEnteros {
        private int[] datos;
        private int cabeza;
        private int cola;
        private int tam;

        public ColaCircularEnteros(int capacidad) {
            datos = new int[capacidad];//arreglo para almacenar los elementos de la cola
            cabeza = 0;//posicion del primer elemento de la cola 
            cola = 0;// posicion donde se inserta el sig elemento 
            tam = 0;// num de elementos en la cola
        }

        public boolean estaVacia() {
            return tam == 0;
        }

        public boolean estaLlena() {
            return tam == datos.length;
        }

        public void encolar(int x) {
            if (estaLlena())
                throw new IllegalStateException(" Cola llena");//verifica si la cola esta llena
            datos[cola] = x;
            cola = (cola + 1) % datos.length;//actualiza la posicion de la cola
            tam++;//incrementa el tamaño de la cola
        }

        public int desencolar() {
            if (estaVacia())
                throw new IllegalStateException(" Cola vacia ");
            int v = datos[cabeza];
            cabeza = (cabeza + 1) % datos.length;//actualiza la posicion de la cabeza
            tam--;//decrementa el tamaño de la cola
            return v;
        }
    }

    // (50 pts) Calcula el balance de p a r n t e s i s encolando +1 y -1.
    public static int balanceConCola(String s) {
        // TODO : usar ColaCircularEnteros para encolar y luego sumar
        ColaCircularEnteros cola = new ColaCircularEnteros(s.length());//itera sobre cada caracter de la cadena s

        for (int i = 0; i < s.length(); i++) {
            char parentesis = s.charAt(i);
            if (parentesis == '(') {
                cola.encolar(1);//si es un parentesis de apertura encola 1
            } 
                else if (parentesis== ')') {
                cola.encolar(-1);//si es un parentesis de cierre encola -1
            }
        }
        return 0;//retorna 0 si la cola esta vacia o si desencola
    }

    // (50 pts) Registra intentos por nombre en un mapa .
    public static int registrarIntento(Map<String, Integer> intentos,String nombre) {
        // TODO : incrementar si existe o iniciar en 1 si no existe
        if (intentos.containsKey (nombre)) {//verifica
            int cont= intentos.get(nombre);
            intentos.put(nombre, cont + 1);
            return cont + 1;
        }
        else {//si no esxiste el nombre en el mapa inicia en 1
            intentos.put(nombre, 1);
            return 1;//retorna 1 si no existe el nombre en el mapa
        }

}
            
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cadena = sc.nextLine();
        System.out.println(" Balance cola : " + balanceConCola(cadena));

        Map<String, Integer> intentos = new HashMap<String, Integer>();

        System.out.println(" Intentos (Ana): " + registrarIntento(intentos, "Ana"));
        System.out.println(" Intentos (Ana): " + registrarIntento(intentos, "Ana"));
        sc.close();
    }
}
