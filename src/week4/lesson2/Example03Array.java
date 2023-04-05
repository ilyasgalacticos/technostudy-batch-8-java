package week4.lesson2;

import java.util.Scanner;

public class Example03Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        int zeros = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                zeros++;
            }
            if (zeros == 1) {
                sum = sum + arr[i];
            }
            if (zeros == 2) {
                break;
            }
        }
        System.out.println(sum);
    }
}
