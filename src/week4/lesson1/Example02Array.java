package week4.lesson1;

import java.util.Scanner;

public class Example02Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        int max = arr[0]; // For me first element is a champion
        for(int i = 1; i < arr.length; i++){ // I am starting from 1, because I will not compare max with myself
            if(arr[i] > max){ // If we met with new champion
                max = arr[i]; // Our new champion
            }
        }
        System.out.println(max);
    }
}
