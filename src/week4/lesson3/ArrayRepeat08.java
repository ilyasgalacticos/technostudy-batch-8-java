package week4.lesson3;

import java.util.Scanner;

public class ArrayRepeat08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            if(i%2==0){
                System.out.print(arr[i] + " ");
            }
        }
    }
}
