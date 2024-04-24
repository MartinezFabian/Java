package controlstructures;

import java.util.Scanner;

public class TestIfInLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        String result = number % 2 == 0 ? " is even." : " is odd.";

        System.out.println("The number " + number + result);
    }
}
