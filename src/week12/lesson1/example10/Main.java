package week12.lesson1.example10;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Insert first date in YYYY-MM-DD format:");
        String firstDate = in.nextLine();

        System.out.println("Insert second date in YYYY-MM-DD format:");
        String secondDate = in.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate dateOne = LocalDate.from(formatter.parse(firstDate));
        LocalDate dateTwo = LocalDate.from(formatter.parse(secondDate));

        long daysBetween = ChronoUnit.DAYS.between(dateOne, dateTwo);

        System.out.println(Math.abs(daysBetween) + " days between your inputted dates");

    }
}
