package week3.lesson3;

import java.util.Scanner;

public class Example04Arrays {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt(); // size of array
        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt(); // inserted n elements to array
        }

        for (int i = n - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
