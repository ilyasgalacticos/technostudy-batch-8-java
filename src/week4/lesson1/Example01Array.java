package week4.lesson1;

import java.util.Scanner;

public class Example01Array {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        int prod = 1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0 && i % 2 == 0) {
                prod = prod * arr[i];
            }
        }
        System.out.println(prod);
    }
}
