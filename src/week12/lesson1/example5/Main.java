package week12.lesson1.example5;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        LocalDate borrowedDate = LocalDate.now();
        LocalDate deadlineDate = borrowedDate.plusMonths(2).plusDays(20);

        LocalDate dayX = LocalDate.now().plusDays(45);

        System.out.println("Your deadline date is " + deadlineDate);
        System.out.println("Day X is : " + dayX);

        LocalDateTime dayY = LocalDateTime.now().plusDays(45).plusHours(12);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MMMM dd, EEEE, hh:mm:ss a");
        System.out.println(formatter.format(dayY));
    }
}
