package week3.lesson4;

import java.util.Scanner;

public class Example14Arrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        double sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        double average = sum / arr.length;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > average){
                System.out.print(arr[i] + " ");
            }
        }
    }
}
