package arrays;

/* Ejercicio: Pedir al usuario el número de filas y columnas de la matriz, luego pedir
 el valor de cada posición de la matriz e imprimirla.
 */

import java.util.Scanner;

public class TwoDimensionalArrays {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresar el número de filas: ");
        int rows = scanner.nextInt();

        System.out.print("Ingresar el número de columnas: ");
        int columns = scanner.nextInt();

        int[][] matrix = new int[rows][columns];

        // Load matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Ingresar el valor numerico de la posición [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Print matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println("");
        }
    }
}
