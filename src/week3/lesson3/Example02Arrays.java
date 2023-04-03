package week3.lesson3;

import java.util.Scanner;

public class Example02Arrays {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();   // I inserted size of array into n
        int arr[] = new int[n]; // I created an array with size - n

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt(); // I am inserting n elements from console to array
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " "); // I am printing all numbers from array
        }
    }
}
