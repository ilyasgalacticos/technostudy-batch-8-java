package week12.lesson2.example4;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Date date = new Date("26 May 1989");
        //Date date = new Date(89, 4,26);
        System.out.println(date);

        date.setTime(2343435353344l);
        System.out.println(date);



    }
}
