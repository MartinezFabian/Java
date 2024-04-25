package arrays;


// Ejercicio: Dado el array {1, 2, 3, 4} invertir los valores. El primero en el final, el final en el primero y así con todos.


public class ExerciseArray {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4};
        int[] auxArray = new int[array.length];

        int j = array.length - 1;

        for (int i = 0; i < array.length; i++) {
            auxArray[i] = array[j];

            j--;
        }

        array = auxArray;

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }
}
