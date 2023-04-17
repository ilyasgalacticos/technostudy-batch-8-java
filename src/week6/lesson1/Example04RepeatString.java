package week6.lesson1;

import java.util.Scanner;

public class Example04RepeatString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String text = in.next(); // I am reading 1 char as String, if my input is "a"
        char symb = text.charAt(0); // symb.charAt(0) -> 'a'
        System.out.println(symb);
    }
}
