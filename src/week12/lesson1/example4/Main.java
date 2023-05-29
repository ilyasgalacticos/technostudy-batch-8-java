package week12.lesson1.example4;

import java.time.LocalDate;
import java.time.Period;

public class Main {
    public static void main(String[] args) {
        LocalDate birthdate = LocalDate.parse("1985-08-29");
        Period period = Period.between(birthdate, LocalDate.now());

        System.out.println(period.getYears() + " years, "
                + period.getMonths()
                + " month and "
                + period.getDays() + " days");

        Student student = new Student();
        student.setFullName("Cristiano Ronaldo");
        student.setCity("Madeira");
        student.setBirthdate(LocalDate.parse("1985-02-05"));

        System.out.println(student);

    }
}
