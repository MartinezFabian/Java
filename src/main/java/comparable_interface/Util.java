package comparable_interface;

public class Util {
    public static void order(Comparable[] arr) {
        boolean isSorted = false;

        while (!isSorted) {
            isSorted = true;

            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i + 1].compareTo(arr[i]) < 0) {
                    Comparable temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    isSorted = false;
                }
            }
        }
    }
}
