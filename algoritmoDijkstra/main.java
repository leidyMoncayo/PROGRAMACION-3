import java.util.ArrayList;
import java.util.List;

/**
 * Clase principal del programa.
 */
public class main {

    /**
     * Método principal que se ejecuta al iniciar el programa.
     * @param args Argumentos de línea de comandos.
     */
    public static void main(String[] args) {
        // Matriz de adyacencia que representa el grafo. Los valores representan los pesos de las aristas.
        int[][] matrizAdyacencia = {
                //   0  1  2  3  4  5  6  7  8
                /*0*/{0, 4, 0, 0, 0, 0, 0, 8, 0},
                /*1*/{4, 0, 8, 0, 0, 0, 0, 11, 0},
                /*2*/{0, 8, 0, 7, 0, 4, 0, 0, 2},
                /*3*/{0, 0, 7, 0, 9, 14, 0, 0, 0},
                /*4*/{0, 0, 0, 9, 0, 10, 0, 0, 0},
                /*5*/{0, 0, 4,14,10, 0, 2, 0, 0},
                /*6*/{0, 0, 0, 0, 0, 2, 0, 1, 6},
                /*7*/{8, 11, 0, 0, 0, 0, 1,0, 7},
                /*8*/{0, 0, 2, 0, 0, 0, 6, 7, 0}
        };

        // Lista para almacenar los nodos del grafo
        List<Nodo> grafo = new ArrayList<>();

        // Crear los nodos y añadirlos al grafo
        for (int i = 0; i < matrizAdyacencia.length; i++) {
            grafo.add(new Nodo(i));
        }

        // Crear las aristas basadas en la matriz de adyacencia
        for (int i = 0; i < matrizAdyacencia.length; i++) {
            for (int j = 0; j < matrizAdyacencia[i].length; j++) {
                int peso = matrizAdyacencia[i][j];
                if (peso > 0) {
                    grafo.get(i).vecinos.add(new arista(grafo.get(j), peso));
                }
            }
        }

        // Ejecutar el algoritmo de Dijkstra desde el nodo 0
        dijkstra.dijkstra(grafo, grafo.get(0));

        // Imprimir los resultados
        for (Nodo nodo : grafo) {
            System.out.println("Nodo: " + nodo.id + ", Distancia: " + nodo.distancia);
        }
    }
}
