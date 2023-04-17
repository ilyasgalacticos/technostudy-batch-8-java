package week5.lesson4;

import java.util.Scanner;

public class Task16String {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String text = in.next().toLowerCase();
        int count = 0;

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c == 'a' || c == 'e' || c == 'o' || c == 'i' || c == 'u') {
                count++;
            }
        }
        System.out.println(count);
    }
}
