package week3.lesson4;

import java.util.Scanner;

public class Example11Arrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        double arr[] = new double[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextDouble();
        }

        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println(sum + " " + sum/arr.length);

    }
}
