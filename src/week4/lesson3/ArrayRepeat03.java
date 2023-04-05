package week4.lesson3;

import java.util.Scanner;

public class ArrayRepeat03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // I inserted size of my array
        int arr[] = new int[n]; // I created new array with size - n, and named is as 'arr'

        for(int i = 0; i < arr.length ; i++){
            arr[i] = in.nextInt(); // I am inserting all numbers from console into array
        }

        for(int i = 0; i < arr.length ; i++){
            System.out.println(i + " - " + arr[i]);
        }
    }
}
