import java.util.Arrays;

public class burbuja {

    void ordenamientoBurbuja(int arr[]) {
        int n = arr.length;

        // Bucle externo: controla el número de pasadas (siempre n-1 pasadas)
        for (int i = 0; i < n - 1; i++) {
            
            // Bucle interno: realiza las comparaciones e intercambios
            // (n - i - 1) porque después de cada pasada, el elemento más grande ya está en su posición final.
            for (int j = 0; j < n - i - 1; j++) {
                // Compara elementos adyacentes
                if (arr[j] > arr[j + 1]) {// Si están en el orden incorrecto, los intercambia
                    int temp = arr[j];//guarda el valor actual en una variable temporal
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            //el bucle externo continuará ejecutándo hasta que i complete todas las n-1 iteraciones,
        }
    }
  
    public static void main(String args[]) {
        burbuja ob = new burbuja();
        int arr[] = {1,7,4,8,34,19,12,20};
        
        System.out.println("Arreglo original:");
        System.out.println(Arrays.toString(arr));

        // Llama al método de ordenamiento
        ob.ordenamientoBurbuja(arr);

        System.out.println("Arreglo ordenado:");
        System.out.println(Arrays.toString(arr));
    }
}