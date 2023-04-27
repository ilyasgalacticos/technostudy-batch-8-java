package week7.lesson4.example2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Student[] students = new Student[10000];
        int currentIndex = 0;

        while (true) {

            System.out.println("PRESS [1] TO ADD STUDENT");
            System.out.println("PRESS [2] TO LIST STUDENTS");
            System.out.println("PRESS [0] TO EXIT");

            String choice = in.next();

            if (choice.equals("1")) {

                if (currentIndex < students.length) {

                    System.out.println("Insert full name:");
                    String name = in.next();

                    System.out.println("Insert specialty:");
                    String specialty = in.next();

                    System.out.println("Insert grade:");
                    int grade = in.nextInt();

                    System.out.println("Insert gpa:");
                    double gpa = in.nextDouble();

                    Student student = new Student(name, specialty, grade, gpa);
                    students[currentIndex] = student;
                    currentIndex++;

                } else {
                    System.out.println("Database in full!");
                }

            } else if (choice.equals("2")) {

                for (int i = 0; i < currentIndex; i++) {
                    System.out.println(students[i].toString());
                }

            } else if (choice.equals("0")) {

                break;

            } else {
                System.out.println("Wrong Command!");
            }

        }

    }
}
