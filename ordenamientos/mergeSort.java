import java.util.Arrays;

public class mergeSort {

    /*
     * arreglo: El arreglo original.
     * indiceIzquierdo: El inicio del primer sub-arreglo.
     * puntoMedio: El final del primer sub-arreglo.
     * indiceDerecho: El final del segundo sub-arreglo.
     */
    void mezcla(int arreglo[], int indiceIzquierdo, int puntoMedio, int indiceDerecho) {
        
        // --- 1. Calcular tamaños y crear arreglos temporales ---
        int tamañoSub1 = puntoMedio - indiceIzquierdo + 1;
        int tamañoSub2 = indiceDerecho - puntoMedio;

        int[] parteIzquierda = new int[tamañoSub1];
        int[] parteDerecha = new int[tamañoSub2];

        // Copiar datos a los arreglos temporales
        for (int i = 0; i < tamañoSub1; ++i) {
            parteIzquierda[i] = arreglo[indiceIzquierdo + i];
        }
        for (int j = 0; j < tamañoSub2; ++j) {
            parteDerecha[j] = arreglo[puntoMedio + 1 + j];
        }

        //  2. Mezclar los arreglos temporales
        int i = 0, j = 0; // Índices para parteIzquierda y parteDerecha
        int k = indiceIzquierdo; // Índice para el arreglo original (donde se guarda la mezcla)

        while (i < tamañoSub1 && j < tamañoSub2) {
            // Compara y toma el elemento más pequeño
            if (parteIzquierda[i] <= parteDerecha[j]) {
                arreglo[k] = parteIzquierda[i];
                i++;
            } else {
                arreglo[k] = parteDerecha[j];
                j++;
            }
            k++; // Avanza el índice del arreglo principal
        }

        //  3. Copiar elementos restantes (si alguno sobra)
        while (i < tamañoSub1) {
            arreglo[k] = parteIzquierda[i];
            i++;
            k++;
        }

        // Si sobran elementos en la parte derecha, cópialos
        while (j < tamañoSub2) {
            arreglo[k] = parteDerecha[j];
            j++;
            k++;
        }
    }
 
    void ordenarPorMezcla(int arr[], int indiceIzquierdo, int indiceDerecho) {
        
        // Condición de parada (caso base): si el segmento tiene al menos 2 elementos
        if (indiceIzquierdo < indiceDerecho) {
            
            // Encuentra el punto medio para dividir el arreglo
            // Usamos esta fórmula para evitar desbordamiento de enteros grandes:
            int puntoMedio = indiceIzquierdo + (indiceDerecho - indiceIzquierdo) / 2;

            // 1. Llamada recursiva para ordenar la primera mitad (izquierda)
            ordenarPorMezcla(arr, indiceIzquierdo, puntoMedio);
            
            // 2. Llamada recursiva para ordenar la segunda mitad (derecha)
            ordenarPorMezcla(arr, puntoMedio + 1, indiceDerecho);

            // 3. Una vez ordenadas las mitades, se mezclan 
            mezcla (arr, indiceIzquierdo, puntoMedio, indiceDerecho);
        }
    }

        public static void main(String args[]) {
        mergeSort miOrdenador = new mergeSort();
        int[] misNumeros = {1,7,4,8,34,19,12,20};

        System.out.println("Arreglo original: " + Arrays.toString(misNumeros));

        // Inicia el proceso de ordenamiento de todo el arreglo
        miOrdenador.ordenarPorMezcla(misNumeros, 0, misNumeros.length - 1);

        System.out.println("Arreglo ordenado: " + Arrays.toString(misNumeros));
    }
}