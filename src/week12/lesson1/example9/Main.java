package week12.lesson1.example9;

import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {

        Task task1 = new Task();
        task1.setName("Learn Java");
        task1.setIssuer("Ilyas");
        task1.setDeadline(LocalDateTime.of(2023, 05, 30, 2, 20, 20));

        System.out.println(task1.getInfo());

    }

}
