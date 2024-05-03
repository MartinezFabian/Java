package collections.arraylist;

import java.util.ArrayList;

public class ArrayLists {

    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<>();

        studentList.add(new Student("John", 23));
        studentList.add(new Student("Fabian", 22));
        studentList.add(new Student("Michael", 21));

        Student firstStudent = studentList.get(0);
        System.out.println("First Student: " + firstStudent);

        studentList.get(2).setName("Michael Jackson");
        System.out.println("Modified Student: " + studentList.get(2).getName());

        boolean isEmpty = studentList.isEmpty();
        System.out.println("The list is empty: " + isEmpty);

        int size = studentList.size();
        System.out.println("List size: " + size);

        studentList.remove(1);

        // for
        System.out.println("List of students using for: ");
        for (int i = 0; i < studentList.size(); i++) {
            System.out.println(studentList.get(i));
        }

        // forEach
        System.out.println("List of students using forEach: ");
        for (Student student: studentList) {
            System.out.println(student);
        }

    }
}
