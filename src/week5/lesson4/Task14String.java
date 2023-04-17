package week5.lesson4;

import java.util.Scanner;

public class Task14String {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String text = in.next();
        char[] textChar = new char[text.length()];

        for (int i = 0; i < textChar.length; i++) {
            textChar[i] = text.charAt(text.length() - 1 - i);
        }
        text = new String(textChar);
        System.out.println(text);
    }
}
