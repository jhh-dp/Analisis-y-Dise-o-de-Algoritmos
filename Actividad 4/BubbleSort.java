import java.util.Scanner;
import java.util.Arrays;

public class BubbleSort {

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        int temp;

        boolean deteccion;

        int comparaciones = 0;
        int intercambios = 0;

        for (int i = 0; i < n - 1; i++) {
            deteccion = false;

            for (int j = 0; j < n - i - 1; j++) {

                // contador de comparaciones
                comparaciones++;

                if (arr[j] > arr[j + 1]) {
                    // intercambio
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    intercambios++; // contador de intercambios
                    deteccion = true;
                }
            }

            if (!deteccion) {
                break;
            }
        }

        // resultados finales
        System.out.println("Comparaciones: " + comparaciones);
        System.out.println("Intercambios: " + intercambios);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de elementos: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        System.out.println("\nArreglo original: " + Arrays.toString(arr));

        bubbleSort(arr);

        System.out.println("Arreglo ordenado: " + Arrays.toString(arr));

        sc.close();
    }
}