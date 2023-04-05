package week4.lesson1;

import java.util.Scanner;

public class Example07Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        double[] arr = new double[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextDouble();
        }

        double max = arr[0], min = arr[0];
        double sum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
            sum = sum + arr[i];
        }

        sum = sum - max - min;
        double res = sum / (arr.length - 2);
        System.out.println(sum);
        System.out.println(res);

    }
}
