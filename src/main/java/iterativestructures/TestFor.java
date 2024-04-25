package iterativestructures;

import java.util.Scanner;

public class TestFor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int limit = scanner.nextInt();

        for (int i = 1; i <= limit; i++) {
            System.out.println(i);
        }
    }
}
