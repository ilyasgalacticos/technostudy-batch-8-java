package week12.lesson1.example11;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        LocalDateTime current = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MMMM dd, hh:mm:ss a");
        System.out.println(formatter.format(current));

    }
}
