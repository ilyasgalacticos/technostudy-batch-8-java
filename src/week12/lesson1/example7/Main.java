package week12.lesson1.example7;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {

        LocalDate localDate = LocalDate.parse("2023-02-12");
        LocalDateTime localDateTime = localDate.atStartOfDay();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MMMM.yyyy hh:mm:ss a");
        System.out.println(formatter.format(localDateTime));

    }
}
