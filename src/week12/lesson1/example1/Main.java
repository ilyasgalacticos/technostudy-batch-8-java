package week12.lesson1.example1;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        LocalDate birthDate = LocalDate.of(1989, 5, 26);
        System.out.println(birthDate);

        Student student = new Student();
        student.setFullName("Ilyas Zhuanyshev");
        student.setCity("Almaty");
        student.setBirthdate(LocalDate.of(1989, 5,26));

        System.out.println(student);

    }

}
