package week12.lesson1.example3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy, HH:mm:ss");
        System.out.println(formatter.format(localDateTime));

        LocalTime time = LocalTime.now();
        System.out.println(time);

        LocalTime lessonTime = LocalTime.of(22, 59);
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("hh : mm a");
        System.out.println("Your class is starting at " + timeFormatter.format(lessonTime));

    }
}
