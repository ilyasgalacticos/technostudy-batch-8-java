package week9.lesson2.example7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Student st1 = new Student("John Student 1", "IT");
        Student st2 = new Student("John Student 2", "IT");
        Student st3 = new Student("John Student 3", "IT");
        Student st4 = new Student("John Student 4", "IT");
        Student st5 = new Student("John Student 5", "IT");
        Student st6 = new Student("John Student 6", "IT");
        Student st7 = new Student("John Student 7", "IT");
        Student st8 = new Student("John Student 8", "IT");

        University harvard = new University();
        harvard.setName("Harvard");
        harvard.enrollStudent(st1);
        harvard.enrollStudent(st2);
        harvard.enrollStudent(st3);
        harvard.enrollStudent(st4);

        harvard.printAllStudents();

    }
}
