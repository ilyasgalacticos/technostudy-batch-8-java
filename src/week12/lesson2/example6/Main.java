package week12.lesson2.example6;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Ilyas Zhuanyshev");
        student.setCity("Almaty");
        student.setBirthdate(new Date("26 May 1989"));

        System.out.println(student);
    }
}
