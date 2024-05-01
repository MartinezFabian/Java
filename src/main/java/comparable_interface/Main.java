package comparable_interface;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student[] students = {
                new Student("John", 23),
                new Student("Fabian", 22),
                new Student("Michael", 21),
                new Student("Sarah", 24)
        };

        //Arrays.sort(students);
        Util.order(students);

        for (Student student: students) {
            System.out.println(student);
        }

        Integer[] numbers = {5, 3, 2, 6, 1};

        Util.order(numbers);

        for (Integer number: numbers) {
            System.out.println(number);
        }
    }
}
