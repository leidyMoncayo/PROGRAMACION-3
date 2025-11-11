import java.util.Arrays;

public class insercion {

    void OrdenamientoInsercion(int arr[]) {
        int n = arr.length;

        // El bucle externo comienza en 1, asumiendo que el índice 0 ya está ordenado.
        for (int i = 1; i < n; i++) {

            // llave es el elemento actual que queremos insertar en la porción ordenada.
            int llave = arr[i];
            int j = i - 1;

            /*
             * Mueve los elementos del arr[0..i-1] que son mayores que la llave
             * una posición a la derecha de su posición actual.
             */
            while (j >= 0 && arr[j] > llave) {
                // Desplaza el elemento arr[j] a la derecha.
                arr[j + 1] = arr[j];
                j = j - 1;
            }

            // Inserta la lave (el elemento actual) en su posición correcta.
            arr[j + 1] = llave;
        }
    }

    public static void main(String args[]) {
        // Creamos una instancia para llamar al método no estático.
        insercion ob = new insercion();
        int arr[] = { 1, 7, 4, 8, 34, 19, 12, 20 };

        System.out.println("Arreglo original:");
        System.out.println(Arrays.toString(arr));

        // Llama al método de ordenamiento
        ob.OrdenamientoInsercion(arr);

        System.out.println("Arreglo ordenado por Inserción:");
        System.out.println(Arrays.toString(arr));
    }
}