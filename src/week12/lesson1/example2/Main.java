package week12.lesson1.example2;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.logging.SimpleFormatter;

public class Main {
    public static void main(String[] args) {

        LocalDate localDate = LocalDate.of(2023, 5, 28);
        System.out.println(localDate);

        String result = localDate.getDayOfMonth() + " " + localDate.getMonth() + " " + localDate.getYear();
        System.out.println(result);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd : MMMM : yyyy");
        System.out.println(dateTimeFormatter.format(localDate));

        DateTimeFormatter dateTimeFormatterWeek = DateTimeFormatter.ofPattern("E - F");
        System.out.println(dateTimeFormatterWeek.format(localDate));

    }
}
