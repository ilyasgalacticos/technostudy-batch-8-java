package week5.lesson4;

import java.util.Scanner;

public class Task09StringV2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String text = in.next();
        for (int i = 0; i < text.length(); i++) {
            System.out.println(text.charAt(i));
        }
    }
}
