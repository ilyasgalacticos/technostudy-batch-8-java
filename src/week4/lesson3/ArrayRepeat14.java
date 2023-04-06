package week4.lesson3;

import java.util.Scanner;

public class ArrayRepeat14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double arr[] = new double[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextDouble();
        }

        double sum = 0;
        double count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                sum = sum + arr[i];
                count++;
            }
        }
        System.out.println(sum/count);
    }
}
