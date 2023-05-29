package week12.lesson1.example8;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Main {

    public static void main(String[] args) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MMMM dd, hh:mm:ss a");
        LocalDateTime time = LocalDateTime.now();

        System.out.println(formatter.format(time));
        time = time.plus(30, ChronoUnit.HOURS);
        System.out.println(formatter.format(time));

    }

}
