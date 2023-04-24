package week7.lesson1;

import java.util.Scanner;

public class Example02Methods {

    // Find maximum element in array by using method
    // Method will get an array as an argument, and return max number in it

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }

        System.out.println(getMax(array));
    }

    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

}
