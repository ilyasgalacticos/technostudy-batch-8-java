package week6.lesson1;

import java.util.Scanner;

public class Example07RepeatString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        for (char i = 'a'; i <= 'z'; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 97; i <= 122; i++) {
            System.out.print((char) i + " ");
        }
    }
}
