package week6.lesson2;

import java.util.Scanner;

public class Example02Methods {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        toPrintText("Java", 10);
        toPrintText("C++", 5);
        toPrintText("Hello", 3);
    }

    public static void toPrintText(String text, int amount) {
       for(int i = 0; i < amount; i++){
           System.out.println(text);
       }
    }
}
