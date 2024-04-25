package iterativestructures;

import java.util.Scanner;

public class TestWhile {

    public static void main(String[] args) {

        System.out.print("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int limit = scanner.nextInt();

        int i = 1;

        while (i <= limit) {
            System.out.println(i);
            i++;
        }
    }
}
