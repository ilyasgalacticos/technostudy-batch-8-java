package week12.lesson2.example2;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        long currentTime = System.currentTimeMillis();
        System.out.println(currentTime);

        Date date = new Date(currentTime + 20001000);
        System.out.println(date);

    }
}
