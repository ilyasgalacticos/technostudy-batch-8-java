package week5.lesson4;

import java.util.Scanner;

public class Task13StringV2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String text = in.next().toLowerCase();
        text = text.replace('a', 'o');
        System.out.println(text);
    }
}
