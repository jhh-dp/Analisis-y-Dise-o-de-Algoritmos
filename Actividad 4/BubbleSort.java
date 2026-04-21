import java.util.Scanner;
import java.util.Arrays;

public class BubbleSort {

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        int temp;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // intercambio
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de elementos: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // ingresar datos
        for (int i = 0; i < n; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Arreglo original: " + Arrays.toString(arr));
	// ordenamiento
        bubbleSort(arr);

        System.out.println("Arreglo ordenado: " + Arrays.toString(arr));

        sc.close();
    }
}