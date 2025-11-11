import java.util.Arrays;

public class quickSort {

    /**
     * arr: El arreglo a ordenar.
     * limiteinferior: El índice de inicio del sub-arreglo.
     * limitesuperior: El índice final del sub-arreglo.
     */
    void quickSort(int arr[], int limiteinferior, int limitesuperior) {
        // La condición base para la recursividad:
        // solo ordenamos si la sub-lista tiene 2 o más elementos.
        if (limiteinferior < limitesuperior) {

            // indicepivote es el índice de partición, arr[indicepivote] está ahora en el
            // lugar correcto.
            int indicepivote = particion(arr, limiteinferior, limitesuperior);

            // Ordena recursivamente los elementos antes y después de la partición
            quickSort(arr, limiteinferior, indicepivote - 1); // Sub-arreglo izquierdo
            quickSort(arr, indicepivote + 1, limitesuperior); // Sub-arreglo derecho
        }
    }

    int particion(int arr[], int limiteinferior, int limitesuperior) {
        // Seleccionamos el pivote (aquí elegimos el último elemento)
        int valorPivote = arr[limitesuperior];
        // El índice del elemento más pequeño
        int i = (limiteinferior - 1);

        for (int j = limiteinferior; j < limitesuperior; j++) {
            // Si el elemento actual es más pequeño o igual al pivote
            if (arr[j] <= valorPivote) {
                i++;// Incrementamos el índice del elemento más pequeño

                // Intercambiamos arr[i] y arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Intercambiamos el pivote arr[limitesuperior] con el elemento en arr[i+1].
        // Esto pone el pivote en su posición correcta.
        int temp = arr[i + 1];
        arr[i + 1] = arr[limitesuperior];
        arr[limitesuperior] = temp;

        return i + 1;
    }

    public static void main(String args[]) {
        quickSort ob = new quickSort();
        int arr[] = { 1, 7, 4, 8, 34, 19, 12, 20 };

        System.out.println("Arreglo original:");
        System.out.println(Arrays.toString(arr));

        // Llama al método de ordenamiento. high es arr.length - 1
        ob.quickSort(arr, 0, arr.length - 1);

        System.out.println("Arreglo ordenado por Quick Sort:");
        System.out.println(Arrays.toString(arr));
    }
}