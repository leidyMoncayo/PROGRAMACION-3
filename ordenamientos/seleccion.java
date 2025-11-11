import java.util.Arrays;

public class seleccion {

    void selectionSort(int arr[]) {
        int n = arr.length;

        // Bucle externo: recorre todo el arreglo
        for (int i = 0; i < n - 1; i++) {
            
            // Asumimos que el elemento actual (arr[i]) es el mínimo.
            int minimo = i;

            // Bucle interno: encuentra el elemento más pequeño en el sub-arreglo restante (arr[i+1] a arr[n-1])
            for (int j = i + 1; j < n; j++) {
                // Compara el elemento actual con el mínimo encontrado hasta ahora
                if (arr[j] < arr[minimo]) {
                    // Si encontramos un elemento más pequeño, actualizamos el índice del mínimo
                    minimo = j;
                }
            }

            // Intercambia el elemento mínimo encontrado arr[minimo] con el elemento arr[i].
            // Esto coloca el mínimo en la posición correcta para esta pasada.

            // Si el índice del mínimo (minimo) es diferente del índice actual (i), hacemos el intercambio:
            if (minimo!= i) {
                int temp = arr[i];
                arr[i] = arr[minimo];
                arr[minimo] = temp;
            }
        }
    }

    public static void main(String args[]) {
        // Creamos una instancia para llamar al método no estático.
        seleccion ob = new seleccion(); 
        int arr[] = {1,7,4,8,34,19,12,20};

        System.out.println("Arreglo original:");
        System.out.println(Arrays.toString(arr));

        // Llama al método de ordenamiento
        ob.selectionSort(arr);

        System.out.println("Arreglo ordenado por Selección:");
        System.out.println(Arrays.toString(arr));
    }
}