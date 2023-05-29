package week12.lesson1.example6;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {

        String date1 = "2023.01.21";
        String date2 = "26 May 21";

        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("yyyy.MM.dd");
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("dd MMM yy");

        LocalDate localDate1 = LocalDate.from(format1.parse(date1));
        LocalDate localDate2 = LocalDate.from(format2.parse(date2));

        System.out.println(localDate1);
        System.out.println(localDate2);

        long days = ChronoUnit.DAYS.between(localDate1, localDate2);
        System.out.println(Math.abs(days));

    }
}
