package controlstructures;

import java.util.Scanner;

public class SwitchWithConstants {
    public static final int MONDAY = 1;
    public static final int TUESDAY = 2;
    public static final int WEDNESDAY = 3;
    public static final int THURSDAY = 4;
    public static final int FRIDAY = 5;
    public static final int SATURDAY = 6;
    public static final int SUNDAY = 7;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a day of the week (1-7): ");
        int dayInput = scanner.nextInt();

        String result = "";

        switch (dayInput) {
            case MONDAY:
                result = "Monday";
                break;
            case TUESDAY:
                result = "Tuesday";
                break;
            case WEDNESDAY:
                result = "Wednesday";
                break;
            case THURSDAY:
                result = "Thursday";
                break;
            case FRIDAY:
                result = "Friday";
                break;
            case SATURDAY:
                result = "Saturday";
                break;
            case SUNDAY:
                result = "Sunday";
                break;

            default:
                result = "Invalid day";
        }

        System.out.println(result);
    }
}
