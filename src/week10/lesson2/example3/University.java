package week10.lesson2.example3;

import java.util.InputMismatchException;

public class University {

    private Student[] students = new Student[5];
    private int size = 0;

    public void addStudent(Student student) throws ArrayIndexOutOfBoundsException, InputMismatchException, ArithmeticException {
        students[size] = student;
        size++;
    }

}
