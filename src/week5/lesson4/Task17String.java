package week5.lesson4;

import java.util.Scanner;

public class Task17String {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String text = in.next();
        int sum = 0;

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c >= '0' && c <= '9') {
                sum = sum + (c - '0');
            }
        }
        System.out.println(sum);
    }
}
