package week3.lesson3;

import java.util.Scanner;

public class Example07Arrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<arr.length;i++){
            arr[i] = in.nextInt();
        }

        for(int i = 0; i<arr.length;i++){
            System.out.print((int) Math.pow(arr[i], 2) + " ");
        }
    }
}
