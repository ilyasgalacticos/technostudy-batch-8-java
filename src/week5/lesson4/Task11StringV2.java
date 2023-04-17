package week5.lesson4;

import java.util.Scanner;

public class Task11StringV2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String number = in.next();
        int sum = 0;
        for (int i = 0; i < number.length(); i++) {
            sum = sum + number.charAt(i) - '0';
        }
        System.out.println(sum);
    }
}
