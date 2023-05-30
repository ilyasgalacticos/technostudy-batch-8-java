package week12.lesson2.example5;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Date date1 = new Date("26 May 1989");
        Date date2 = new Date("11 January 1987");

        System.out.println(date1.before(date2));
        System.out.println(date1.after(date2));
        System.out.println(date1.equals(date2));

    }
}
