package week6.lesson1;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Example02RepeatString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String text = in.nextLine();
        System.out.println(text.length());
        System.out.println(text.charAt(6));
    }
}
