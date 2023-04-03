package week3.lesson4;

import java.util.Scanner;

public class Example09Arrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int house[] = new int[n];

        for (int i = 0; i < house.length; i++) {
            house[i] = in.nextInt();
        }

        int count = 0;

        for (int i = 0; i < house.length; i++) {
            if (house[i] > 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
