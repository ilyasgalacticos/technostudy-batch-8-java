package week5.lesson4;

import java.util.Scanner;

public class Task09String {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String text = in.next();

        char[] letters = text.toCharArray();

        for (int i = 0; i < letters.length; i++) {
            System.out.println(letters[i]);
        }
    }
}
