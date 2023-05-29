package week12.lesson1.example5;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Main2 {
    public static void main(String[] args) {

        LocalDate birthdate = LocalDate.parse("1989-05-26");
        long days = ChronoUnit.DAYS.between(LocalDate.now(), birthdate);
        System.out.println(Math.abs(days));

        Period period = Period.between(birthdate, LocalDate.now());
        System.out.println(period.getDays());
    }

}
